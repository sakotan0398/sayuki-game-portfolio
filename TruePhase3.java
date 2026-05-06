package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.beans.VisualBeans;

public class Phase1 {

    public ScenarioData getScenario(int num, String pName) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Common");
        
        String bg = "bg067800600.jpg"; 

        switch (num) {
        case 0:
            // 🌟 修正済 (キャラ, 背景, 演出, ズーム)
            data.setVisuals(new VisualBeans("Sayuki_focus.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]静まり返ったアトリエに、カタカタというタイピング音だけが響いている。" +
                "[NEXT]" +
                "[NAME:NONE]不意に、サユキが作業の手を止めてこちらを振り向いた。" +
                "[NEXT]" +
                "[IMG:Sayuki_dakara.png]" +
                "[NAME:SAYUKI]「……あの。" + pName + "さん、さっきからキーボードの打鍵音がうるさいんですけど。少しは配慮してもらえませんか」"
            );
            data.setChoice1Text("ごめんなさい。気を付けます");
            data.setChoice2Text("静音キーボードに変えようかな");
            data.setChoice3Text("さらにターンッ！と大きく叩く");

            data.setRes1(
                "[IMG:Sayuki_musu.png]" + 
                "[NAME:SAYUKI]「……分かってくれるならいいんです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は小さくため息をつき、再び画面に向き直った。"
            );
            data.setC1Love(0); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_nomal.png]" + 
                "[NAME:SAYUKI]「……静音性のキーボードなら、ここのメーカーがおすすめです。……これ以上邪魔しないでくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]文句を言いつつも、彼女は的確なアドバイスをくれた。"
            );
            data.setC2Love(1); data.setC2Like(2);
            data.setRes2Visuals(new VisualBeans("Sayuki_nomal.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_dakara_syomen_mouth_open.png]" + 
                "[NAME:SAYUKI]「ちょっと、わざと今エンターの音大きくしましたよね！？」" +
                "[NEXT]" +
                "[IMG:Sayuki_jitome.png]" + 
                "[NAME:NONE]彼女はあからさまに不機嫌そうな顔でこちらを睨みつけている。"
            );
            data.setC3Love(-1); data.setC3Like(-2);
            data.setRes3Visuals(new VisualBeans("Sayuki_jitome.png", bg, "cross_fade", "close_up"));
            break;

        case 1:
            data.setVisuals(new VisualBeans("Sayuki_focus.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]サユキの作業を後ろからそっと覗き込むと、彼女は素早くペンを止め、腕で画面を隠した。" +
                "[NEXT]" +
                "[IMG:Sayuki_anxiety.png]" + 
                "[NAME:SAYUKI]「……あの、あまりジロジロ見ないでもらえますか？ 集中力が削がれるので」"
            );
            data.setChoice1Text("あ、ごめんなさい…");
            data.setChoice2Text("いや、上手いなぁと思って");
            data.setChoice3Text("減るもんじゃないし、いいじゃん");

            data.setRes1(
                "[IMG:Sayuki_dakara_syomen.png]" + 
                "[NAME:SAYUKI]「謝るくらいなら、最初から配慮してください。……これだから素人は」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は露骨に作業位置を遠ざけた。"
            );
            data.setC1Love(0); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_surprised.png]" + 
                "[NAME:SAYUKI]「……え。……あ、ありがとう……ございます」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi.png]" + 
                "[NAME:NONE]不意を突かれたのか、彼女は一瞬だけ気まずそうに目を逸らした。"
            );
            data.setC2Love(2); data.setC2Like(1);
            data.setRes2Visuals(new VisualBeans("Sayuki_mesorasi.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_scary_smile.png]" + 
                "[NAME:SAYUKI]「そういう問題じゃありません。制作途中のものを見られるのはストレスなんです」" +
                "[NEXT]" +
                "[NAME:NONE]サユキの瞳に鋭い怒りが宿る。……これ以上は危険だ。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            data.setRes3Visuals(new VisualBeans("Sayuki_scary_smile.png", bg, "cross_fade", "close_up"));
            break;

        case 2:
            data.setVisuals(new VisualBeans("", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]休憩がてらブラックコーヒーを飲んでいると、サユキが顔をしかめて覗き込んできた。" +
                "[NEXT]" +
                "[IMG:Sayuki_surprised.png]" + 
                "[NAME:SAYUKI]「……よくそんな泥水みたいな苦いもの飲めますね。味覚、おかしくないですか？」"
            );
            data.setChoice1Text("眠気覚ましにはちょうどいいよ");
            data.setChoice2Text("苦くないのもあるよ。飲む？");
            data.setChoice3Text("大人ぶってるだけです");

            data.setRes1(
                "[IMG:Sayuki_dakara.png]" + 
                "[NAME:SAYUKI]「……合理的な理由ですね。私はエナジードリンク派なので遠慮しておきます」" +
                "[NEXT]" +
                "[NAME:NONE]呆れたように肩をすくめられた。"
            );
            data.setC1Love(0); data.setC1Like(2);
            data.setRes1Visuals(new VisualBeans("Sayuki_nomal.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_nomal.png]" +
                "[NAME:SAYUKI]「……へえ。そんなのがあるんですね。……今度、気が向いたらチャレンジしようかな」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi.png]" + 
                "[NAME:NONE]サユキは少しだけ興味ありげに、こちらのコーヒーカップを見つめていた。"
            );
            data.setC2Love(2); data.setC2Like(1);
            data.setRes2Visuals(new VisualBeans("Sayuki_mesorasi.png", bg, "cross_fade", "close_up"));

            data.setRes3(
                "[IMG:Sayuki_dakara_syomen.png]" + 
                "[NAME:SAYUKI]「……正直でよろしいですけど、胃を壊しますよ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は呆れたように視線を自分のモニターに戻した。"
            );
            data.setC3Love(1); data.setC3Like(0);
            data.setRes3Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));
            break;

        case 3:
            data.setVisuals(new VisualBeans("", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]夜遅く、暗い室内で作業していると、帰る準備をしていたサユキが背後で足を止めた。" +
                "[NEXT]" +
                "[IMG:Sayuki_dakara_syomen.png]" +
                "[NAME:SAYUKI]「……電気も付けないで何してるんですか。液晶の光だけで作業するなんて、目が悪くなりますよ」"
            );
            data.setChoice1Text("熱中して気付きませんでした");
            data.setChoice2Text("ありがとう、今付けます");
            data.setChoice3Text("この暗さが集中できるんです");

            data.setRes1(
                "[IMG:Sayuki_dakara_syomen_mouth_open.png]" +
                "[NAME:SAYUKI]「集中するのは勝手ですけど、健康管理も仕事のうちですよ」" +
                "[NEXT]" +
                "[IMG:Sayuki_musu.png]" +
                "[NAME:NONE]冷たい口調で言い捨てたが、去り際に部屋のスイッチを入れてくれた。"
            );
            data.setC1Love(1); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_musu.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_surprised.png]" +
                "[NAME:SAYUKI]「……分かればいいんです。じゃあ、お先に」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi.png]" +
                "[NAME:NONE]素直に従ったことに驚いたのか、彼女は少しだけ毒気を抜かれた顔をした。"
            );
            data.setC2Love(1); data.setC2Like(2);
            data.setRes2Visuals(new VisualBeans("Sayuki_mesorasi.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_dakara.png]" +
                "[NAME:SAYUKI]「雰囲気作りのつもりですか？ モニターとのコントラストで眼精疲労が加速するだけです。非効率ですね」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は呆れたように首を振って、ドアへと向かった。"
            );
            data.setC3Love(0); data.setC3Like(-1);
            data.setRes3Visuals(new VisualBeans("", bg, "cross_fade", "normal"));
            break;

        case 4:
            data.setVisuals(new VisualBeans("Sayuki_nomal.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]外はもう真っ暗だ。サユキが荷物をまとめ、帰り支度を終えて立ち上がった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「それでは、私は先に上がります。……戸締り、忘れないでくださいね」"
            );
            data.setChoice1Text("お疲れ様。任せてください");
            data.setChoice2Text("一緒に帰らない？");
            data.setChoice3Text("えーと、鍵ってどこだっけ…");

            data.setRes1(
                "[NAME:SAYUKI]「はい。お疲れさまでした。……それでは、また明日」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は軽く会釈をして、夜の街へと消えていった。"
            );
            data.setC1Love(0); data.setC1Like(2);
            data.setRes1Visuals(new VisualBeans("", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_jitome.png]" +
                "[NAME:SAYUKI]「疲れて脳みそ溶けましたか？ なんで私が貴方と一緒に帰らなきゃいけないんですか」" +
                "[NEXT]" +
                "[NAME:NONE]冷徹な一言が突き刺さった。サユキは足早にアトリエを出ていった。"
            );
            data.setC2Love(-1); data.setC2Like(-2);
            data.setRes2Visuals(new VisualBeans("", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_dakara_syomen_mouth_open.png]" +
                "[NAME:SAYUKI]「……本気で言ってます？ 鍵はそこの棚ですよ。……本当に大丈夫なんですか？」" +
                "[NEXT]" +
                "[IMG:Sayuki_anxiety.png]" +
                "[NAME:NONE]不安そうに、何度も振り返りながら彼女は去っていった。仕事仲間としての信頼度が揺らいだ気がする……。"
            );
            data.setC3Love(0); data.setC3Like(-1);
            data.setRes3Visuals(new VisualBeans("", bg, "cross_fade", "normal"));
            break;
            
        case 5:
            data.setVisuals(new VisualBeans("Sayuki_focus.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]お昼時。サユキはモニターから目を離さず、ゼリー飲料と栄養調整食品だけで食事を済ませようとしている。" +
                "[NEXT]" +
                "[IMG:Sayuki_dakara_syomen_mouth_open.png]" +
                "[NAME:SAYUKI]「……ちっ、このレイヤーのクリッピング、外れてる……」"
            );
            data.setChoice1Text("そんな食事で大丈夫？");
            data.setChoice2Text("コンビニ行くけど何か買う？");
            data.setChoice3Text("（じーっと見つめる）");

            data.setRes1(
                "[IMG:Sayuki_musu.png]" +
                "[NAME:SAYUKI]「……大きなお世話です。今は食事に時間を割くより、手を動かしたいので」" +
                "[NEXT]" +
                "[NAME:NONE]冷たく返されたが、その後少しだけゼリーを飲むペースがゆっくりになった。"
            );
            data.setC1Love(1); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_surprised.png]" + 
                "[NAME:SAYUKI]「……え？ あ、……じゃあ、ブラックじゃないコーヒーをお願いしてもいいですか」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi.png]" + 
                "[NAME:NONE]彼女は少し驚いた後、財布から小銭を出して渡してくれた。"
            );
            data.setC2Love(0); data.setC2Like(3);
            data.setRes2Visuals(new VisualBeans("Sayuki_mesorasi.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_jitome.png]" +
                "[NAME:SAYUKI]「……なんですか。人が食事してるところ見る趣味でもあるんですか？ 気持ち悪いです」" +
                "[NEXT]" +
                "[NAME:NONE]露骨にドン引きされてしまった……。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            data.setRes3Visuals(new VisualBeans("Sayuki_jitome.png", bg, "cross_fade", "close_up"));
            break;

        case 6:
            data.setVisuals(new VisualBeans("Sayuki_nomal.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]「……んーっ」" +
                "[NEXT]" +
                "[NAME:NONE]長時間の作業で疲れたのか、サユキが椅子に座ったまま大きく背伸びをした。" +
                "[NEXT]" +
                "[IMG:Sayuki_surprised.png]" +
                "[NAME:NONE]無防備な姿に思わず目を奪われていると、彼女とバッチリ目が合ってしまった。"
            );
            data.setChoice1Text("お疲れ様。少し休んだら？");
            data.setChoice2Text("（無言でサッと目を逸らす）");
            data.setChoice3Text("いいストレッチですね");

            data.setRes1(
                "[IMG:Sayuki_musu.png]" +
                "[NAME:SAYUKI]「……そうですね。少し肩が凝ってきました」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は小さく首を回し、少しだけ表情を緩めた。"
            );
            data.setC1Love(1); data.setC1Like(2);
            data.setRes1Visuals(new VisualBeans("Sayuki_nomal.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_mesorasi.png]" +
                "[NAME:SAYUKI]「…………」" +
                "[NEXT]" +
                "[NAME:NONE]特に何も言われなかったが、彼女はそそくさとパーカーの裾を直して作業に戻った。"
            );
            data.setC2Love(0); data.setC2Like(1);
            data.setRes2Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_scary_smile.png]" +
                "[NAME:SAYUKI]「……次そういう目で見たら、マジで通報しますよ」" +
                "[NEXT]" +
                "[NAME:NONE]空気が氷点下まで凍りついた。本気で軽蔑されている……。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            data.setRes3Visuals(new VisualBeans("Sayuki_scary_smile.png", bg, "cross_fade", "close_up"));
            break;

        case 7:
            data.setVisuals(new VisualBeans("Sayuki_dakara_syomen_mouth_open.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:SAYUKI]「……あーもう！ なんでここでフリーズするの！」" +
                "[NEXT]" +
                "[NAME:NONE]サユキがマウスを乱暴にクリックしながら悪態をついている。どうやらPCの調子が悪いようだ。"
            );
            data.setChoice1Text("PCのトラブルなら見ようか？");
            data.setChoice2Text("がんばれー");
            data.setChoice3Text("叩けば直るよ");

            data.setRes1(
                "[IMG:Sayuki_surprised.png]" + 
                "[NAME:SAYUKI]「……え、直せるんですか？ じゃあ……お願いします。データ飛んだら泣きますからね」" +
                "[NEXT]" +
                "[IMG:Sayuki_anxiety.png]" + 
                "[NAME:NONE]専門家として頼られた。ここは腕の見せ所だ。"
            );
            data.setC1Love(1); data.setC1Like(3);
            data.setRes1Visuals(new VisualBeans("Sayuki_anxiety.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_jitome.png]" +
                "[NAME:SAYUKI]「他人事だと思って……。気楽でいいですね、プログラマーさんは」" +
                "[NEXT]" +
                "[NAME:NONE]八つ当たりのように睨まれたが、ほどなくしてPCは復活したようだ。"
            );
            data.setC2Love(0); data.setC2Like(0);
            data.setRes2Visuals(new VisualBeans("Sayuki_musu.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_dakara.png]" +
                "[NAME:SAYUKI]「昭和の人間ですか貴方は。精密機器ですよ？ ……もういいです、自分でやります」" +
                "[NEXT]" +
                "[NAME:NONE]完全に呆れられてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            data.setRes3Visuals(new VisualBeans("Sayuki_dakara.png", bg, "cross_fade", "normal"));
            break;

        case 8:
            data.setVisuals(new VisualBeans("Sayuki_focus.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]サユキの机の端に、かなり分厚くて専門的な美術解剖学の本が置かれているのに気づいた。"
            );
            data.setChoice1Text("すごく勉強熱心なんだね");
            data.setChoice2Text("ちょっと読ませて");
            data.setChoice3Text("俺には難しそう");

            data.setRes1(
                "[IMG:Sayuki_surprised.png]" + 
                "[NAME:SAYUKI]「プロとしてお金をもらう以上、当然のことです。……まあ、基礎は大事なので」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi_tere.png]" + 
                "[NAME:NONE]褒められたのが少し照れくさいのか、彼女は早口で誤魔化した。"
            );
            data.setC1Love(2); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_mesorasi_tere.png", bg, "cross_fade", "close_up"));

            data.setRes2(
                "[IMG:Sayuki_dakara_syomen_mouth_open.png]" +
                "[NAME:SAYUKI]「ちょっと、勝手に人の机の物に触らないでください！ 気が散ります」" +
                "[NEXT]" +
                "[IMG:Sayuki_jitome.png]" +
                "[NAME:NONE]パシッと手を払われてしまった。まだそこまで親しい仲ではないようだ。"
            );
            data.setC1Love(-1); data.setC1Like(-2);
            data.setRes1Visuals(new VisualBeans("Sayuki_jitome.png", bg, "cross_fade", "normal"));

            data.setRes3(
                "[IMG:Sayuki_nomal.png]" +
                "[NAME:SAYUKI]「畑が違いますからね。私が貴方のコードを見ても、ただの暗号にしか見えませんし」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少しだけフッと笑い、自分の作業に戻っていった。"
            );
            data.setC3Love(0); data.setC3Like(1);
            data.setRes3Visuals(new VisualBeans("Sayuki_focus.png", bg, "cross_fade", "normal"));
            break;

        case 9:
            data.setVisuals(new VisualBeans("Sayuki_anxiety.png", bg, "none", "normal"));
            data.setMessage(
                "[NAME:NONE]今日の作業も終わり、帰ろうとすると外は土砂降りの雨だった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「最悪……天気予報、晴れだったのに……」" +
                "[NEXT]" +
                "[NAME:NONE]サユキは傘を持っていないらしく、ドアの前で立ち往生している。"
            );
            data.setChoice1Text("俺の傘、貸すよ");
            data.setChoice2Text("一緒に入っていく？");
            data.setChoice3Text("じゃあお疲れ！");

            data.setRes1(
                "[NAME:PLAYER]「俺は走って帰るから、これ使って」" +
                "[NEXT]" +
                "[IMG:Sayuki_surprised.png]" +
                "[NAME:SAYUKI]「えっ！？ ちょっと、貴方が風邪引いたら……」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi.png]" +
                "[NAME:NONE]驚く彼女に傘を押し付け、雨の中へ駆け出した。背中越しに『あ、ありがとうございます……』という声が聞こえた。"
            );
            data.setC1Love(3); data.setC1Like(1);
            data.setRes1Visuals(new VisualBeans("Sayuki_mesorasi.png", bg, "cross_fade", "normal"));

            data.setRes2(
                "[IMG:Sayuki_jitome.png]" +
                "[NAME:SAYUKI]「……は？ 結構です。近所のコンビニでビニール傘買いますから」" +
                "[NEXT]" +
                "[IMG:Sayuki_mesorasi_tere.png]" + 
                "[NAME:NONE]即答で拒否されたが、その耳は少しだけ赤くなっていた。"
            );
            data.setC2Love(2); data.setC2Like(0);
            data.setRes2Visuals(new VisualBeans("Sayuki_mesorasi_tere.png", bg, "cross_fade", "close_up"));

            data.setRes3(
                "[IMG:Sayuki_dakara.png]" +
                "[NAME:SAYUKI]「……はいはい。お疲れ様でした。風邪引いて倒れても知りませんからね」" +
                "[NEXT]" +
                "[NAME:NONE]呆れたような声に見送られ、一人で帰路についた。"
            );
            data.setC3Love(-1); data.setC3Like(0);
            data.setRes3Visuals(new VisualBeans("Sayuki_dakara.png", bg, "cross_fade", "normal"));
            break;
        }
        return data;
    }
}