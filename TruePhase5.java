package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;

public class Phase3 {

    // 子クラスから上書きできるように public にする
    public ScenarioData getScenario(int num, String pName) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Common");

        switch (num) {
        case 0: // 距離感の変化
            data.setMessage(
                "[NAME:NONE]作業中、ふと気づくとサユキさんとのデスクの距離が、出会った頃よりずっと近くなっていた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ん？ どうかしましたか、" + pName + "さん」"
            );
            data.setChoice1Text("いや、距離近くなったなって");
            data.setChoice2Text("なんでもないよ、集中しよっか");
            data.setChoice3Text("もっと近くに寄る");

            data.setRes1(
                "[NAME:SAYUKI]「……あ。……本当ですね。嫌、ですか？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し上目遣いで、こちらの反応を伺ってきた。"
            );
            data.setC1Love(3); data.setC1Like(1);

            data.setRes2(
                "[NAME:SAYUKI]「ふふ、そうですね。このタスク、今日中に終わらせちゃいましょう」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は柔らかく微笑み、再び画面に向かった。"
            );
            data.setC2Love(0); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「ちょっ、近すぎです！ 気が散るからやめてくださいーっ！」" +
                "[NEXT]" +
                "[NAME:NONE]顔を真っ赤にして怒られてしまった。少しやりすぎたようだ。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            break;

        case 1: // 自然な差し入れ
            data.setMessage(
                "[NAME:NONE]休憩がてら、サユキさんのデスクに無言で温かい紅茶を置いた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「あ……ありがとうございます。" + pName + "さんって、いつも私が欲しいタイミングでくれますよね」"
            );
            data.setChoice1Text("よく見てるからね");
            data.setChoice2Text("俺も飲みたかったついでだよ");
            data.setChoice3Text("そろそろ俺にも何か奢ってよ");

            data.setRes1(
                "[NAME:SAYUKI]「……っ。そういうこと、サラッと言わないでください。……照れるじゃないですか」" +
                "[NEXT]" +
                "[NAME:NONE]マグカップで顔を半分隠しながら、彼女は嬉しそうに呟いた。"
            );
            data.setC1Love(4); data.setC1Like(0);

            data.setRes2(
                "[NAME:SAYUKI]「ついででも、嬉しいです。……こういう気遣い、本当に助かってます」" +
                "[NEXT]" +
                "[NAME:NONE]心からの感謝を伝えられ、なんだかこちらまで温かい気持ちになった。"
            );
            data.setC2Love(1); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「ええー……。せっかく感動してたのに、台無しです。今度、安い飴でも買っておきますね」" +
                "[NEXT]" +
                "[NAME:NONE]ジト目で睨まれたが、その声色に昔のような棘はなかった。"
            );
            data.setC3Love(0); data.setC3Like(1);
            break;

        case 2: // デザインの相談
            data.setMessage(
                "[NAME:SAYUKI]「" + pName + "さん、少し手止めてもらっていいですか？ ここの配色、どっちが良いと思います？」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんが自分の制作物をこちらに見せてきた。完全に信頼されている証拠だ。"
            );
            data.setChoice1Text("今のままで十分綺麗だと思うよ");
            data.setChoice2Text("俺ならこっちの青みを強くするかな");
            data.setChoice3Text("適当にサイコロで決めれば？");

            data.setRes1(
                "[NAME:SAYUKI]「そうですか？ ……ふふ、貴方にそう言ってもらえると、自信が持てます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は安心したように、自分の描いたイラストを愛おしそうに見つめた。"
            );
            data.setC1Love(3); data.setC1Like(1);

            data.setRes2(
                "[NAME:SAYUKI]「青み……なるほど、全体が引き締まりますね！ ありがとうございます、試してみます！」" +
                "[NEXT]" +
                "[NAME:NONE]プロとしての意見が刺さったようだ。彼女は目を輝かせて作業に戻った。"
            );
            data.setC2Love(0); data.setC2Like(4);

            data.setRes3(
                "[NAME:SAYUKI]「……真面目に聞いた私が馬鹿でした。もういいです」" +
                "[NEXT]" +
                "[NAME:NONE]頬を膨らませて拗ねてしまった。せっかくの好感度が……。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 3: // 視線が合う
            data.setMessage(
                "[NAME:NONE]作業中、ふと視線を上げると、サユキさんとバッチリ目が合った。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「…………あ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女はすぐに目を逸らさず、数秒間、じっとこちらを見つめ返してきた。"
            );
            data.setChoice1Text("（優しく微笑み返す）");
            data.setChoice2Text("どうしたの？");
            data.setChoice3Text("（変顔をする）");

            data.setRes1(
                "[NAME:SAYUKI]「……っ。な、なんでもないです……っ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は慌てて画面に向き直ったが、タイピングの音が明らかに動揺して乱れていた。"
            );
            data.setC1Love(4); data.setC1Like(0);

            data.setRes2(
                "[NAME:SAYUKI]「いえ……。" + pName + "さん、真剣な顔して仕事してるな、って思って。……それだけです」" +
                "[NEXT]" +
                "[NAME:NONE]少し照れくさそうに笑って、彼女は自分の仕事に戻った。"
            );
            data.setC2Love(1); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「……小学生ですか。気が散るのでやめてください」" +
                "[NEXT]" +
                "[NAME:NONE]呆れられてしまった。せっかくのムードが台無しだ。"
            );
            data.setC3Love(-1); data.setC3Like(0);
            break;

        case 4: // 休日の話
            data.setMessage(
                "[NAME:SAYUKI]「そういえば、" + pName + "さんって休みの日は何してるんですか？ ……ずっとコード書いてるわけじゃないですよね？」" +
                "[NEXT]" +
                "[NAME:NONE]ついにプライベートな質問が飛んできた。"
            );
            data.setChoice1Text("サユキさんと出かけたいなと思ってた");
            data.setChoice2Text("大体ゲームしたり、映画見たりかな");
            data.setChoice3Text("ずっと寝てる");

            data.setRes1(
                "[NAME:SAYUKI]「なっ……！？ そ、そういう冗談は心臓に悪いのでやめてください……っ」" +
                "[NEXT]" +
                "[NAME:NONE]顔を真っ赤にして怒られたが、満更でもなさそうだ。"
            );
            data.setC1Love(4); data.setC1Like(0);

            data.setRes2(
                "[NAME:SAYUKI]「普通ですね。……ふふ、でもそういう普通の時間が、一番のリフレッシュになりますよね」" +
                "[NEXT]" +
                "[NAME:NONE]和やかな雑談が弾み、良い息抜きになった。"
            );
            data.setC2Love(1); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「不健康ですね……。せっかくの休みなんだから、少しは外の空気吸ってくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]まるでお母さんのように小言を言われてしまった。"
            );
            data.setC3Love(0); data.setC3Like(1);
            break;
            
        case 5: // ペンを落とす（ささやかな日常）
            data.setMessage(
                "[NAME:NONE]コロコロ……と、サユキの机からペンが転がり落ち、こちらの足元へ転がってきた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「あ、すみません。……拾ってもらえますか？」"
            );
            // シャッフル（1:Like 2:Bad 3:Love）
            data.setChoice1Text("はい、どうぞ（普通に渡す）");
            data.setChoice2Text("自分で拾いなよ");
            data.setChoice3Text("（わざと手渡しで指先を触れさせる）");

            // 選択肢1：気さくな同僚（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「ありがとうございます。……最近、少し手が滑りやすくて」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は軽く微笑んでペンを受け取り、すぐに作業に戻った。"
            );
            data.setC1Love(1); data.setC1Like(3);

            // 選択肢2：意地悪（Bad）
            data.setRes2(
                "[NAME:SAYUKI]「……いじわるですね。手が届かないから頼んでるのに」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し口を尖らせて、自分で身を乗り出してペンを拾った。"
            );
            data.setC2Love(0); data.setC2Like(-2);

            // 選択肢3：確信犯のスキンシップ（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……っ。……あ、ありがとう、ございます……」" +
                "[NEXT]" +
                "[NAME:NONE]一瞬指先が触れ合うと、彼女はビクッと肩を揺らし、ペンを両手でギュッと握りしめた。"
            );
            data.setC3Love(3); data.setC3Like(0);
            break;

        case 6: // 小さな達成感
            data.setMessage(
                "[NAME:SAYUKI]「ふぅー……っ。よし、やっとこのキャラの線画が終わりました！」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんがペンを置き、満足そうに大きく息を吐いた。"
            );
            // シャッフル（1:Love 2:Like 3:Bad）
            data.setChoice1Text("お疲れ様。すごく頑張ってたね");
            data.setChoice2Text("おっ、見せて見せて！");
            data.setChoice3Text("まだ色塗りが残ってるよ");

            // 選択肢1：努力を労う（Love寄り）
            data.setRes1(
                "[NAME:SAYUKI]「……はい。貴方が隣で集中してくれてたから、私も頑張れました」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し照れくさそうに、はにかむような笑顔を見せた。"
            );
            data.setC1Love(4); data.setC1Like(1);

            // 選択肢2：作品への興味（Like寄り）
            data.setRes2(
                "[NAME:SAYUKI]「えへへ、どうですか？ 今回の表情、結構自信あるんですよ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は得意げにモニターを指差した。クリエイター同士の純粋なリスペクトを感じる。"
            );
            data.setC2Love(1); data.setC2Like(3);

            // 選択肢3：水を差す（Bad）
            data.setRes3(
                "[NAME:SAYUKI]「……分かってますよ。せっかくの達成感に水を差さないでください」" +
                "[NEXT]" +
                "[NAME:NONE]ジト目で睨まれてしまった。タイミングが悪かったようだ。"
            );
            data.setC3Love(-1); data.setC3Like(-2);
            break;

        case 7: // 眠気との戦い
            data.setMessage(
                "[NAME:NONE]ふと隣を見ると、サユキさんがうとうとと船を漕いでいた。" +
                "[NEXT]" +
                "[NAME:NONE]ガクッと頭が揺れ、彼女はハッとして目を覚ました。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……っ！ い、今、寝てませんよ！ 瞬きが長かっただけですっ」"
            );
            // シャッフル（1:Bad 2:Love 3:Like）
            data.setChoice1Text("よだれ垂れてるよ（嘘）");
            data.setChoice2Text("寝顔、可愛かったよ");
            data.setChoice3Text("15分くらい仮眠したら？");

            // 選択肢1：からかう（Bad）
            data.setRes1(
                "[NAME:SAYUKI]「えっ！？ ……ちょっと、嘘じゃないですか！ もう、からかわないでください！」" +
                "[NEXT]" +
                "[NAME:NONE]慌てて口元を拭う彼女。少し怒らせてしまったが、反応は面白かった。"
            );
            data.setC1Love(-1); data.setC1Like(-1);

            // 選択肢2：直球の褒め言葉（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「なっ……！？ み、見ないでくださいっ。恥ずかしい……」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は両手で顔を覆い隠してしまった。耳の先まで真っ赤に染まっている。"
            );
            data.setC2Love(4); data.setC2Like(0);

            // 選択肢3：実務的な優しさ（Like寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……そうですね。効率落ちちゃいそうですし。……少しだけ、寝ますね」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は机に突っ伏し、すーっと静かな寝息を立て始めた。完全に安心しきっている。"
            );
            data.setC3Love(1); data.setC3Like(3);
            break;

        case 8: // 帰りの誘い
            data.setMessage(
                "[NAME:NONE]夜。キリの良いところで作業を終え、帰り支度をしていると、サユキさんがチラチラとこちらを見てきた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「あの、" + pName + "さん。……もう、帰っちゃいますか？」"
            );
            // シャッフル（1:Like 2:Love 3:Bad）
            data.setChoice1Text("うん。サユキさんも一緒に帰る？");
            data.setChoice2Text("送っていくよ");
            data.setChoice3Text("お疲れ様。戸締まりよろしくね");

            // 選択肢1：対等な誘い（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「あ……はい！ 私も今キリがいいところなので。一緒に駅まで行きましょう」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は嬉しそうに素早く荷物をまとめ、隣に並んで歩き始めた。"
            );
            data.setC1Love(2); data.setC1Like(3);

            // 選択肢2：エスコート（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「えっ……送るって、わざわざですか？ ……その、嫌じゃなければ、お願いします」" +
                "[NEXT]" +
                "[NAME:NONE]少し戸惑いながらも、彼女ははにかむように微笑んで頷いた。"
            );
            data.setC2Love(4); data.setC2Like(1);

            // 選択肢3：そっけない（Bad）
            data.setRes3(
                "[NAME:SAYUKI]「……はい。お疲れ様でした。気をつけて」" +
                "[NEXT]" +
                "[NAME:NONE]どこか寂しそうな声に見送られ、一人でアトリエを後にした。"
            );
            data.setC3Love(-2); data.setC3Like(-1);
            break;

        default:
        }
        return data;
    }
}