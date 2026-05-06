package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;

public class Phase4 {

    public ScenarioData getScenario(int num, String pName) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Common");

        switch (num) {
        case 0: // 阿吽の呼吸（日常）
            data.setMessage(
                "[NAME:NONE]作業中、サユキが何かを探してキョロキョロとしている。" +
                "[NEXT]" +
                "[NAME:NONE]何も言わずにお気に入りのペンを差し出すと、彼女は驚いた顔をした後、嬉しそうに笑った。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ふふ。エスパーですか？ ちょうど今、それを使おうと思ってたんです」"
            );
            // シャッフル（1:Like 2:Love 3:Bad）
            data.setChoice1Text("サユキさんのことなら何でもお見通しだよ");
            data.setChoice2Text("手が勝手に動いたんだ");
            data.setChoice3Text("ペンくらい自分で管理しなよ");

            data.setRes1(
                "[NAME:SAYUKI]「……もう。調子に乗らないでください。……でも、ありがとうございます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し顔を赤らめつつも、信頼しきった表情で作業に戻った。"
            );
            data.setC1Love(2); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「ふふ、バディとしての勘が冴えてますね。これからも頼りにしてますよ？」" +
                "[NEXT]" +
                "[NAME:NONE]軽口を叩き合える、心地よい時間が流れた。"
            );
            data.setC2Love(3); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「……。そうですね。……すみません、以後気をつけます」" +
                "[NEXT]" +
                "[NAME:NONE]せっかくの通じ合った空気が、一瞬で冷え込んでしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-2);
            break;

        case 1: // 疲労とコーヒー
            data.setMessage(
                "[NAME:NONE]深夜。サユキがモニターの前で大きくため息をついた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……あ。……" + pName + "さん、まだ起きてたんですね。……少し、お話しませんか？」"
            );
            // シャッフル（1:Love 2:Bad 3:Like）
            data.setChoice1Text("コーヒーでも淹れてこようか");
            data.setChoice2Text("仕事中だから後にしよう");
            data.setChoice3Text("サユキさんの顔が見たくなっただけだよ");

            data.setRes1(
                "[NAME:SAYUKI]「嬉しい……。貴方の淹れるコーヒー、一番落ち着くんです。……お願いします」" +
                "[NEXT]" +
                "[NAME:NONE]二人で温かいマグカップを囲み、静かな夜の時間を共有した。"
            );
            data.setC1Love(4); data.setC1Like(1);

            data.setRes2(
                "[NAME:SAYUKI]「……。そう、ですね。……すみません、邪魔しました。……進めます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は寂しそうにモニターに向き直った。冷たくしすぎたかもしれない。"
            );
            data.setC2Love(-2); data.setC2Like(-1);

            data.setRes3(
                "[NAME:SAYUKI]「なっ……！ 急に何を……。……でも、私も。貴方の声を聞くと、安心します」" +
                "[NEXT]" +
                "[NAME:NONE]素直な彼女の言葉に、こちらの方が照れてしまった。"
            );
            data.setC3Love(3); data.setC3Like(3);
            break;

        case 2: // 未来の約束
            data.setMessage(
                "[NAME:SAYUKI]「このゲームが完成したら、やりたいことリストを作ってみたんです。……見ますか？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女が差し出してきた手帳には、二人で行きたい場所や食べたいものがびっしりと書かれていた。"
            );
            // シャッフル（1:Bad 2:Like 3:Love）
            data.setChoice1Text("まずは完成させることに集中しよう");
            data.setChoice2Text("全部叶えよう。二人で、ね");
            data.setChoice3Text("サユキさんの行きたい場所、俺も興味あるな");

            data.setRes1(
                "[NAME:SAYUKI]「……分かってますよ。……ただ、少し楽しみにしてただけです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少しシュンとして手帳を閉じてしまった。"
            );
            data.setC1Love(-1); data.setC1Like(0);

            data.setRes2(
                "[NAME:SAYUKI]「全部……！ ふふ。欲張りですね。……でも、貴方となら、全部楽しめる気がします」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は満面の笑みで頷いた。未来を共有できる喜びを感じる。"
            );
            data.setC2Love(4); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「本当ですか？ じゃあ、次はこの映画見に行きましょう！ 絶対ですよ？」" +
                "[NEXT]" +
                "[NAME:NONE]クリエイター仲間として、感性を磨く約束を交わした。"
            );
            data.setC3Love(2); data.setC3Like(4);
            break;

        case 3: // 作業中の沈黙
            data.setMessage(
                "[NAME:NONE]アトリエには、キーボードを叩く音とペンタブの音だけが響いている。" +
                "[NEXT]" +
                "[NAME:NONE]ふとサユキの方を見ると、彼女もこちらを見ていた。視線が合う。"
            );
            // シャッフル（1:Like 2:Love 3:Bad）
            data.setChoice1Text("（黙って頷き合う）");
            data.setChoice2Text("（微笑みかける）");
            data.setChoice3Text("何？ 顔になんか付いてる？");

            data.setRes1(
                "[NAME:SAYUKI]「……。……ふふ。……よし、続きやりましょう」" +
                "[NEXT]" +
                "[NAME:NONE]言葉はなくても、今の自分たちが最高に噛み合っていることが分かった。"
            );
            data.setC1Love(1); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「……っ。……あ。……えへへ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は照れくさそうに笑い、幸せそうな表情でペンを動かし始めた。"
            );
            data.setC2Love(4); data.setC2Like(1);

            data.setRes3(
                "[NAME:SAYUKI]「……別に。……なんでもないです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は慌てて目を逸らした。せっかくの心地よい沈黙を壊してしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            break;

        case 4: // 相談と信頼
            data.setMessage(
                "[NAME:SAYUKI]「" + pName + "さん。ここ、貴方の意見が聞きたくて。……貴方がダメだと言ったら、描き直します」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は心底信頼しきった瞳で、描き上げたばかりのメインビジュアルを見せてきた。"
            );
            // シャッフル（1:Love 2:Like 3:Bad）
            data.setChoice1Text("サユキさんの情熱、しっかり伝わってきたよ");
            data.setChoice2Text("技術的なことは分からないけど、最高だと思う");
            data.setChoice3Text("ちょっとイメージと違うかも…");

            data.setRes1(
                "[NAME:SAYUKI]「……！ ありがとうございます。貴方にそう言ってもらえるのが、一番嬉しいです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は安堵の表情を見せ、大切そうにモニターを撫でた。"
            );
            data.setC1Love(4); data.setC1Like(2);

            data.setRes2(
                "[NAME:SAYUKI]「最高の相棒にそう言われたら、自信持てます！ 仕上げ、頑張りますね！」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は気合を入れ直し、力強くペンを走らせた。"
            );
            data.setC2Love(1); data.setC2Like(4);

            data.setRes3(
                "[NAME:SAYUKI]「……。……分かりました。……もう一度、考え直します」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し肩を落として、レイヤーを非表示にした。"
            );
            data.setC3Love(-2); data.setC3Like(-3);
            break;

        case 5: // 雨宿り
            data.setMessage(
                "[NAME:NONE]買い物からの帰り道、突然の雨に降られ、二人で軒下に駆け込んだ。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ひどい雨。……でも、なんだか悪くないですね。こうして止まっているのも」"
            );
            // シャッフル（1:Like 2:Bad 3:Love）
            data.setChoice1Text("雨の音、BGMの参考になりそうだね");
            data.setChoice2Text("濡れて風邪引くよ。タクシー呼ぼうか");
            data.setChoice3Text("サユキさんと一緒なら、いつまでも待てるよ");

            data.setRes1(
                "[NAME:SAYUKI]「あ、本当だ。……この空気感、ゲームの演出に取り入れましょうか。……ふふ」" +
                "[NEXT]" +
                "[NAME:NONE]雨の中でも、クリエイター同士の会話が弾んだ。"
            );
            data.setC1Love(1); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「……。そうですね。……効率悪いですし」" +
                "[NEXT]" +
                "[NAME:NONE]正論だが、どこか味気ない反応をされてしまった。"
            );
            data.setC2Love(0); data.setC2Like(1);

            data.setRes3(
                "[NAME:SAYUKI]「……。……貴方って、たまに本当に恥ずかしいこと言いますよね。……バカ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は顔を背けたが、その耳は真っ赤に染まっていた。"
            );
            data.setC3Love(5); data.setC3Like(0);
            break;

        case 6: // 共通の敵（バグ）
            data.setMessage(
                "[NAME:NONE]原因不明のバグが続き、二人とも疲労困憊の状態だ。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……くっ。……まだ、終われません。……" + pName + "さん、もう一度だけ一緒に見てもらえますか？」"
            );
            // シャッフル（1:Love 2:Like 3:Bad）
            data.setChoice1Text("サユキさんが一緒なら、いくらでも付き合うよ");
            data.setChoice2Text("当たり前だろ、サユキさんのゲームなんだから");
            data.setChoice3Text("今日はもう限界だ。明日やろう");

            data.setRes1(
                "[NAME:SAYUKI]「……ありがとうございます。貴方のその言葉に、いつも救われてます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は優しい眼差しで微笑み、再び画面に向かった。"
            );
            data.setC1Love(4); data.setC1Like(2);

            data.setRes2(
                "[NAME:SAYUKI]「！ はい、お願いします！ 絶対に今日中に倒しましょう、相棒！」" +
                "[NEXT]" +
                "[NAME:NONE]最高の戦友としての熱い連帯感が生まれた。"
            );
            data.setC2Love(1); data.setC2Like(5);

            data.setRes3(
                "[NAME:SAYUKI]「……。……そうですね。……お疲れ様でした」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は寂しそうに作業を中断した。絆が少し揺らいだ気がする。"
            );
            data.setC3Love(-2); data.setC3Like(-3);
            break;

        case 7: // ささやかな贈り物
            data.setMessage(
                "[NAME:NONE]コンビニに行った際、サユキが好きだと言っていた新作のアイスを買ってきた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「えっ……！ 覚えててくれたんですか？ ……嬉しい。……半分、食べますか？」"
            );
            // シャッフル（1:Like 2:Love 3:Bad）
            data.setChoice1Text("サユキさんが全部食べなよ、頑張ってるし");
            data.setChoice2Text("じゃあ、あーんして？（冗談）");
            data.setChoice3Text("溶けちゃうから早く食べな");

            data.setRes1(
                "[NAME:SAYUKI]「……。……じゃあ、いただきます。……お返し、期待しててくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は嬉しそうに、でも少し遠慮がちにアイスを口に運んだ。"
            );
            data.setC1Love(1); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「なっ……！ ～～～っ！ ……もう！ ……ほら、口開けてくださいっ」" +
                "[NEXT]" +
                "[NAME:NONE]冗談のつもりだったが、彼女は真っ赤になりながら本当にスプーンを運んできた。"
            );
            data.setC2Love(5); data.setC2Like(0);

            data.setRes3(
                "[NAME:SAYUKI]「……分かってますよ。……。……いただきます」" +
                "[NEXT]" +
                "[NAME:NONE]少し不満そうな顔をして、一人で食べ始めてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(0);
            break;

        case 8: // 寝顔
            data.setMessage(
                "[NAME:NONE]ふと隣を見ると、サユキが座ったまま眠りに落ちていた。" +
                "[NEXT]" +
                "[NAME:NONE]無防備な寝顔は、普段の強気な彼女からは想像もつかないほど幼く見えた。"
            );
            // シャッフル（1:Love 2:Bad 3:Like）
            data.setChoice1Text("（優しくブランケットを掛ける）");
            data.setChoice2Text("（起こして休憩するように言う）");
            data.setChoice3Text("（起こさないよう、静かに作業を続ける）");

            data.setRes1(
                "[NAME:SAYUKI]「……んっ……あったか、い……。……ありが、とう……」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は夢うつつに微笑み、幸せそうに寝息を立て続けた。"
            );
            data.setC1Love(5); data.setC1Like(1);

            // 選択肢2：Bad（無粋）
            data.setRes2(
                "[NAME:SAYUKI]「……はっ！？ す、すみません！ 私、いつの間に……っ！」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は飛び起きて激しく動揺している。もう少し寝かせてあげても良かったかもしれない。"
            );
            data.setC2Love(-1); data.setC2Like(0);

            data.setRes3(
                "[NAME:SAYUKI]「……。……ん……。あ、おはようございます……」" +
                "[NEXT]" +
                "[NAME:NONE]しばらくして目が覚めた彼女は、隣にいるあなたの存在に安心したように微笑んだ。"
            );
            data.setC3Love(1); data.setC3Like(3);
            break;

        default:
            return getScenario(0, pName);
        }
        return data;
    }
}