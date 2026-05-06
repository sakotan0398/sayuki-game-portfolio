package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;

public class Phase2 {

    public ScenarioData getScenario(int num, String pName) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Common");

        switch (num) {
        case 0: // 居眠り（少し隙を見せる）
            data.setMessage(
                "[NAME:SAYUKI]「……あ、" + pName + "さん。すみません、少しぼーっとしてました」" +
                "[NEXT]" +
                "[NAME:NONE]サユキは眠そうに目をこすりながら、必死にモニターを見つめている。これまで見せなかった無防備な姿だ。"
            );
            // 1:Like 2:マイナス 3:Love
            data.setChoice1Text("顔でも洗ってきたら？");
            data.setChoice2Text("居眠りですか？");
            data.setChoice3Text("無理しないで。コーヒー淹れようか？");

            // 選択肢1：的確なアドバイス（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「そうですね……。少し冷たい水で、頭を冷やしてきます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は自分の頬をパチンと叩き、洗面所へ向かった。仕事へのストイックさは変わらない。"
            );
            data.setC1Love(0); data.setC1Like(3);

            // 選択肢2：嫌味（マイナス）
            data.setRes2(
                "[NAME:SAYUKI]「……起きてます。そんな風に言わなくてもいいじゃないですか」" +
                "[NEXT]" +
                "[NAME:NONE]少しムッとしてしまった。せっかくの隙を塞がれてしまったようだ。"
            );
            data.setC2Love(-1); data.setC2Like(-1);

            // 選択肢3：甘やかす（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……大丈夫です。でも……もし淹れてくれるなら、少しだけ、もらおうかな」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は視線を逸らしながら、ボソッと呟いた。強がりつつも甘えたいようだ。"
            );
            data.setC3Love(3); data.setC3Like(0);
            break;

        case 1: // プログラミングの悩み
            data.setMessage(
                "[NAME:SAYUKI]「……ここの構造、どうすれば効率よく動くんでしょう。……難しいですね」" +
                "[NEXT]" +
                "[NAME:NONE]彼女はリファレンスサイトとコードを何度も往復している。初めの頃と違い、隠そうとはしない。"
            );
            // 1:Love 2:Like 3:マイナス
            data.setChoice1Text("俺でよければ教えるよ");
            data.setChoice2Text("一緒に調べようか？");
            data.setChoice3Text("才能の限界ですね");

            // 選択肢1：頼りになる男アピール（Love寄り）
            data.setRes1(
                "[NAME:SAYUKI]「……え。じゃあ、ここの部分なんですけど……」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し躊躇いながらも、画面をこちらに向けてきた。頼ってくれたようだ。"
            );
            data.setC1Love(3); data.setC1Like(1);

            // 選択肢2：バディとしてのサポート（Like寄り）
            data.setRes2(
                "[NAME:SAYUKI]「ありがとうございます。……専門的な資料があれば、解決しそうなんですけど」" +
                "[NEXT]" +
                "[NAME:NONE]一緒に解決策を探ることで、仕事仲間としての連帯感が生まれた。"
            );
            data.setC2Love(1); data.setC2Like(3);

            // 選択肢3：暴言（マイナス）
            data.setRes3(
                "[NAME:SAYUKI]「……。今は、冗談でもそんなこと言われたくないです」" +
                "[NEXT]" +
                "[NAME:NONE]本気で落ち込ませてしまった。反省しよう……。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 2: // 作品の褒め合い
            data.setMessage(
                "[NAME:SAYUKI]「" + pName + "さんの作品……。……いい意味で、私にはない鋭さがありますよね」" +
                "[NEXT]" +
                "[NAME:NONE]サユキがこちらのコードやUIを真剣な顔で見つめ、ポツリとこぼした。"
            );
            // 1:マイナス 2:Love 3:Like
            data.setChoice1Text("鋭すぎて痛いですか？");
            data.setChoice2Text("俺はサユキさんの絵が好きだよ");
            data.setChoice3Text("サユキさんの絵と合わせたら最強だね");

            // 選択肢1：茶化す（マイナス）
            data.setRes1(
                "[NAME:SAYUKI]「……。せっかく褒めたのに、茶化さないでください」" +
                "[NEXT]" +
                "[NAME:NONE]真面目な雰囲気をぶち壊してしまった。"
            );
            data.setC1Love(-1); data.setC1Like(-1);

            // 選択肢2：ストレートな好意（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「……っ。いきなり何言ってるんですか。からかわないでください」" +
                "[NEXT]" +
                "[NAME:NONE]彼女はムッとしたようにそっぽを向いたが、耳は少し赤くなっていた。"
            );
            data.setC2Love(4); data.setC2Like(0);

            // 選択肢3：最高の相棒（Like寄り）
            data.setRes3(
                "[NAME:SAYUKI]「最強、ですか。……大きく出ましたね。でも……そうかもしれません」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し自信ありげに、小さく口角を上げた。"
            );
            data.setC3Love(0); data.setC3Like(4);
            break;

        case 3: // 夕暮れのアトリエ
            data.setMessage(
                "[NAME:NONE]窓の外が赤く染まっている。サユキがふとペンを止めて、空を見上げた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「もう夕方……。……" + pName + "さんといると、少しだけ、時間が過ぎるのが早い気がします」"
            );
            // 1:Like 2:マイナス 3:Love
            data.setChoice1Text("充実してる証拠だね");
            data.setChoice2Text("時計壊れてるんじゃない？");
            data.setChoice3Text("もっとこのままでいたいね");

            // 選択肢1：ポジティブな仕事仲間（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「ふふ、そうですね。……さあ、あともう少し進めましょうか」" +
                "[NEXT]" +
                "[NAME:NONE]心地よい疲労感の中、二人の間に確かな信頼関係を感じた。"
            );
            data.setC1Love(1); data.setC1Like(3);

            // 選択肢2：雰囲気ぶち壊し（マイナス）
            data.setRes2(
                "[NAME:SAYUKI]「情緒がないですね、あなたは……。少しは空でも眺めたらどうですか」" +
                "[NEXT]" +
                "[NAME:NONE]ジト目で睨まれた。ムードも何もない。"
            );
            data.setC2Love(-2); data.setC2Like(0);

            // 選択肢3：ロマンチック（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……バカなこと言ってないで、作業に戻りますよ」" +
                "[NEXT]" +
                "[NAME:NONE]冷たくあしらわれたが、彼女は夕日ではなく、自分の手元をじっと見つめていた。"
            );
            data.setC3Love(3); data.setC3Like(1);
            break;

        case 4: // お腹の音
            data.setMessage(
                "[NAME:NONE]きゅるるる……と、静かなアトリエに可愛らしい音が響いた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……お腹、鳴っちゃいました。集中すると、つい食べるの忘れちゃうんです」" +
                "[NEXT]" +
                "[NAME:NONE]サユキは気まずそうに、お腹をさすっている。"
            );
            // 1:マイナス 2:Love 3:Like
            data.setChoice1Text("燃費悪いねｗ");
            data.setChoice2Text("何か俺が作ろうか？");
            data.setChoice3Text("一緒に買い出し行こっか");

            // 選択肢1：デリカシー皆無（マイナス）
            data.setRes1(
                "[NAME:SAYUKI]「……うるさいです。あなたに言われたくないですよ」" +
                "[NEXT]" +
                "[NAME:NONE]恥ずかしさを怒りでカバーされてしまった。"
            );
            data.setC1Love(-2); data.setC1Like(0);

            // 選択肢2：家庭的アピール（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「……いいんですか？ 変なもの出したら承知しませんよ」" +
                "[NEXT]" +
                "[NAME:NONE]文句を言いつつも、少し期待しているような眼差しを向けられた。"
            );
            data.setC2Love(3); data.setC2Like(0);

            // 選択肢3：外出の提案（Like寄り）
            data.setRes3(
                "[NAME:SAYUKI]「あ……はい。少し歩いて、リフレッシュするのもいいかもしれませんね」" +
                "[NEXT]" +
                "[NAME:NONE]二人で上着を羽織り、連れ立って外へ出た。"
            );
            data.setC3Love(1); data.setC3Like(2);
            break;

        case 5: // 机の上が散らかっている
            data.setMessage(
                "[NAME:SAYUKI]「……スケッチや参考資料で、机の上が大変なことになってきました」" +
                "[NEXT]" +
                "[NAME:NONE]サユキは山積みの資料を前に、少し途方に暮れているようだ。"
            );
            // 1:Like 2:Bad 3:Love
            data.setChoice1Text("サユキさん、一緒に片付けようか");
            data.setChoice2Text("もっとちゃんと片付けなよ");
            data.setChoice3Text("散らかってる方が天才っぽくていいと思う");

            // 選択肢1：バディとしての手助け（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「助かります。……一人だと、どこから手をつければいいか分からなくて」" +
                "[NEXT]" +
                "[NAME:NONE]二人で黙々と整理を進めた。少しだけ、チームとしての連帯感が強まった気がする。"
            );
            data.setC1Love(1); data.setC1Like(3);

            // 選択肢2：説教（Bad）
            data.setRes2(
                "[NAME:SAYUKI]「分かってますって。……でも、今は手が離せないんです。後でやりますよ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は不機嫌そうに資料を端に寄せ、作業に戻ってしまった。"
            );
            data.setC2Love(0); data.setC2Like(-2);

            // 選択肢3：不器用なフォロー（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……そんな迷信、本気で信じてるんですか？ ……嫌味じゃなければ、いいですけど」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し呆れたような顔をしたが、心なしか表情が和らいだように見えた。"
            );
            data.setC3Love(3); data.setC3Like(0);
            break;

        case 6: // 肩こり
            data.setMessage(
                "[NAME:SAYUKI]「……うう、肩がガチガチです。ずっと同じ姿勢は良くないですね」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんは椅子に背を預けて、大きく伸びをした。関節の鳴る音が静かな室内に響く。"
            );
            // 1:Like 2:Love 3:Bad
            data.setChoice1Text("少し肩を回してみたらどうですか？");
            data.setChoice2Text("散歩でもしてリフレッシュしに行こうか");
            data.setChoice3Text("サユキさん、若いんだから大丈夫だよ");

            // 選択肢1：アドバイス（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「そうですね。……んっ、……あ、少し楽になった気がします」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんは軽くストレッチをして、また集中モードに戻っていった。"
            );
            data.setC1Love(0); data.setC1Like(2);

            // 選択肢2：気分転換の提案（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「散歩……。いいですね。……一人で行くのもあれですし、少しだけ、付き合ってもらえますか？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は上着を羽織り、こちらを振り返った。少しだけ、二人の距離が縮まった気がする。"
            );
            data.setC2Love(3); data.setC2Like(1);

            // 選択肢3：デリカシー不足（Bad）
            data.setRes3(
                "[NAME:SAYUKI]「……年齢は関係ないですよ。デリカシー、どこかに落としてきたんですか？」" +
                "[NEXT]" +
                "[NAME:NONE]ジト目で睨まれた。失言だったようだ。"
            );
            data.setC3Love(-2); data.setC3Like(0);
            break;

        case 7: // 音楽の話
            data.setMessage(
                "[NAME:SAYUKI]「" + pName + "さんは、作業中って何か音楽を聴く派ですか？」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんは片方のイヤホンを外し、こちらの様子を伺ってきた。"
            );
            // 1:Bad 2:Like 3:Love
            data.setChoice1Text("音が漏れててうるさいんだけど…");
            data.setChoice2Text("無音が一番集中できるかな");
            data.setChoice3Text("サユキさんのおすすめが聴きたいな");

            // 選択肢1：苦情（Bad）
            data.setRes1(
                "[NAME:SAYUKI]「……っ。すみません、以後気を付けます。……もうイヤホン外しますね」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は気まずそうに顔を伏せてしまった。冷たくしすぎたかもしれない。"
            );
            data.setC1Love(-2); data.setC1Like(-2);

            // 選択肢2：ストイックな回答（Like寄り）
            data.setRes2(
                "[NAME:SAYUKI]「ストイックですね。……私は、少し音が無いと落ち着かなくて。気が合わなくて残念です」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんは少し意外そうな顔をしたが、お互いのスタイルの違いを尊重してくれた。"
            );
            data.setC2Love(0); data.setC2Like(2);

            // 選択肢3：興味を示す（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「私のおすすめですか？ ……いいですけど、こだわり強いですよ、私。……引かないでくださいね？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し嬉しそうに端末を操作し始めた。自分の世界に招き入れてくれたようだ。"
            );
            data.setC3Love(3); data.setC3Like(1);
            break;

        case 8: // 深夜の空気
            data.setMessage(
                "[NAME:NONE]時計の針は深夜を回っている。アトリエには青白いモニターの光だけが満ちていた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……夜って、不思議ですね。世界に二人しかいないみたいで」"
            );
            // 1:Like 2:Bad 3:Love
            data.setChoice1Text("集中できて最高だね");
            data.setChoice2Text("健康に悪いから早く寝なよ");
            data.setChoice3Text("サユキさんと二人なら悪くないね");

            // 選択肢1：実務的な肯定（Like寄り）
            data.setRes1(
                "[NAME:SAYUKI]「ええ。静かで、創作に没頭するには最高の時間です。貴方とは話が合いそうですね」" +
                "[NEXT]" +
                "[NAME:NONE]戦友のような頷きを交わし、再び作業に没頭した。"
            );
            data.setC1Love(1); data.setC1Like(3);

            // 選択肢2：正論すぎる（Bad）
            data.setRes2(
                "[NAME:SAYUKI]「……。分かってますよ、そんなこと。……もういいです。さっさと寝ます」" +
                "[NEXT]" +
                "[NAME:NONE]せっかくの情緒ある空気を台無しにしてしまった。"
            );
            data.setC2Love(0); data.setC2Like(-1);

            // 選択肢3：雰囲気に乗る（Love寄り）
            data.setRes3(
                "[NAME:SAYUKI]「……。……貴方、たまにそういうこと、平気で言いますよね。……バカじゃないですか」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は顔を背けたが、モニターの光に照らされた頬が赤らんでいるのが分かった。"
            );
            data.setC3Love(4); data.setC3Like(0);
            break;

        case 9: // スランプ
            data.setMessage(
                "[NAME:SAYUKI]「……うーん。何を描いても、納得がいかないんです。……少し、行き詰まりました」" +
                "[NEXT]" +
                "[NAME:NONE]彼女はラフを描いては消しを繰り返している。ペンを握る手に迷いが見えた。"
            );
            // 1:Love 2:Like 3:Bad
            data.setChoice1Text("サユキさん、外の空気でも吸いに行かない？");
            data.setChoice2Text("昔の作品を見返してみたらどうですか？");
            data.setChoice3Text("サユキさんも才能が枯れたんじゃない？");

            // 選択肢1：連れ出す（Love寄り）
            data.setRes1(
                "[NAME:SAYUKI]「……そうですね。少し、頭を空っぽにする時間が必要かもしれません。……少しだけ、ですよ？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は立ち上がり、控えめにこちらを誘ってきた。気分転換にはなりそうだ。"
            );
            data.setC1Love(3); data.setC1Like(1);

            // 選択肢2：過去の肯定（Like寄り）
            data.setRes2(
                "[NAME:SAYUKI]「過去の自分、ですか。……初心を思い出すのは、いいかもしれません。……意外と良いこと言いますね」" +
                "[NEXT]" +
                "[NAME:NONE]サユキさんは古いスケッチブックを広げ、真剣な眼差しでページをめくり始めた。"
            );
            data.setC2Love(1); data.setC2Like(3);

            // 選択肢3：挑発（Bad）
            data.setRes3(
                "[NAME:SAYUKI]「……。冗談でも、今は笑えません。……あっちに行っててください。顔、見たくないです」" +
                "[NEXT]" +
                "[NAME:NONE]最悪の失言だった。修復には時間がかかりそうだ……。"
            );
            data.setC3Love(-3); data.setC3Like(-3);
            break;
            
        }
        return data;
    }
}