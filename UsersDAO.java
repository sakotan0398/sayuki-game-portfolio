package sayukiGame.model.bo.scnarioDataLike;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.bo.scnarioDataCommon.Phase4;

public class LikePhase4 extends Phase4 {

    @Override
    public ScenarioData getScenario(int num, String pName) {
        
        if (num <= 8) {
            return super.getScenario(num, pName);
        }

        ScenarioData data = new ScenarioData();
        data.setPoolType("Like");

        switch (num) {
        case 9: // 背中を預ける関係
            data.setMessage(
                "[NAME:NONE]リリース直前のデスマーチ。終わりの見えないバグ修正とリテイクの嵐に、アトリエの空気は張り詰めている。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……" + pName + "さん、バックエンドの処理、手伝ってくれませんか？ 私、UIのフロント側の修正に全集中したいんです」" +
                "[NEXT]" +
                "[NAME:NONE]振り返りもせず、モニターを睨みつけたまま彼女は尋ねてきた。そこには一辺の疑いもない、完全な信頼がある。"
            );
            data.setChoice1Text("任せろ。サユキさんは自分の絵だけに集中してくれ"); 
            data.setChoice2Text("俺もキツいんだけど…なんとかするよ"); 
            data.setChoice3Text("少し休憩しない？ 倒れちゃうよ"); 

            data.setRes1(
                "[NAME:SAYUKI]「……ふふ。頼もしい相棒ですね。背中は預けましたよ、絶対に落とさないでくださいね」" +
                "[NEXT]" +
                "[NAME:NONE]背中合わせでキーボードを叩く音が、まるで戦場に響く銃声のように心地よくシンクロし始めた。"
            );
            data.setC1Love(0); data.setC1Like(6);

            data.setRes2(
                "[NAME:SAYUKI]「……弱音吐いてる暇はありませんよ。死ぬ気で終わらせますよ」" +
                "[NEXT]" +
                "[NAME:NONE]発破をかけられてしまった。プロとしての覚悟が足りなかったか。"
            );
            data.setC2Love(0); data.setC2Like(-1);

            data.setRes3(
                "[NAME:SAYUKI]「……今は手を止める時じゃありません。貴方が休むなら、私一人でもやります」" +
                "[NEXT]" +
                "[NAME:NONE]彼女のクリエイターとしての炎に水を差してしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-3);
            break;

        case 10: // 怒りと庇護
            data.setMessage(
                "[NAME:NONE]パブリッシャーからの急で理不尽な仕様変更要求。しかも、プログラム側の根本的な構造を否定するような内容だった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ふざけないで。あの人たち、" + pName + "さんがどれだけ完璧なコードを組んだか全く分かってない！」" +
                "[NEXT]" +
                "[NAME:NONE]俺が何も言う前に、サユキが台を蹴り飛ばす勢いで立ち上がり、激怒していた。"
            );
            data.setChoice1Text("ありがとう、サユキさん。でも俺から掛け合うよ"); 
            data.setChoice2Text("サユキさんの作品を舐められないよう、二人で反論しよう"); 
            data.setChoice3Text("仕方ないよ、向こうがお客さんだ"); 

            data.setRes1(
                "[NAME:SAYUKI]「……ダメです。私も一緒に言います。貴方のコードを否定されるのは、私の絵を否定されるより腹が立つんです！」" +
                "[NEXT]" +
                "[NAME:NONE]俺の仕事に対する彼女の絶大なリスペクトに、胸が熱くなった。"
            );
            data.setC1Love(2); data.setC1Like(5);

            data.setRes2(
                "[NAME:SAYUKI]「当然です！ 私たちのゲームのシステムを一番理解してるのは私たちです。絶対に論破してやりましょう！」" +
                "[NEXT]" +
                "[NAME:NONE]共通の敵を前に、二人のクリエイターとしての結束は鋼鉄のように固まった。"
            );
            data.setC2Love(1); data.setC2Like(6);

            data.setRes3(
                "[NAME:SAYUKI]「……。貴方がそれでいいなら、もう何も言いません。……幻滅しました」" +
                "[NEXT]" +
                "[NAME:NONE]プロとしてのプライドの無さに、底知れぬ失望を抱かせてしまった。"
            );
            data.setC3Love(-2); data.setC3Like(-5);
            break;

        case 11: // 最高の理解者
            data.setMessage(
                "[NAME:SAYUKI]「……ねえ。ここのイベントの演出、パターンAとB、どっちが『プレイヤーの心に刺さる』と思いますか？」" +
                "[NEXT]" +
                "[NAME:NONE]サユキが、真剣な眼差しで二つのラフを見せてきた。もはや単なるプログラマーとしての意見ではなく、『共同創作者』としての決断を求めている。"
            );
            data.setChoice1Text("Aの方がエモーショナルで、サユキさんらしいと思う"); 
            data.setChoice2Text("どっちも良いから、サユキさんが好きな方にしなよ"); 
            data.setChoice3Text("プログラム的に楽なのはBかな"); 

            data.setRes1(
                "[NAME:SAYUKI]「……！ やっぱり、貴方ならそう言ってくれると思ってました。……よし、Aで行きます。最高のコード、頼みましたよ」" +
                "[NEXT]" +
                "[NAME:NONE]迷いが晴れた彼女の顔は、自信に満ち溢れていた。最高の理解者になれた証だ。"
            );
            data.setC1Love(1); data.setC1Like(6);

            data.setRes2(
                "[NAME:SAYUKI]「……私が決めきれないから、貴方に意見を求めてるんです。無責任なこと言わないでください」" +
                "[NEXT]" +
                "[NAME:NONE]突き放されたと感じたのか、彼女は不満そうに画面を睨みつけた。"
            );
            data.setC2Love(-1); data.setC2Like(-2);

            data.setRes3(
                "[NAME:SAYUKI]「……妥協しろって言うんですね。分かりました、じゃあBにしますよ」" +
                "[NEXT]" +
                "[NAME:NONE]作品の質よりも効率を優先した発言に、彼女は明らかに落胆した。"
            );
            data.setC3Love(-2); data.setC3Like(-4);
            break;

        case 12: // 妥協なき戦い
            data.setMessage(
                "[NAME:NONE]テストプレイ中、サユキがふとマウスから手を離した。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……" + pName + "さん。ここのロード時間、あと0.2秒縮められるようにできませんか。テンポが気になります」" +
                "[NEXT]" +
                "[NAME:NONE]それは、すでに極限まで最適化したコードに対する、悪魔のような要求だった。"
            );
            data.setChoice1Text("無理だ。これ以上は物理的に不可能だよ"); 
            data.setChoice2Text("……分かった。アルゴリズムを根本から見直してみよう"); 
            data.setChoice3Text("そこまで気にするプレイヤーはいないって"); 

            data.setRes1(
                "[NAME:SAYUKI]「……そうですか。貴方が無理だと言うなら、諦めます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は引き下がったが、その目には『貴方なら限界を超えてくれると思っていたのに』という寂しさがあった。"
            );
            data.setC1Love(0); data.setC1Like(-2);

            data.setRes2(
                "[NAME:SAYUKI]「……！ ありがとうございます。無茶を言っているのは分かってます。でも、貴方なら絶対にできるって信じてるんです」" +
                "[NEXT]" +
                "[NAME:NONE]彼女の狂気的なこだわりと、俺への絶対的な信頼。これに応えなければプロじゃない。"
            );
            data.setC2Love(2); data.setC2Like(6);

            data.setRes3(
                "[NAME:SAYUKI]「プレイヤーを舐めないでください。神は細部に宿るんです。……直す気がないなら私がやります」" +
                "[NEXT]" +
                "[NAME:NONE]激怒させてしまった。クリエイターとしてのスタンスの違いが浮き彫りになった。"
            );
            data.setC3Love(-3); data.setC3Like(-5);
            break;

        case 13: // 戦友の休息
            data.setMessage(
                "[NAME:NONE]長かった一日の作業を終え、二人とも床のラグにへたり込んだ。" +
                "[NEXT]" +
                "[NAME:NONE]自然と背中合わせの体勢になる。お互いの背中から、じんわりと疲労と体温が伝わってくる。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ふぅ。お疲れ様です、相棒。……貴方の背中、すごく安心します」"
            );
            data.setChoice1Text("サユキさんの背中も、温かくて落ち着くよ"); 
            data.setChoice2Text("俺たち、最高のバディだ"); 
            data.setChoice3Text("重いよ、もたれかからないで"); 

            data.setRes1(
                "[NAME:SAYUKI]「……ふふ。なんだか、ずっと昔からこうして一緒にモノ作りをしてたみたいですね」" +
                "[NEXT]" +
                "[NAME:NONE]目を閉じ、お互いの存在の大きさを背中で語り合った。恋愛とは違う、強靭な絆だ。"
            );
            data.setC1Love(3); data.setC1Like(4);

            data.setRes2(
                "[NAME:SAYUKI]「ええ、間違いなく。私たち以上のタッグなんて、世界中探しても絶対に見つかりませんよ」" +
                "[NEXT]" +
                "[NAME:NONE]彼女の誇らしげな声が背中越しに響いた。疲労感すら心地よい最高の夜だ。"
            );
            data.setC2Love(1); data.setC2Like(6);

            data.setRes3(
                "[NAME:SAYUKI]「……っ。す、すみません。……気が緩んでました」" +
                "[NEXT]" +
                "[NAME:NONE]慌てて背中を離された。冷たい言葉が、戦友との温かい時間を壊してしまった。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 14: // 未来の共同設立者
            data.setMessage(
                "[NAME:SAYUKI]「……" + pName + "さん。私、決めたんです」" +
                "[NEXT]" +
                "[NAME:NONE]アトリエの窓から差し込む朝焼けの光の中、サユキが真剣な顔で振り返った。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「このゲームが成功したら……私と一緒に、会社を作りませんか？」" +
                "[NEXT]" +
                "[NAME:SAYUKI]「貴方のコードと、私のデザイン。二人が組めば、絶対に世界を取れます。……私と、一生一緒にゲームを作ってください」"
            );
            data.setChoice1Text("最高のプロポーズだ。喜んで受けるよ、相棒"); 
            data.setChoice2Text("もちろん。俺たちの伝説はここからだ"); 
            data.setChoice3Text("起業はリスクが高いし、今のままじゃダメなの？"); 

            data.setRes1(
                "[NAME:SAYUKI]「プ、プロポーズって……！ 言葉選び、おかしいですよバカ……っ。……でも、よろしくお願いします、私の最高の相棒」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は顔を赤らめながらも、力強く右手を差し出してきた。その手を、生涯離さないと誓った。"
            );
            data.setC1Love(3); data.setC1Like(6);

            data.setRes2(
                "[NAME:SAYUKI]「はいっ！ ……ふふっ、貴方なら絶対にそう言ってくれるって信じてました。さあ、世界をひっくり返しましょう！」" +
                "[NEXT]" +
                "[NAME:NONE]差し出された彼女の右手を力強く握り返す。二人だけの新しいスタジオが、今、産声を上げた。"
            );
            data.setC2Love(1); data.setC2Like(7); // 特大加算

            data.setRes3(
                "[NAME:SAYUKI]「……。……そう、ですね。夢を見すぎました。忘れてください」" +
                "[NEXT]" +
                "[NAME:NONE]彼女の差し出した手は、空を切って力なく下ろされた。一生に一度の誘いを無下にしてしまった。"
            );
            data.setC3Love(-4); data.setC3Like(-6);
            break;

        default:
            return super.getScenario(0, pName);
        }
        return data;
    }
}