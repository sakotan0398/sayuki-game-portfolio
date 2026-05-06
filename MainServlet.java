package sayukiGame.model.bo.scnarioDataLike;

import sayukiGame.model.beans.ScenarioData;
import sayukiGame.model.bo.scnarioDataCommon.Phase5;

public class LikePhase5 extends Phase5 {

    @Override
    public ScenarioData getScenario(int num, String pName) {
        
        // 0〜8番は共通ルート（CommonPhase5 / Phase5）のシナリオをそのまま使う
        if (num <= 8) {
            return super.getScenario(num, pName);
        }

        ScenarioData data = new ScenarioData();
        data.setPoolType("Like");

        switch (num) {
        case 9: // 絶望のバグと絶対の信頼
            data.setMessage(
                "[NAME:NONE]マスターアップ3日前。テストプレイ中に進行不能の致命的なバグが発覚した。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……嘘。どうして……。今からじゃ、根本のシステムを書き直す時間は……っ」" +
                "[NEXT]" +
                "[NAME:NONE]連日の徹夜で限界を迎えていたサユキの瞳から、スッと光が消えかけた。"
            );
            data.setChoice1Text("俺が絶対に直す。お前は絵の最終調整を続けろ");
            data.setChoice2Text("大丈夫、俺がついているから落ち着いて");
            data.setChoice3Text("パブリッシャーに延期を交渉しよう");

            // 選択肢1：プロとしての阿吽の呼吸（Like大正解）
            data.setRes1(
                "[NAME:SAYUKI]「……っ！ はい……！ 分かりました。貴方のコード、信じてますから！」" +
                "[NEXT]" +
                "[NAME:NONE]俺の迷いのない声に、彼女の目に再び強い光が宿った。最高の相棒の背中を守るため、キーボードを叩く。"
            );
            data.setC1Love(0); data.setC1Like(6);

            // 選択肢2：恋愛寄りの気遣い（今は求めていない）
            data.setRes2(
                "[NAME:SAYUKI]「慰めなんていりません！ 欲しいのは動くシステムです、手を動かしてください！」" +
                "[NEXT]" +
                "[NAME:NONE]鋭い声で一蹴された。今は優しさよりもエンジニアとしての腕が求められている。"
            );
            data.setC2Love(1); data.setC2Like(-1);

            // 選択肢3：妥協・諦め（大ハズレ）
            data.setRes3(
                "[NAME:SAYUKI]「……は？ ここまで来て白旗を上げるんですか？ クリエイターとしての意地はないんですか」" +
                "[NEXT]" +
                "[NAME:NONE]冷ややかな視線が突き刺さる。プロとして完全に失望されてしまった……。"
            );
            data.setC3Love(-1); data.setC3Like(-4);
            break;

        case 10: // 極限状態の燃料
            data.setMessage(
                "[NAME:NONE]深夜3時。サユキが空になったエナジードリンクの缶を力なく握りつぶした。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……集中力が、落ちてきました……。カフェイン、切れたかも……」"
            );
            data.setChoice1Text("（特濃のブラックコーヒーを無言で置く）");
            data.setChoice2Text("少し仮眠をとった方がいいよ");
            data.setChoice3Text("俺にもエナドリ1本ちょうだい");

            // 選択肢1：戦い抜くための燃料（Like大正解）
            data.setRes1(
                "[NAME:SAYUKI]「……ふふっ。悪魔みたいな差し入れですね。……いただきます、これで朝まで戦えます」" +
                "[NEXT]" +
                "[NAME:NONE]言葉を交わす必要すらない。彼女はコーヒーを一気に飲み干し、再びモニターの光の中へ意識を没入させた。"
            );
            data.setC1Love(0); data.setC1Like(4);

            // 選択肢2：優しさ（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「……ありがとうございます。でも、今寝たらもう起き上がれない気がするので、もう少しだけやらせてください」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は少しだけ微笑み、疲れた目をこすりながら作業に戻った。"
            );
            data.setC2Love(2); data.setC2Like(1);

            // 選択肢3：空気読めない（ハズレ）
            data.setRes3(
                "[NAME:SAYUKI]「……自分でコンビニ行って買ってきてください。私のストックはもうありません」" +
                "[NEXT]" +
                "[NAME:NONE]深夜の修羅場には不適切な発言だったようだ。"
            );
            data.setC3Love(0); data.setC3Like(-2);
            break;

        case 11: // 最後のこだわり
            data.setMessage(
                "[NAME:NONE]提出まで残り5時間。サユキが画面のUIを指さして、唇を噛んだ。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「ここ……ボタンのアニメーションが、私の想定より0.1秒遅いです。……でも、もう修正してる時間は……」"
            );
            data.setChoice1Text("直そう。俺が組み込み直すから、納得いくまでやれ");
            data.setChoice2Text("サユキさんの絵なら少しくらいズレてても可愛いよ");
            data.setChoice3Text("もう時間がないからそのままでいこう");

            // 選択肢1：妥協のないクリエイター魂（Like大正解）
            data.setRes1(
                "[NAME:SAYUKI]「……っ！ ありがとうございます、最高の相棒！ すぐにエフェクトのコマ数削って出し直します！」" +
                "[NEXT]" +
                "[NAME:NONE]俺の決断に、彼女は一切の迷いを捨てて猛スピードで修正を始めた。"
            );
            data.setC1Love(0); data.setC1Like(5);

            // 選択肢2：表面的な称賛（Like低下）
            data.setRes2(
                "[NAME:SAYUKI]「……そういうお世辞は求めてません。プレイヤーはそういう細部の違和感に気づくんです」" +
                "[NEXT]" +
                "[NAME:NONE]厳しい言葉でたしなめられた。適当な妥協は彼女に対する侮辱だ。"
            );
            data.setC2Love(0); data.setC2Like(-2);

            // 選択肢3：妥協（大ハズレ）
            data.setRes3(
                "[NAME:SAYUKI]「……妥協するんですね。分かりました。コーダーがそう言うなら、従いますよ」" +
                "[NEXT]" +
                "[NAME:NONE]深い深いため息をつかれた。作品への熱意を疑われてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(-4);
            break;

        case 12: // 限界の背中合わせ
            data.setMessage(
                "[NAME:NONE]朝方。疲労の極致に達した二人。サユキが椅子を回転させ、俺の椅子の背もたれに『コツン』と背中を預けてきた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……ふぅ。お疲れ様です。" + pName + "さん。……もう少しで、終わりますね」"
            );
            data.setChoice1Text("サユキさんの背中、頼もしいな");
            data.setChoice2Text("小さくて折れそうな背中だね");
            data.setChoice3Text("重いんだけど……");

            // 選択肢1：対等な戦友（Like正解）
            data.setRes1(
                "[NAME:SAYUKI]「ふふ、貴方の背中こそ。……絶対に、最高のゲームにして世界に出しましょうね」" +
                "[NEXT]" +
                "[NAME:NONE]目を閉じ、お互いの存在の大きさを背中で語り合った。恋愛とは違う、強靭な絆だ。"
            );
            data.setC1Love(1); data.setC1Like(4);

            // 選択肢2：庇護欲（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「……今は、女扱いしないでください。私は貴方の対等なパートナーなんですから」" +
                "[NEXT]" +
                "[NAME:NONE]そう言いながらも、背中から伝わる体温は少し上がったような気がした。"
            );
            data.setC2Love(3); data.setC2Like(0);

            // 選択肢3：トラップ
            data.setRes3(
                "[NAME:SAYUKI]「……っ。す、すみません。……気が緩んでました」" +
                "[NEXT]" +
                "[NAME:NONE]慌てて背中を離された。冷たい言葉が、戦友との温かい時間を壊してしまった。"
            );
            data.setC3Love(-2); data.setC3Like(-2);
            break;

        case 13: // マスターアップ！
            data.setMessage(
                "[NAME:NONE]『Build Success』――画面に表示された文字を見て、サユキが深く、深く息を吐き出した。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……終わった……。提出、完了しました……っ！」" +
                "[NEXT]" +
                "[NAME:NONE]極限のプレッシャーから解放され、彼女は満面の笑みでこちらを振り返った。"
            );
            data.setChoice1Text("（無言で力強いハイタッチを交わす）");
            data.setChoice2Text("（思わず抱きしめる）");
            data.setChoice3Text("やっと寝られる……");

            // 選択肢1：プロ同士の労い（Like大正解）
            data.setRes1(
                "[NAME:SAYUKI]「いぇいっ！ ……やりましたね、私たち！ 貴方のコードのおかげです！」" +
                "[NEXT]" +
                "[NAME:NONE]パーンッと乾いた音が響く。疲労困憊ながらも、彼女は誇り高い表情で笑った。"
            );
            data.setC1Love(0); data.setC1Like(5);

            // 選択肢2：Loveへの越境
            data.setRes2(
                "[NAME:SAYUKI]「ちょっ、ちょっと！？ ……も、もう。……まあ、今日だけは特別に許してあげます」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は一瞬驚いた後、顔を赤くしながらも小さく抱き返してくれた。"
            );
            data.setC2Love(4); data.setC2Like(1);

            // 選択肢3：余韻がない（ハズレ）
            data.setRes3(
                "[NAME:SAYUKI]「……相変わらず、余韻がない人ですね。まあ、本当にお疲れ様でした」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は静かに伸びをして、帰り支度を始めてしまった。"
            );
            data.setC3Love(-1); data.setC3Like(0);
            break;

        case 14: // 次の舞台へ（Likeルートの集大成）
            data.setMessage(
                "[NAME:NONE]打ち上げの帰り道、夜風を浴びながら歩いていると、サユキが真剣な顔で立ち止まった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「" + pName + "さん。……このゲームが売れたら、私、決めてることがあるんです」" +
                "[NEXT]" +
                "[NAME:SAYUKI]「貴方のコードと、私のデザイン。二人が組めば、絶対に世界を取れます。……私と一緒に、会社を作りませんか？」"
            );
            data.setChoice1Text("二人で会社を立ち上げよう。俺たちなら天下を取れる");
            data.setChoice2Text("ずっとサユキさんを支えたい");
            data.setChoice3Text("起業はリスクが高いし、今のままじゃダメなの？");

            // 選択肢1：共同創業者へ（Likeエンディングへのフラグ）
            data.setRes1(
                "[NAME:SAYUKI]「……！ はいっ！ どこまでもついていきますよ、私の『共同創業者』さん！」" +
                "[NEXT]" +
                "[NAME:NONE]差し出された彼女の右手を力強く握り返す。二人だけの新しいスタジオが、今、産声を上げた。"
            );
            data.setC1Love(0); data.setC1Like(8); // 特大加算

            // 選択肢2：ロマンチックな返答（Love寄り）
            data.setRes2(
                "[NAME:SAYUKI]「……それって、そういう意味、ですか……？ ……ばか、仕事の話をしてるのに」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は顔を真っ赤にして俯いてしまった。ビジネスパートナー以上の感情が芽生え始めている。"
            );
            data.setC2Love(5); data.setC2Like(2);

            // 選択肢3：致命的トラップ（関係崩壊）
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