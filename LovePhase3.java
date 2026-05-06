package sayukiGame.model.bo;

import sayukiGame.model.beans.Player;
import sayukiGame.model.beans.Sayuki_Sakota;
import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.dao.SayukiGameDAO;

public class SayukiGameLogic {

	// すべての会話データを取得するメソッド
	public ScenarioData getScenarioData(int phaseLevel, int scenarioNum, Player p, Sayuki_Sakota s) {
		String pName = p.getName();

		// 1. イベント中（Phase 99）
		if (phaseLevel == 99) {
			return new Ivent_fess().getScenario(scenarioNum, pName, s);
		}

		// 2. エピローグ（Phase 6）
		if (phaseLevel == 6) {
			String edType = "Bad";
			if (s.getLovePoint() >= 80 && s.getLikePoint() >= 80) edType = "True";
			else if (s.getLovePoint() >= 80) edType = "Love";
			else if (s.getLikePoint() >= 80) edType = "Like";
			return new sayukiGame.model.bo.scnarioDataCommon.PhaseED().getScenario(edType, pName);
		}

		// 3. Phase 3以降（ルート分岐）
		if (phaseLevel >= 3) {
			int loveP = s.getLovePoint();
			int likeP = s.getLikePoint();
			int lLv = Math.min(5, (loveP / 20) + 1);
			int iLv = Math.min(5, (likeP / 20) + 1);

			if (phaseLevel == 3) {
				if (lLv >= 3 && iLv >= 3) return new sayukiGame.model.bo.scnarioDataTrue.TruePhase3().getScenario(scenarioNum, pName);
				if (lLv >= 3) return new sayukiGame.model.bo.scnarioDataLove.LovePhase3().getScenario(scenarioNum, pName);
				if (iLv >= 3) return new sayukiGame.model.bo.scnarioDataLike.LikePhase3().getScenario(scenarioNum, pName);
				return new sayukiGame.model.bo.scnarioDataCommon.Phase3().getScenario(scenarioNum, pName);
			}
			if (phaseLevel == 4) {
				if (lLv >= 4 && iLv >= 4) return new sayukiGame.model.bo.scnarioDataTrue.TruePhase4().getScenario(scenarioNum, pName);
				if (lLv >= 4) return new sayukiGame.model.bo.scnarioDataLove.LovePhase4().getScenario(scenarioNum, pName);
				if (iLv >= 4) return new sayukiGame.model.bo.scnarioDataLike.LikePhase4().getScenario(scenarioNum, pName);
				return new sayukiGame.model.bo.scnarioDataCommon.Phase4().getScenario(scenarioNum, pName);
			}
			if (phaseLevel == 5) {
				if (lLv >= 5 && iLv >= 5) return new sayukiGame.model.bo.scnarioDataTrue.TruePhase5().getScenario(scenarioNum, pName);
				if (lLv >= 5) return new sayukiGame.model.bo.scnarioDataLove.LovePhase5().getScenario(scenarioNum, pName);
				if (iLv >= 5) return new sayukiGame.model.bo.scnarioDataLike.LikePhase5().getScenario(scenarioNum, pName);
				return new sayukiGame.model.bo.scnarioDataCommon.Phase5().getScenario(scenarioNum, pName);
			}
		}

		// 4. Phase 0〜2（共通）
		switch (phaseLevel) {
			case 0: return new sayukiGame.model.bo.scnarioDataCommon.Phase0().getScenario(scenarioNum, pName);
			case 1: return new sayukiGame.model.bo.scnarioDataCommon.Phase1().getScenario(scenarioNum, pName);
			case 2: return new sayukiGame.model.bo.scnarioDataCommon.Phase2().getScenario(scenarioNum, pName);
			default: return new sayukiGame.model.bo.scnarioDataCommon.Phase0().getScenario(scenarioNum, pName);
		}
	}

	// ターンのメイン処理（引数に userId を追加）
	public ScenarioData processTurn(int choice, int lastPhase, int lastNum, Sayuki_Sakota s, Player p, String userId) {
		String reaction = "";
		ScenarioData lastData = getScenarioData(lastPhase, lastNum, p, s);

		// --- 1. ポイント加算処理 ---
		if (lastData != null) {
			if (lastPhase == 99) {
				if (choice == 1) s.setEventScore(s.getEventScore() + lastData.getC1Love());
				else if (choice == 2) s.setEventScore(s.getEventScore() + lastData.getC2Love());
				else s.setEventScore(s.getEventScore() + lastData.getC3Love());
				reaction = (choice == 1) ? lastData.getRes1() : (choice == 2) ? lastData.getRes2() : lastData.getRes3();
			} else {
				if (choice == 1) { s.addLovePoint(lastData.getC1Love()); s.addLikePoint(lastData.getC1Like()); reaction = lastData.getRes1(); }
				else if (choice == 2) { s.addLovePoint(lastData.getC2Love()); s.addLikePoint(lastData.getC2Like()); reaction = lastData.getRes2(); }
				else { s.addLovePoint(lastData.getC3Love()); s.addLikePoint(lastData.getC3Like()); reaction = lastData.getRes3(); }
			}
		}

		// --- 2. 次の会話の決定 ---
		int lovePhase = Math.min(5, (s.getLovePoint() / 20) + 1);
		int likePhase = Math.min(5, (s.getLikePoint() / 20) + 1);
		int currentPhase = Math.max(lovePhase, likePhase);
		int currentTurn = s.getCurrentTurn();
		ScenarioData nextData = null;

		// 🌟 【分岐管理】 51週目が終わったらエピローグへ & 実績保存
		if (currentTurn == 51 && lastPhase != 6 && lastPhase != 99) {
			String edType = "Bad";
			if (s.getLovePoint() >= 80 && s.getLikePoint() >= 80) edType = "True";
			else if (s.getLovePoint() >= 80) edType = "Love";
			else if (s.getLikePoint() >= 80) edType = "Like";

			// 💡 IDを使ってDB保存
			new SayukiGameDAO().updateClearStatus(userId, edType);

			nextData = getScenarioData(6, 0, p, s);
			nextData.setScenarioId(0);
			nextData.setPhaseLevel(6);
		} 
		else if (lastPhase == 99 && lastNum < 5) {
			int nextStep = lastNum + 1;
			nextData = getScenarioData(99, nextStep, p, s);
			nextData.setScenarioId(nextStep);
			nextData.setPhaseLevel(99);
		} 
		else if (currentTurn == 20 && lovePhase >= 2 && lastPhase != 99) {
			s.setEventScore(0);
			nextData = getScenarioData(99, 1, p, s);
			nextData.setScenarioId(1);
			nextData.setPhaseLevel(99);
		} 
		else if (lastPhase == 0 && lastNum == 0) {
			nextData = getScenarioData(0, 1, p, s);
			nextData.setScenarioId(1);
			nextData.setPhaseLevel(0);
		} 
		else {
			if (lastPhase == 99) s.setEventScore(0);
			int nextNum;
			int maxScenarios = (currentPhase >= 3) ? 15 : 10;
			do { nextNum = new java.util.Random().nextInt(maxScenarios); } while (nextNum == lastNum);
			nextData = getScenarioData(currentPhase, nextNum, p, s);
			nextData.setScenarioId(nextNum);
			nextData.setPhaseLevel(currentPhase);
		}

		// --- 3. メッセージ合体 ---
		String fullMessage = (reaction != null && !reaction.isEmpty()) ? reaction + "[NEXT]" + nextData.getMessage() : nextData.getMessage();
		nextData.setMessage(fullMessage);

		return nextData;
	}

	public String checkEnding(Sayuki_Sakota s) {
		boolean isLoveHigh = s.getLovePoint() >= 80;
		boolean isLikeHigh = s.getLikePoint() >= 80;
		if (isLoveHigh && isLikeHigh) return "True End：最高のパートナー兼恋人";
		if (isLoveHigh) return "Love End：最高の恋人";
		if (isLikeHigh) return "Like End：最高のバディ";
		return "Normal End：普通の友人・知り合い";
	}

	public String getCalendarDate(int turn) {
		int[] weeksInMonth = { 4, 5, 4, 5, 4, 4, 5, 4, 5, 4, 4, 4 };
		int tempTurn = turn;
		int currentMonth = 4;
		for (int i = 0; i < 12; i++) {
			if (tempTurn <= weeksInMonth[i]) {
				currentMonth = (4 + i > 12) ? 4 + i - 12 : 4 + i;
				String season = (currentMonth >= 3 && currentMonth <= 5) ? "🌸 春" : (currentMonth >= 6 && currentMonth <= 8) ? "🌻 夏" : (currentMonth >= 9 && currentMonth <= 11) ? "🍂 秋" : "⛄ 冬";
				return season + " " + currentMonth + "月 第" + tempTurn + "週";
			}
			tempTurn -= weeksInMonth[i];
		}
		return "不明な日付";
	}
}