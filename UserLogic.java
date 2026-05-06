package sayukiGame.model.bo.scnarioDataLike;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.bo.scnarioDataCommon.Phase3;

public class LikePhase3 extends Phase3 {

	    @Override
	    public ScenarioData getScenario(int num, String pName) {
	        
	        // 0〜8 が選ばれた場合は、親クラス（Common）の共通の日常会話をそのまま呼び出す
	        if (num <= 8) {
	            return super.getScenario(num, pName);
	        }

	        // 9〜14：Likeルート専用（プロ同士の深い信頼、戦友としての絆）
	        ScenarioData data = new ScenarioData();
	        data.setPoolType("Like");

	        switch (num) {
	        case 9: // 徹夜明けのハイタッチ
	            data.setMessage(
	                "[NAME:SAYUKI]「……よしっ！ こっちの組み込み、全部終わりました！！」" +
	                "[NEXT]" +
	                "[NAME:NONE]大きな仕様変更の壁を、手伝い二人で夜通し作業してようやく乗り越えた瞬間だった。"
	            );
	            // シャッフル（1:Bad 2:Like 3:Love）
	            data.setChoice1Text("やっとか……限界だ、寝る");
	            data.setChoice2Text("（無言でハイタッチを求める）");
	            data.setChoice3Text("お疲れ様！（ポンッと肩を叩く）");

	            // 選択肢1：Bad（テンションを下げる）
	            data.setRes1(
	                "[NAME:SAYUKI]「……もう。せっかくの達成感に水差さないでくださいよ。お疲れ様でした」" +
	                "[NEXT]" +
	                "[NAME:NONE]彼女のテンションを下げてしまった。確かに眠いが、少し申し訳ない。"
	            );
	            data.setC1Love(0); data.setC1Like(-2);

	            // 選択肢2：Like（無言の共闘感・大正解）
	            data.setRes2(
	                "[NAME:SAYUKI]「……ふふっ、はいっ！」" +
	                "[NEXT]" +
	                "[NAME:NONE]パァンッ！と、アトリエに心地よい音が響いた。言葉はなくても、最高の相棒だ。"
	            );
	            data.setC2Love(0); data.setC2Like(5);

	            // 選択肢3：Love（スキンシップ）
	            data.setRes3(
	                "[NAME:SAYUKI]「っ！？ ……あ、ありがとうございます。その、" + pName + "さんも、お疲れ様でした……」" +
	                "[NEXT]" +
	                "[NAME:NONE]肩に触れると、彼女はビクッとして少し俯いた。戦友というより、女の子の顔になっていた。"
	            );
	            data.setC3Love(3); data.setC3Like(1);
	            break;

	        case 10: // アイデアの壁打ち
	            data.setMessage(
	                "[NAME:SAYUKI]「……うーん。このUIの遷移、どうもテンポが悪い気がして……」" +
	                "[NEXT]" +
	                "[NAME:NONE]サユキさんが頭を抱えながら、画面と睨めっこしている。"
	            );
	            // シャッフル（1:Love 2:Bad 3:Like）
	            data.setChoice1Text("悩んでる顔もいいね");
	            data.setChoice2Text("俺はサユキさんほど絵のことは分からないから");
	            data.setChoice3Text("一緒に仕様の整理をしようか");

	            // 選択肢1：Love（からかう）
	            data.setRes1(
	                "[NAME:SAYUKI]「……は？ 今、真面目に考えてるんですけど。からかわないでください」" +
	                "[NEXT]" +
	                "[NAME:NONE]怒られてしまったが、彼女の耳は少し赤かった。"
	            );
	            data.setC1Love(3); data.setC1Like(0);

	            // 選択肢2：Bad（突き放す）
	            data.setRes2(
	                "[NAME:SAYUKI]「……冷たいですね。少し意見を聞きたかっただけなのに」" +
	                "[NEXT]" +
	                "[NAME:NONE]仲間としての連帯感を削いでしまった。"
	            );
	            data.setC2Love(-1); data.setC2Like(-2);

	            // 選択肢3：Like（最強のブレスト相手）
	            data.setRes3(
	                "[NAME:SAYUKI]「！ はい、お願いします！ プログラマー視点からの意見も欲しかったんです」" +
	                "[NEXT]" +
	                "[NAME:NONE]ホワイトボードに付箋を貼り合いながら、二人で最高のアイデアを練り上げた。"
	            );
	            data.setC3Love(1); data.setC3Like(4);
	            break;

	        case 11: // 作品を預ける
	            data.setMessage(
	                "[NAME:SAYUKI]「……これ。今回のメインビジュアルのデータです。一番気合い、入れました」" +
	                "[NEXT]" +
	                "[NAME:NONE]サユキさんが、USBメモリを差し出してきた。彼女の「魂」とも言えるデータだ。"
	            );
	            // シャッフル（1:Like 2:Love 3:Bad）
	            data.setChoice1Text("最高のコードで組み込んでみせるよ");
	            data.setChoice2Text("サユキさんみたいに可愛い絵だね");
	            data.setChoice3Text("データ、結構重いね");

	            // 選択肢1：Like（プロとしての約束・大正解）
	            data.setRes1(
	                "[NAME:SAYUKI]「……ふふ。はい、信じてます。私の絵に、最高の魔法をかけてくださいね、相棒？」" +
	                "[NEXT]" +
	                "[NAME:NONE]挑発するような、でも絶大な信頼の込められた瞳で微笑まれた。"
	            );
	            data.setC1Love(1); data.setC1Like(5);

	            // 選択肢2：Love（照れさせる）
	            data.setRes2(
	                "[NAME:SAYUKI]「なっ……！？ 絵の感想じゃなくて、私の感想じゃないですかそれ！」" +
	                "[NEXT]" +
	                "[NAME:NONE]彼女は慌ててそっぽを向いた。クリエイターとしては複雑な褒め言葉だったようだ。"
	            );
	            data.setC2Love(4); data.setC2Like(0);

	            // 選択肢3：Bad（無粋）
	            data.setRes3(
	                "[NAME:SAYUKI]「……物理的な容量の話なんかしてません。台無しです」" +
	                "[NEXT]" +
	                "[NAME:NONE]呆れられてしまった。少しロマンが足りなかったようだ。"
	            );
	            data.setC3Love(0); data.setC3Like(-3);
	            break;

	        case 12: // プロとしての尊敬
	            data.setMessage(
	                "[NAME:NONE]サユキの隣で、高速でエラーの修正とデバッグ作業を終わらせた。" +
	                "[NEXT]" +
	                "[NAME:SAYUKI]「……" + pName + "さんって、本当にすごいですよね。私には、その画面が呪文にしか見えません」"
	            );
	            // シャッフル（1:Bad 2:Like 3:Love）
	            data.setChoice1Text("プロならこれくらい当然だよ");
	            data.setChoice2Text("お互いの得意分野で、最高のゲームが作れたら面白そうですね");
	            data.setChoice3Text("俺もサユキさんの絵にはいつも見惚れてるよ");

	            // 選択肢1：Bad（鼻にかける）
	            data.setRes1(
	                "[NAME:SAYUKI]「……そうですか。素直に褒めた私がバカみたいですね」" +
	                "[NEXT]" +
	                "[NAME:NONE]謙虚さが足りなかったようだ。少し空気が冷めた。"
	            );
	            data.setC1Love(-1); data.setC1Like(-2);

	            // 選択肢2：Like（並び立つプロ・大正解）
	            data.setRes2(
	                "[NAME:SAYUKI]「そうですね。私のデザインと貴方のコード……きっと、誰も見たことない作品になりますね」" +
	                "[NEXT]" +
	                "[NAME:NONE]お互いの技術への絶対的なリスペクト。これ以上ない関係だ。"
	            );
	            data.setC2Love(1); data.setC2Like(4);

	            // 選択肢3：Love（好意を伝える）
	            data.setRes3(
	                "[NAME:SAYUKI]「み、見惚れるって……大袈裟ですよ。……でも、ありがとうございます」" +
	                "[NEXT]" +
	                "[NAME:NONE]彼女は照れ隠しのように髪を弄った。悪くない反応だ。"
	            );
	            data.setC3Love(4); data.setC3Like(0);
	            break;

	        case 13: // コーヒーで乾杯
	            data.setMessage(
	                "[NAME:NONE]大きな進捗があった夜。休憩がてら、二人で買ってきた缶コーヒーを開けた。" +
	                "[NEXT]" +
	                "[NAME:SAYUKI]「今日は本当に進んでそうでしたね。……乾杯、します？」"
	            );
	            // シャッフル（1:Love 2:Bad 3:Like）
	            data.setChoice1Text("サユキさんの魅力に乾杯");
	            data.setChoice2Text("早く飲んで仕事に戻ろう");
	            data.setChoice3Text("俺たちの最強のゲームに乾杯");

	            // 選択肢1：Love（キザ）
	            data.setRes1(
	                "[NAME:SAYUKI]「……はぁ。貴方って、たまに本当にキザですよね。……まあ、今日だけは許してあげます」" +
	                "[NEXT]" +
	                "[NAME:NONE]呆れつつも、彼女はそっと自分の缶をこちらに当ててきた。"
	            );
	            data.setC1Love(3); data.setC1Like(1);

	            // 選択肢2：Bad（作業優先すぎる）
	            data.setRes2(
	                "[NAME:SAYUKI]「……せっかくの気分転換なのに。余裕がない人は嫌われますよ」" +
	                "[NEXT]" +
	                "[NAME:NONE]一人で缶を開け、不満そうに一口飲んで作業に戻ってしまった。"
	            );
	            data.setC2Love(-1); data.setC2Like(-2);

	            // 選択肢3：Like（最強のバディ・大正解）
	            data.setRes3(
	                "[NAME:SAYUKI]「はいっ！ ……完成まで、頑張ってください！」" +
	                "[NEXT]" +
	                "[NAME:NONE]カチンッ、と小気味良い音を立てて缶をぶつける。熱い決意を共有できた。"
	            );
	            data.setC3Love(0); data.setC3Like(5);
	            break;

	        case 14: // 「相棒」の称号
	            data.setMessage(
	                "[NAME:SAYUKI]「……最初は変な人だと思ってたのに。まさか、ここまで息が合うなんて」" +
	                "[NEXT]" +
	                "[NAME:NONE]サユキがふとモニターから目を離し、柔らかい表情でこちらを見た。" +
	                "[NEXT]" +
	                "[NAME:SAYUKI]「今ではすっかり、私の『相棒』ですね。" + pName + "さん」"
	            );
	            // シャッフル（1:Like 2:Love 3:Bad）
	            data.setChoice1Text("俺も、最高の相棒だと思ってるよ");
	            data.setChoice2Text("相棒以上には、なれないかな？");
	            data.setChoice3Text("ただの場所貸し・仕事仲間でしょ？");

	            // 選択肢1：Like（最高の関係値・大正解）
	            data.setRes1(
	                "[NAME:SAYUKI]「……ふふ。なら、背中は任せましたよ。これからも、無茶な要求しますからね」" +
	                "[NEXT]" +
	                "[NAME:NONE]彼女のイタズラっぽい笑顔に、こちらも全力で応えることを誓った。"
	            );
	            data.setC1Love(1); data.setC1Like(5); // Likeエンドへの強烈なフラグ

	            // 選択肢2：Love（踏み込む）
	            data.setRes2(
	                "[NAME:SAYUKI]「……っ。じょ、冗談言わないでください。……これだから貴方は……っ」" +
	                "[NEXT]" +
	                "[NAME:NONE]彼女は顔を真っ赤にして口ごもった。相棒以上の関係も、悪くはないかもしれない。"
	            );
	            data.setC2Love(5); data.setC2Like(0); // Loveへの強烈なフラグ

	            // 選択肢3：Bad（冷絶）
	            data.setRes3(
	                "[NAME:SAYUKI]「……そうですか。少しでも認めた私が馬鹿でした。さっさと仕事してください」" +
	                "[NEXT]" +
	                "[NAME:NONE]かつてないほど冷たい声を出されてしまった。取り返しのつかないことを言ったかもしれない。"
	            );
	            data.setC3Love(-3); data.setC3Like(-4);
	            break;

	        default:
	            return super.getScenario(0, pName);
	        }
	        return data;
	    }
	}