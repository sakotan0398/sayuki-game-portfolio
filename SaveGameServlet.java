package sayukiGame.model.bo.scnarioDataCommon;

import sayukiGame.model.beans.ScenarioData;

public class Phase5 {

    public ScenarioData getScenario(int num, String pName) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Common");

        switch (num) {
        case 0: // 迫る締め切り
            data.setMessage(
                "[NAME:NONE]時計の針が午前3時を回った。マスターアップまで残り数日。<br>アトリエには、冷却ファンの唸る音だけが響いている。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……っ、ここのテクスチャ、まだ納得いきません。……" + pName + "さん、差し替え間に合いますか？」" +
                "[NEXT]" +
                "[NAME:NONE]彼女の目の下にはくっきりとした隈があるが、その眼光は鋭く燃えていた。"
            );
            data.setChoice1Text("任せろ。俺が何とかする。ギリギリまで粘ろう");
            data.setChoice2Text("俺はいいけど、サユキさんが倒れるよ");
            data.setChoice3Text("もう十分クオリティ高いから妥協しない？");

            data.setRes1(
                "[NAME:SAYUKI]「……ありがとうございます。絶対に、後悔だけはしたくないですから」" +
                "[NEXT]" +
                "[NAME:NONE]疲労の極致にありながらも、二人の足並みはピタリと揃っていた。"
            );
            data.setC1Love(1); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「倒れてる暇なんてありません。……大丈夫です、まだやれますから」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は強がり、再びタブレットにペンを走らせた。"
            );
            data.setC2Love(2); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「……ここまで来て、そんな言葉聞きたくありません。……もういいです、私一人でやります」" +
                "[NEXT]" +
                "[NAME:NONE]彼女のクリエイターとしてのプライドを傷つけてしまった。"
            );
            data.setC3Love(-3); data.setC3Like(-3);
            break;

        case 1: // 栄養補給
            data.setMessage(
                "[NAME:NONE]作業の合間、机の上に大量の栄養ドリンクとサプリメントが並んでいるのに気づいた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……あ、勝手に飲んでいいですよ。……味は保証しませんけど、目は覚めますから」"
            );
            data.setChoice1Text("ありがたく頂くよ。乾杯");
            data.setChoice2Text("カフェインの摂りすぎは良くないよ");
            data.setChoice3Text("こんなのに頼るなんて、体力ないね");

            data.setRes1(
                "[NAME:SAYUKI]「……はい、乾杯。……うえぇ、やっぱりまずい……」" +
                "[NEXT]" +
                "[NAME:NONE]渋い顔でドリンクを飲み干す彼女を見て、少しだけ笑いが漏れた。"
            );
            data.setC1Love(2); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「……分かってます。でも、今だけですから。終わったら、泥のように寝ます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は苦笑いしながら、空き瓶をゴミ箱に放り投げた。"
            );
            data.setC2Love(1); data.setC2Like(1);

            data.setRes3(
                "[NAME:SAYUKI]「……限界まで削ってる人に言うセリフですか、それ。……無神経ですね」" +
                "[NEXT]" +
                "[NAME:NONE]ピリピリしている時期に、軽口は厳禁だったようだ。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 2: // ラストスパート
            data.setMessage(
                "[NAME:NONE]バグチケットのリストが、ついに残り1桁になった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……" + pName + "さん。……見えてきましたね。ゴールが」" +
                "[NEXT]" +
                "[NAME:NONE]サユキが、祈るように両手を組み合わせてモニターを見つめている。"
            );
            data.setChoice1Text("ああ。あと少しだ、気を抜かずにいこう");
            data.setChoice2Text("俺たちの最強のゲームが、ついに完成するんだな");
            data.setChoice3Text("終わったら何して遊ぼうか");

            data.setRes1(
                "[NAME:SAYUKI]「……はい。油断大敵、ですね。……最後まで、よろしくお願いします」" +
                "[NEXT]" +
                "[NAME:NONE]静かな、しかし確かな闘志を再確認し合った。"
            );
            data.setC1Love(1); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「……っ。……はい。……絶対に、最高のものにしましょう」" +
                "[NEXT]" +
                "[NAME:NONE]彼女の目に、期待と高揚感がはっきりと浮かんだ。"
            );
            data.setC2Love(2); data.setC2Like(4);

            data.setRes3(
                "[NAME:SAYUKI]「……まだ終わってないのに、そういう話はやめてください。フラグになりますから」" +
                "[NEXT]" +
                "[NAME:NONE]縁起が悪いと、ジト目で睨まれてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            break;

        case 3: // 沈黙の共闘
            data.setMessage(
                "[NAME:NONE]もはや言葉を交わす余裕すらなく、ただひたすらに、機械のように作業を続ける時間が続いた。" +
                "[NEXT]" +
                "[NAME:NONE]息の詰まるような静寂。しかし、隣から聞こえる彼女のタイピング音が、不思議と心を落ち着かせてくれる。"
            );
            data.setChoice1Text("（黙って自分のコードに集中する）");
            data.setChoice2Text("（小さく息を吐き、彼女のモニターを一瞥する）");
            data.setChoice3Text("「ねえ、少し休憩しない？」と声をかける");

            data.setRes1(
                "[NAME:SAYUKI]「…………」" +
                "[NEXT]" +
                "[NAME:NONE]俺の集中力に呼応するように、彼女の作業スピードも上がっていく。完全なゾーンに入っていた。"
            );
            data.setC1Love(1); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「……ん。……大丈夫ですよ、遅れてませんから」" +
                "[NEXT]" +
                "[NAME:NONE]視線だけで意図を汲み取り、彼女はモニターから目を離さずに答えた。究極の信頼関係だ。"
            );
            data.setC2Love(2); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「……今、声かけないでください。集中が切れます」" +
                "[NEXT]" +
                "[NAME:NONE]ギリギリの精神状態で集中していた彼女の邪魔をしてしまった。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 4: // 疲労の限界
            data.setMessage(
                "[NAME:SAYUKI]「……あれ。……私、今、どのレイヤー触ってましたっけ……？」" +
                "[NEXT]" +
                "[NAME:NONE]サユキが虚ろな目でモニターを見つめている。完全に疲労がピークに達しているようだ。"
            );
            data.setChoice1Text("一旦セーブして、15分だけ目を閉じなよ");
            data.setChoice2Text("俺が代われるところは代わるよ");
            data.setChoice3Text("しっかりして。ここでミスったら一大事だ");

            data.setRes1(
                "[NAME:SAYUKI]「……。……そう、ですね。……少しだけ、頭冷やします……」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は素直にペンを置き、机に突っ伏した。的確な判断が功を奏した。"
            );
            data.setC1Love(2); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「……ありがとうございます。でも、ここは私の担当ですから。……大丈夫、やれます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は気力を振り絞り、再び画面に立ち向かった。その頑なな姿勢が痛々しい。"
            );
            data.setC2Love(1); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「……分かってますよ。……言われなくても……っ」" +
                "[NEXT]" +
                "[NAME:NONE]追い詰めるような言葉に、彼女は苛立ちを露わにした。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 5: // 未明のやり取り
            data.setMessage(
                "[NAME:NONE]外の空気が白み始めた頃。<br>ふと、机の端から丸められた小さな紙切れが飛んできた。" +
                "[NEXT]" +
                "[NAME:NONE]開いてみると、『あと少し。死なない程度に頑張りましょう』と走り書きされている。"
            );
            data.setChoice1Text("（『了解、相棒』と書いて投げ返す）");
            data.setChoice2Text("（無言でサムズアップして見せる）");
            data.setChoice3Text("（紙を丸めてゴミ箱に捨てる）");

            data.setRes1(
                "[NAME:SAYUKI]「……ふふっ」" +
                "[NEXT]" +
                "[NAME:NONE]紙切れを受け取った彼女が、小さく笑うのが見えた。疲労の中の、ささやかな安らぎだ。"
            );
            data.setC1Love(2); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「……っ。……はい」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し照れくさそうに頷き、気合を入れ直したようだ。"
            );
            data.setC2Love(3); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「……。……ひどい」" +
                "[NEXT]" +
                "[NAME:NONE]せっかくの彼女なりの気遣いを無下にしてしまった。空気が重くなる。"
            );
            data.setC3Love(-3); data.setC3Like(-2);
            break;

        case 6: // バグとの死闘
            data.setMessage(
                "[NAME:NONE]致命的なエラーが発生し、ビルドが通らない。原因が分からず、数時間が経過した。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……私の素材のデータ形式が悪いんでしょうか……？ それとも……」" +
                "[NEXT]" +
                "[NAME:NONE]サユキが自分のせいではないかと、不安そうに爪を噛んでいる。"
            );
            data.setChoice1Text("サユキさんのせいじゃない。絶対に俺が根本的な原因を見つける");
            data.setChoice2Text("一緒にコードを追ってくれないか");
            data.setChoice3Text("とりあえず素材を全部作り直してみて");

            data.setRes1(
                "[NAME:SAYUKI]「……" + pName + "さん。……はい。信じて、待ってますから」" +
                "[NEXT]" +
                "[NAME:NONE]彼女を安心させることで、俺自身も冷静さを取り戻すことができた。"
            );
            data.setC1Love(3); data.setC1Like(2);

            data.setRes2(
                "[NAME:SAYUKI]「……プログラムのことはよく分かりませんけど。私にできることなら、何でもします」" +
                "[NEXT]" +
                "[NAME:NONE]二人でエラーログを睨みつけ、ついに解決の糸口を掴んだ。"
            );
            data.setC2Love(1); data.setC2Like(4);

            data.setRes3(
                "[NAME:SAYUKI]「……っ！ 原因も分からないのに、適当なこと言わないでください！」" +
                "[NEXT]" +
                "[NAME:NONE]八つ当たりのような指示で、彼女を激怒させてしまった。"
            );
            data.setC3Love(-3); data.setC3Like(-4);
            break;

        case 7: // 最後の確認
            data.setMessage(
                "[NAME:SAYUKI]「……" + pName + "さん。ここの挙動、これで本当に問題ないか、もう一度だけ一緒に確認していいですか？」" +
                "[NEXT]" +
                "[NAME:NONE]すでに何度もテストした箇所だが、彼女の目には極度のプレッシャーからの不安が表れていた。"
            );
            data.setChoice1Text("何度でも付き合うよ。納得いくまでやろう");
            data.setChoice2Text("大丈夫、俺の書いたコードだ。信じてくれ");
            data.setChoice3Text("さっきも見たでしょ。時間ないんだから進めよう");

            data.setRes1(
                "[NAME:SAYUKI]「……ありがとうございます。……本当に、貴方がいてくれてよかったです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少し泣きそうな顔で笑い、一緒に画面を覗き込んだ。"
            );
            data.setC1Love(3); data.setC1Like(3);

            data.setRes2(
                "[NAME:SAYUKI]「……。……はい。そうですよね。貴方を疑うようなこと言って、ごめんなさい」" +
                "[NEXT]" +
                "[NAME:NONE]少し強引だったが、彼女は不安を飲み込んで頷いてくれた。"
            );
            data.setC2Love(1); data.setC2Like(2);

            data.setRes3(
                "[NAME:SAYUKI]「……。……分かりました。もう聞きません」" +
                "[NEXT]" +
                "[NAME:NONE]突き放した態度に、彼女は完全に心を閉ざしてしまった。"
            );
            data.setC3Love(-3); data.setC3Like(-2);
            break;

        case 8: // 夜明け
            data.setMessage(
                "[NAME:NONE]カーテンの隙間から、眩しい朝日が差し込んできた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……朝、ですね。……今日も徹夜、しちゃいましたね」" +
                "[NEXT]" +
                "[NAME:NONE]目を擦りながら、彼女がぼんやりと窓の外を見つめている。"
            );
            data.setChoice1Text("朝日が綺麗だね。今日も一日頑張ろう");
            data.setChoice2Text("あと少しで終わる。気合入れ直そうか");
            data.setChoice3Text("まぶしいからカーテン閉めて");

            data.setRes1(
                "[NAME:SAYUKI]「……ええ。なんだか、太陽の光を見ると、少しだけ元気が出ますね」" +
                "[NEXT]" +
                "[NAME:NONE]二人で朝日を浴びながら、不思議と穏やかな時間を共有した。"
            );
            data.setC1Love(2); data.setC1Like(2);

            data.setRes2(
                "[NAME:SAYUKI]「……はい。感傷に浸ってる暇はありませんね。やりますよ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は自分の頬をパチンと叩き、再びモニターと向き合った。"
            );
            data.setC2Love(0); data.setC2Like(3);

            data.setRes3(
                "[NAME:SAYUKI]「……。……はいはい、分かりましたよ」" +
                "[NEXT]" +
                "[NAME:NONE]せっかくの少しだけエモーショナルな空気を台無しにしてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-1);
            break;

        default:
            return getScenario(0, pName);
        }
        return data;
    }
}