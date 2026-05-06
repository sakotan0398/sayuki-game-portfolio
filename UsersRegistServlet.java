package sayukiGame.model.bo.scnarioDataLove;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.bo.scnarioDataCommon.Phase3;

public class LovePhase3 extends Phase3 {

    @Override
    public ScenarioData getScenario(int num, String pName) {
        
        // 0〜8 が選ばれた場合は、親クラス（Common）の共通の日常会話をそのまま呼び出す
        if (num <= 8) {
            return super.getScenario(num, pName);
        }

        // 9〜14：Loveルート専用（意識し始めているが、まだ素直になりきれない距離感）
        ScenarioData data = new ScenarioData();
        data.setPoolType("Love");

        switch (num) {
        case 9: // 重なる手（偶然の接触）
            data.setMessage(
                "[NAME:NONE]机の上の資料を取ろうと手を伸ばした瞬間、サユキの手と重なってしまった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「あっ……」" +
                "[NEXT]" +
                "[NAME:NONE]お互いに驚いて動きが止まる。ほんの一瞬だったが、彼女の体温を感じた。"
            );
            // シャッフル（1:Bad 2:Love 3:Like）
            data.setChoice1Text("あ、ごめん。邪魔した？");
            data.setChoice2Text("（黙って彼女が引くのを待つ）");
            data.setChoice3Text("ごめん、先使っていいよ");

            // 選択肢1：Bad（少し冷たい）
            data.setRes1(
                "[NAME:SAYUKI]「……邪魔って。別に、そういうわけじゃ……」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し傷ついたような顔をして、サッと手を引っ込めた。"
            );
            data.setC1Love(-1); data.setC1Like(0);

            // 選択肢2：Love（見つめ合う）
            data.setRes2(
                "[NAME:SAYUKI]「……っ。……あの、離してくれないと、資料取れないんですけど……」" +
                "[NEXT]" +
                "[NAME:NONE]文句を言いながらも、彼女自身もすぐに手を引こうとはしなかった。視線が絡み合う。"
            );
            data.setC2Love(4); data.setC2Like(0);

            // 選択肢3：Like（紳士的）
            data.setRes3(
                "[NAME:SAYUKI]「あ……はい。ありがとうございます」" +
                "[NEXT]" +
                "[NAME:NONE]少しだけ気まずい空気が流れたが、彼女は小さく会釈をして資料を引き寄せた。"
            );
            data.setC3Love(1); data.setC3Like(2);
            break;

        case 10: // 見つめる視線（無自覚な好意）
            data.setMessage(
                "[NAME:NONE]作業中、ふと横から視線を感じて顔を向けると、サユキがじっとこちらを見つめていた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……っ！？ ち、違います！ 今のはその……ボーッとしてただけで！」"
            );
            // シャッフル（1:Love 2:Like 3:Bad）
            data.setChoice1Text("俺の顔になんか付いてる？");
            data.setChoice2Text("疲れてるなら休んだら？");
            data.setChoice3Text("気が散るからやめて");

            // 選択肢1：Love（からかう）
            data.setRes1(
                "[NAME:SAYUKI]「付いてないですっ！ ただ……その、真剣にやってるなって思っただけで……」" +
                "[NEXT]" +
                "[NAME:NONE]言い訳をしながら、彼女は誤魔化すようにモニターの裏に隠れてしまった。"
            );
            data.setC1Love(4); data.setC1Like(1);

            // 選択肢2：Like（実務的な気遣い）
            data.setRes2(
                "[NAME:SAYUKI]「……はい。少し、目が疲れちゃったみたいです」" +
                "[NEXT]" +
                "[NAME:NONE]こちらの気遣いに、彼女はホッとしたように目頭を揉んだ。"
            );
            data.setC2Love(1); data.setC2Like(3);

            // 選択肢3：Bad（冷絶）
            data.setRes3(
                "[NAME:SAYUKI]「……すみません。もう見ませんから」" +
                "[NEXT]" +
                "[NAME:NONE]彼女はシュンとして画面に向き直った。少し言い過ぎたかもしれない。"
            );
            data.setC3Love(-2); data.setC3Like(-1);
            break;

        case 11: // 些細な変化（気づいてほしい）
            data.setMessage(
                "[NAME:NONE]今日のサユキさんは、いつもの大きなインテークではなく、髪を少し後ろに縛り大人っぽい雰囲気だった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……あの。今日、ちょっと気分を変えてみたんですけど……変じゃ、ないですか？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し落ち着かない様子で、後ろで縛った髪を指で弄っている。"
            );
            // シャッフル（1:Like 2:Bad 3:Love）
            data.setChoice1Text("気分転換は大事だね");
            data.setChoice2Text("いつもの方が気合入るんじゃない？");
            data.setChoice3Text("すごく似合ってると思う");

            // 選択肢1：Like（無難な肯定）
            data.setRes1(
                "[NAME:SAYUKI]「……そうですね。作業効率も上がりそうです」" +
                "[NEXT]" +
                "[NAME:NONE]無難な返しに、彼女は少しだけ残念そうな顔をして頷いた。"
            );
            data.setC1Love(1); data.setC1Like(2);

            // 選択肢2：Bad（否定）
            data.setRes2(
                "[NAME:SAYUKI]「……そうですか。せっかく少し早起きしたのに……」" +
                "[NEXT]" +
                "[NAME:NONE]分かりやすく落ち込ませてしまった。乙女心は難しい。"
            );
            data.setC2Love(-2); data.setC2Like(0);

            // 選択肢3：Love（素直に褒める）
            data.setRes3(
                "[NAME:SAYUKI]「ほ、本当ですか……？ お世辞でも、その……嬉しい、かも」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は顔を赤らめ、嬉しそうに髪を耳にかけた。"
            );
            data.setC3Love(5); data.setC3Like(0);
            break;

        case 12: // 少し先の未来（離れたくない）
            data.setMessage(
                "[NAME:SAYUKI]「……このプロジェクトが終わったら、" + pName + "さんはまた別の仕事に行っちゃうんですよね」" +
                "[NEXT]" +
                "[NAME:NONE]ふとした瞬間に、サユキさんが寂しそうな声で呟いた。"
            );
            // シャッフル（1:Love 2:Like 3:Bad）
            data.setChoice1Text("終わっても、また一緒に仕事できるよ");
            data.setChoice2Text("オンラインで連絡は取れるよ");
            data.setChoice3Text("そうだね、まあそういう業界だからね");

            // 選択肢1：Love（次を約束する）
            data.setRes1(
                "[NAME:SAYUKI]「……っ！ ほ、本当ですか？ 私、本気にしますからね……？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は驚いたように顔を上げ、期待を込めた瞳でこちらを見つめてきた。"
            );
            data.setC1Love(4); data.setC1Like(1);

            // 選択肢2：Like（現実的な繋がり）
            data.setRes2(
                "[NAME:SAYUKI]「……そうですね。次の仕事の相談とか、また乗ってくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]少しだけ寂しそうだったが、仕事仲間としての繋がりを確認し合えた。"
            );
            data.setC2Love(1); data.setC2Like(3);

            // 選択肢3：Bad（ドライ）
            data.setRes3(
                "[NAME:SAYUKI]「……あなたって、本当にドライですよね。別に、寂しくなんかないですけど」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は唇を噛み締め、無理に強がってみせた。"
            );
            data.setC3Love(-2); data.setC3Like(-1);
            break;

        case 13: // 無防備な距離感
            data.setMessage(
                "[NAME:SAYUKI]「" + pName + "さん、ここの描写、少し細かく描き込みすぎたでしょうか……？」" +
                "[NEXT]" +
                "[NAME:NONE]画面を見せるため、サユキが椅子ごとすり寄ってきた。肩が触れ合いそうな距離だ。" +
                "[NEXT]" +
                "[NAME:NONE]ほのかに甘いシャンプーの香りがして、思わず意識してしまう。"
            );
            // シャッフル（1:Bad 2:Love 3:Like）
            data.setChoice1Text("近すぎるよ、見えにくい");
            data.setChoice2Text("（少しだけ彼女の方へ顔を寄せる）");
            data.setChoice3Text("細部まで凝っててすごく良いよ");

            // 選択肢1：Bad（拒絶）
            data.setRes1(
                "[NAME:SAYUKI]「……っ、すみません。汗臭かったですか……？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は傷ついたような顔をして、慌てて椅子を遠ざけた。"
            );
            data.setC1Love(-2); data.setC1Like(-1);

            // 選択肢2：Love（意識させる）
            data.setRes2(
                "[NAME:SAYUKI]「……っ！？ あ、あの、近、いです……っ」" +
                "[NEXT]" +
                "[NAME:NONE]こちらの意図的な距離の詰めに気づいたのか、彼女は肩をビクッと震わせ、顔を真っ赤にして固まってしまった。"
            );
            data.setC2Love(4); data.setC2Like(0);

            // 選択肢3：Like（真面目に答える）
            data.setRes3(
                "[NAME:SAYUKI]「本当ですか？ よかった……！ じゃあ、この方向性で進めますね！」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は嬉しそうに微笑み、距離が近いことには全く気づいていないようだった。"
            );
            data.setC3Love(1); data.setC3Like(3);
            break;

        case 14: // ほんの少しの嫉妬
            data.setMessage(
                "[NAME:NONE]スマホにフリーランスの仕事仲間（女性）からメッセージが届き、思わずクスッと笑ってしまった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……なんなんですか。随分と楽しそうですね、そのメッセージ」" +
                "[NEXT]" +
                "[NAME:NONE]サユキがジト目でこちらを睨んでいる。なんだか不機嫌そうだ。"
            );
            // シャッフル（1:Like 2:Bad 3:Love）
            data.setChoice1Text("ただの仕事仲間の連絡だよ");
            data.setChoice2Text("サユキさんには関係ないでしょ");
            data.setChoice3Text("なんで？ 気になる？");

            // 選択肢1：Like（誠実に答える）
            data.setRes1(
                "[NAME:SAYUKI]「ふーん……。まあ、仕事ならいいですけど。早く終わらせてくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]納得はしたようだが、まだ少し疑っているような目をしている。"
            );
            data.setC1Love(1); data.setC1Like(2);

            // 選択肢2：Bad（突き放す）
            data.setRes2(
                "[NAME:SAYUKI]「……っ。そうですね、私には関係ないです。仕事の邪魔してすみませんでした」" +
                "[NEXT]" +
                "[NAME:NONE]声のトーンが急激に下がり、完全にそっぽを向かれてしまった。"
            );
            data.setC2Love(-3); data.setC2Like(-2);

            // 選択肢3：Love（からかって反応を見る）
            data.setRes3(
                "[NAME:SAYUKI]「……っ！！ き、気になんてしてませんっ！ ただ、仕事中にニヤニヤしてるのが気になっただけで！」" +
                "[NEXT]" +
                "[NAME:NONE]図星を突かれたのか、彼女はムキになって否定したが、手元のペンの動きは完全に止まっていた。"
            );
            data.setC3Love(4); data.setC3Like(0);
            break;

        default:
            return super.getScenario(0, pName);
        }
        return data;
    }
}