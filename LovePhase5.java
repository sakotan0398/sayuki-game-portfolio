package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.beans.VisualBeans; // 💡 追加

public class Phase0 {

	public ScenarioData getScenario(int num, String pName) {
		ScenarioData data = new ScenarioData();
		data.setPoolType("Common");

		switch (num) {
		case 0: // 💡 ステップ0：廊下（誰もいない状態）
			data.setMessage(
					"[NAME:NONE]知人の紹介で間借りすることになったSOHOオフィス。<br>古い雑居ビルの廊下を進み、指定された部屋の前に立つ。" +
					"[NEXT]" +
					"[NAME:PLAYER]（……ここだな。静かだけど、誰かいるんだろうか）");

			// 🌟 初期状態：背景は廊下、キャラ画像は無し（空文字）、演出は無し
			data.setVisuals(new VisualBeans("", "bg067800600.jpg", "none", "normal")); 

			data.setChoice1Text("扉をノックして開ける");
			data.setChoice2Text("無言で扉を開ける");
			data.setChoice3Text("……やっぱり帰ろうかな（冗談）");

			// 選択後のリアクションテキスト
			data.setRes1("[NAME:NONE]コンコン、と軽くノックをしてからドアノブを回した。");
			data.setRes2("[NAME:NONE]少し緊張しながら、音を立てないようにゆっくりとドアを開けた。");
			data.setRes3("[NAME:NONE]……いや、そういうわけにはいかない。意を決して扉を開けた。");
			
			// リアクション後の画像：背景をアトリエに切り替えるが、キャラはまだ出さない
			// 背景が変わることで「部屋に入った感」を演出します
			VisualBeans enterRoomVisual = new VisualBeans("", "bg06819201440.jpg", "none", "normal");
			data.setRes1Visuals(enterRoomVisual);
			data.setRes2Visuals(enterRoomVisual);
			data.setRes3Visuals(enterRoomVisual);
			
			data.setScenarioId(0);
			break;

		case 1: // ステップ1：アトリエ・サユキ登場！
			// 部屋に入った直後：まだサユキは見えていない状態をキープ
			data.setVisuals(new VisualBeans("", "bg06819201440.jpg", "none", "normal"));

			data.setMessage(
					"[NAME:NONE]ガチャリとドアを開けると……薄暗い室内で、モニターの光だけが煌々と輝いていた。" +
					"[NEXT]" +
					"[NAME:NONE]そして、そこには――特徴的な髪型に、派手なパーカーを着た少女が座っていた。" +
					"[NEXT]" +
					"[NAME:PLAYER]（……なんだ、あのすごい格好の女の子は……？）" +
					"[NEXT]" +
					"[NAME:NONE]立ち尽くしていると、キーボードを叩く手を止め、彼女がこちらを振り返った。" +
					"[NEXT]" +
					// 🌟 ここで画像を表示！同時にJSが走って、サユキちゃんがシュッと現れます！
					"[IMG:Sayuki_surprised.png]" + 
					"[NAME:SAYUKI]「……っ！？ 誰ですか、あなた！？ ここ、私の作業場なんですけど！」");

			data.setChoice1Text("今日からここを使う" + pName + "です");
			data.setChoice2Text("こんにちは！ルームメイトですね");
			data.setChoice3Text("……すごい服ですね");

			// 選択肢1：普通に返す
			data.setRes1(
					"[NAME:SAYUKI]「……ああ、オーナーが言っていたプログラマーさんですか」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「サユキです。……お互い、干渉せずに自分の仕事をしましょう。よろしくお願いします」");
			data.setC1Love(0); data.setC1Like(2);
			// 💡 演出：ムスッとした顔に、フワッと（cross_fade）切り替える
			data.setRes1Visuals(new VisualBeans("Sayuki_musu.png", "bg06819201440.jpg", "cross_fade", "normal"));

			// 選択肢2：距離を詰める
			data.setRes2(
					"[NAME:SAYUKI]「ルームメイトって……ここはただのシェアオフィスです。勘違いしないでください」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「私は私で集中したいので、あまり話しかけないでくださいね」");
			data.setC2Love(1); data.setC2Like(0);
			// 💡 演出：ジト目にフェードで切り替え
			data.setRes2Visuals(new VisualBeans("Sayuki_jitome.png", "bg06819201440.jpg", "cross_fade", "normal"));

			// 選択肢3：怒らせる
			data.setRes3(
					"[NAME:SAYUKI]「……は？ 初対面の人にいきなりそれですか？ デリカシーって知ってます？」" +
					"[NEXT]" +
					"[NAME:SAYUKI]「迫田サユキです。私の作業の邪魔だけはしないでください」");
			data.setC3Love(2); data.setC3Like(-1);
			// 💡 演出：怒った笑顔で威圧感を出す！
			data.setRes3Visuals(new VisualBeans("Sayuki_scary_smile.png", "bg06819201440.jpg", "cross_fade", "close_up"));
			
			data.setScenarioId(1);
			break;
		}
		return data;
	}
}