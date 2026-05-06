package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.beans.VisualBeans; // 💡 追加

public class PhaseED {

	public ScenarioData getScenario(String type, String pName) {
		ScenarioData data = new ScenarioData();
		data.setPoolType("ED");
		String bg = "bg_atelier_sunset.jpg"; // 夕暮れのアトリエ（エモい背景）

		switch (type) {
		case "True":
			// 🌟 True End: 最高のパートナー兼恋人
			data.setMessage(
					"[NAME:NONE]納品から数日後。夕暮れのアトリエで、サユキがこちらを真っ直ぐに見つめてきた。" +
					"[NEXT]" +
					// 💡 演出：カメラを思い切り寄せて（close_up）、照れ顔をゆっくり表示（cross_fade）
					"[IMG:Sayuki_mesorasi_tere.png]" +
					"[NAME:SAYUKI]「……ねえ、覚えていますか？ ここで初めて会った日のこと」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「あの時、私一人で十分だって思ってた。でも……貴方のコードと、私のデザイン。二人が揃わなきゃ、この奇跡は起きなかった」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「私、もう貴方のいない人生なんて考えられない。……公私ともに、一生私の隣にいてくれませんか？」");
			// 最初は風景だけ見せておく
			data.setVisuals(new VisualBeans(bg, "", "none", "normal"));
			// 最終的な状態をセット（念のため）
			data.setRes1Visuals(new VisualBeans(bg, "Sayuki_mesorasi_tere.png", "cross_fade", "close_up"));
			break;

		case "Love":
			// 🌟 Love End: 最高の恋人
			data.setMessage(
					"[NAME:NONE]プロジェクトは無事終了した。帰り際、サユキが俺の袖をギュッと掴んだ。" +
					"[NEXT]" +
					// 💡 演出：不安そうに、横からひょっこり覗き込むように登場（side_peek）
					"[IMG:Sayuki_anxiety.png]" +
					"[NAME:SAYUKI]「……あの、仕事が終わっても……明日からも、会いに来ていいですか？」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「プログラマーとしてじゃなくて……その……。サユキが、貴方に会いたいんです」");
			data.setVisuals(new VisualBeans(bg, "", "none", "normal"));
			data.setRes1Visuals(new VisualBeans(bg, "Sayuki_anxiety.png", "side_peek", "normal"));
			break;

		case "Like":
			// 🌟 Like End: 最高のバディ（戦友）
			data.setMessage(
					"[NAME:NONE]マスターアップ完了の瞬間。俺たちは力強く握手を交わした。" +
					"[NEXT]" +
					// 💡 演出：元気よく下からスライドイン（slide_up）
					"[IMG:Sayuki_nomal.png]" +
					"[NAME:SAYUKI]「……最高の仕事でした！ 貴方という相棒に出会えたこと、私の誇りです」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「さあ、次はどんな伝説を作りましょうか？ 準備はいいですよね、パートナー！」");
			data.setVisuals(new VisualBeans(bg, "", "none", "normal"));
			data.setRes1Visuals(new VisualBeans(bg, "Sayuki_nomal.png", "slide_up", "normal"));
			break;

		default: 
			// 🌟 Bad End (Normal End): 普通の知り合い
			data.setMessage(
					"[NAME:NONE]1年に及ぶ共同制作の契約期間が、今日で終わる。" +
					"[NEXT]" +
					// 💡 演出：事務的な態度で、淡々とフェードイン（cross_fade）
					"[IMG:Sayuki_dakara_syomen.png]" +
					"[NAME:SAYUKI]「……お疲れ様でした。色々と、勉強になりました」" +
					"[NEXT]" +
					// 💡 最後にスッと消える（フェードアウト）
					"[IMG:NONE]" +
					"[NAME:NONE]淡々とした言葉。サユキはすでに、次の仕事のためにモニターへと向き直っていた。");
			data.setVisuals(new VisualBeans(bg, "", "none", "normal"));
			// 最終的に画像は非表示になる
			data.setRes1Visuals(new VisualBeans(bg, "", "cross_fade", "normal"));
			break;
		}
		return data;
	}
}