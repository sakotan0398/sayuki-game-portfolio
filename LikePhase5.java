package sayukiGame.model.bo;

import sayukiGame.model.beans.Sayuki_Sakota;
import sayukiGame.model.beans.ScenarioData;

public class Ivent_fess {

    public ScenarioData getScenario(int step, String pName, Sayuki_Sakota s) {
        ScenarioData data = new ScenarioData();
        data.setPoolType("Event");

        switch (step) {
        case 1: // 【起】待ち合わせと情景描写
            data.setMessage(
                "【🏮 夏の特別イベント：海辺の夏祭り】<br><br>" +
                "※イベントルール：選択肢によって『イベントスコア』が蓄積されます。<br>" +
                "成功すれば、現在低い方のステータスが大幅にアップし、逆転のチャンスとなります！<br><br>" +
                "[NEXT]" +
                "[NAME:NONE]8月も終わりに近づき、茹だるような暑さも少しだけ和らいできた夕暮れ時。<br>" +
                "連日のマスターアップに向けた激務を労うため、俺はサユキさんを地元の大きな夏祭りに誘い出した。" +
                "[NEXT]" +
                "[NAME:NONE]神社の境内から漏れ聞こえるお囃子の音と、提灯の暖かな光。待ち合わせの鳥居前には、すでに大勢の人が行き交っている。<br>" +
                "（いつも作業着だから、今日もパーカーで来るんだろうな……）" +
                "[NEXT]" +
                "[NAME:NONE]そんなことを考えながら人波を眺めていると、ふと、涼しげな水色と白のコントラストが目に飛び込んできた。<br>" +
                "紺地に朝顔が描かれた浴衣。いつもより少しだけ丁寧にまとめられた髪。喧騒の中で、彼女の周りだけスッと風が吹き抜けたように見えた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……あ、" + pName + "さん。その……お待たせしました」" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……何、ジロジロ見てるんですか。浴衣なんて着慣れないから……帯も苦しいし、歩きにくいし……変じゃ、ないですか？」"
            );
            data.setChoice1Text("すごく綺麗だ。見惚れちゃった"); // Love (+8)
            data.setChoice2Text("新鮮だね。今日は思いっきり楽しもう"); // Like (+8)
            data.setChoice3Text("いつものパーカーの方が落ち着くかも"); // Bad (0)

            data.setRes1("[NAME:SAYUKI]「み、見惚れるって……！ ～～っ、あなた、さらっと恥ずかしいこと言わないでくださいっ」[NEXT][NAME:NONE]彼女は顔を真っ赤にして俯いたが、わずかに口元が緩んでいるのが見えた。");
            data.setRes2("[NAME:SAYUKI]「……。……そ、そうですか。なら、よかったです。行きましょうか」[NEXT][NAME:NONE]少し照れくさそうに微笑み、彼女はカランコロンと下駄の音を鳴らして隣に並んだ。");
            data.setRes3("[NAME:SAYUKI]「……そうですか。せっかく慣れない帯結んで、準備したのに」[NEXT][NAME:NONE]分かりやすくテンションを下げさせてしまった。");

            data.setC1Love(8); data.setC1Like(2);
            data.setC2Love(2); data.setC2Like(8);
            data.setC3Love(0); data.setC3Like(0);
            break;

        case 2: // 【承】屋台と非日常感
            data.setMessage(
                "[NAME:NONE]立ち並ぶ屋台からは、焼きそばや綿飴の甘ばしい香りが漂ってくる。<br>" +
                "普段はPCの排熱とコーヒーの香りに包まれている俺たちにとって、この圧倒的な非日常感は良い刺激になっていた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「あ……りんご飴。それに、水ヨーヨー……。ふふっ、なんだかUIのカラーパレットみたいに鮮やかですね」" +
                "[NEXT]" +
                "[NAME:NONE]お祭りでもクリエイターの癖が抜けない彼女の横顔を見ながら歩いていると、射的屋の前で彼女の足がピタリと止まった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……あの景品の謎の生き物のぬいぐるみ、ちょっと敵キャラのモデリングの参考になりそう……！」" +
                "[NEXT]" +
                "[NAME:NONE]彼女は真剣な眼差しでコルク銃を構えた。<br>" +
                "しかし、クリエイターとしての眼力とは裏腹に、放たれたコルクは惜しくも景品をかすめて外れてしまった。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「ああっ、もうちょっとだったのに……！ マウスのエイムには自信があったんですけど……くやしい……っ」"
            );
            data.setChoice1Text("俺に任せて。絶対取ってやるよ"); // Like (+8)
            data.setChoice2Text("もう少し右を狙うといいよ（横からアドバイスする）"); // Love (+8)
            data.setChoice3Text("無駄遣いだよ、諦めて次に行こう"); // Bad (0)

            data.setRes1("[NAME:SAYUKI]「本当ですか！？ 相棒の意地、見せてくださいね！」[NEXT][NAME:NONE]宣言通り景品を打ち落とすと、彼女は子供のように無邪気な笑顔を見せてくれた。");
            data.setRes2("[NAME:SAYUKI]「こ、こうですか……？ あ、当たりました！」[NEXT][NAME:NONE]アドバイスの通りに撃つと見事に命中。至近距離から聞こえた俺の声に、彼女は少しだけ肩をすくめて照れくさそうに笑った。");
            data.setRes3("[NAME:SAYUKI]「……分かってますよ。どうせ私のワガママですから」[NEXT][NAME:NONE]少し拗ねたように、彼女は足早に歩き出してしまった。");

            data.setC1Love(2); data.setC1Like(8); 
            data.setC2Love(8); data.setC2Like(2);
            data.setC3Love(0); data.setC3Like(0);
            break;

        case 3: // 【転】人混みと物理的な接近
            data.setMessage(
                "[NAME:NONE]夜の帳が完全に下り、遠くで花火大会の開始を告げるアナウンスが響いた。<br>" +
                "途端に、メイン会場へ向かう人の波が急激に激しさを増す。" +
                "[NEXT]" +
                "[NAME:NONE]押し寄せる波に逆らえず、二人の距離が強制的に縮まる。<br>" +
                "普段のアトリエでは絶対にありえないほどの距離感。彼女の髪から、微かに甘いシャンプーの香りがした。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「わっ……！？ きゅ、急に人が増えて……っ！ 押さないで……っ」" +
                "[NEXT]" +
                "[NAME:NONE]通行人の肩がぶつかり、慣れない下駄を履いたサユキさんが大きくバランスを崩した。<br>" +
                "このままだと、完全に人混みに飲まれ、はぐれてしまいそうだ。"
            );
            data.setChoice1Text("はぐれないように、俺の袖を掴んでて"); // Like (+8)
            data.setChoice2Text("少し後ろに隠れてて（人波から庇う）"); // Love (+8)
            data.setChoice3Text("ちゃんとはぐれないようについてきてよ"); // Bad (0)

            data.setRes1("[NAME:SAYUKI]「あ……はいっ。引っ張ってて、くださいね」[NEXT][NAME:NONE]彼女は俺の浴衣の袖を、はぐれないようにギュッと強く握りしめた。");
            data.setRes2("[NAME:SAYUKI]「あ……すみません、助かります」[NEXT][NAME:NONE]彼女を人混みから守るように立つと、彼女は俺の背中越しに小さく安堵の息をついた。");
            data.setRes3("[NAME:SAYUKI]「そんなこと言ったって、人が多くて……きゃっ！」[NEXT][NAME:NONE]通行人にぶつかられ、少し痛そうに肩を押さえている。");

            data.setC1Love(2); data.setC1Like(8);
            data.setC2Love(8); data.setC2Like(2);
            data.setC3Love(0); data.setC3Like(0);
            break;

        case 4: // 【結①】花火とクリエイターの苦悩
            data.setMessage(
                "[NAME:NONE]人混みをどうにか抜け出し、俺たちは少し小高い丘の上の静かな広場に出た。<br>" +
                "荒くなった呼吸を整えようとしたその瞬間――ドンッ！と、腹の底に響くような轟音と共に、夜空に大輪の花火が咲き誇った。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「わぁ……！ 綺麗……」" +
                "[NEXT]" +
                "[NAME:NONE]暗闇を彩る光が、彼女の横顔を鮮やかに照らし出す。<br>" +
                "瞳に花火を映しながら、彼女はどこか切なそうな、それでいて熱を帯びた声で呟いた。" +
                "[NEXT]" +
                "[NAME:SAYUKI]「……でも、少しだけ悔しいかも。<br>" +
                "花火のこの圧倒的な光の粒や、空気の震える感じ……。どれだけハイスペックなモニターでも、最先端のエンジンでも、今の私たちじゃ完全に再現できないから……」"
            );
            data.setChoice1Text("俺たちのゲームなら、もっと感動を作れるよ"); // Like (+8)
            data.setChoice2Text("でも、今のサユキさんの笑顔もすごく綺麗だよ"); // Love (+8)
            data.setChoice3Text("職業病だね。今はただ楽しもうよ"); // Bad (0)

            data.setRes1("[NAME:SAYUKI]「……！ ふふっ、大きく出ましたね。……でも、貴方となら作れる気がします」[NEXT][NAME:NONE]花火の光に負けないくらい、彼女の笑顔は誇り高きクリエイターのものだった。");
            data.setRes2("[NAME:SAYUKI]「なっ……！ だ、だからそういうこと、平気な顔して言わないでください……っ」[NEXT][NAME:NONE]彼女は顔を赤くしてそっぽを向いたが、その表情は花火よりも輝いて見えた。");
            data.setRes3("[NAME:SAYUKI]「……そうですね。忘れてください」[NEXT][NAME:NONE]彼女は少し寂しそうに、無言で夜空を見つめ続けた。");

            data.setC1Love(2); data.setC1Like(8);
            data.setC2Love(8); data.setC2Like(2);
            data.setC3Love(0); data.setC3Like(0);
            break;

        case 5: // 【結②】結果発表
            if (s.getEventScore() >= 24) {
                
                // 💡 逆転・底上げロジック
                if (s.getLikePoint() > s.getLovePoint()) {
                    // 👉 仕事仲間（Like）寄りだった場合：Loveを底上げ
                    data.setMessage(
                        "[NAME:NONE]帰り道。祭りの熱気から少し離れた静かな夜道で、サユキさんが少し恥ずかしそうに俺の袖を引っ張った。" +
                        "[NEXT]" +
                        "[NAME:SAYUKI]「……あの、今日のこと、仕事仲間には内緒にしてくださいね。だって、これじゃ……まるで本当のデートみたいだったから……っ」" +
                        "[NEXT]" +
                        "[NAME:NONE]（仕事の相棒としてだけでなく、一人の異性としても強く意識し始めたようだ！）"
                    );
                    s.addLovePoint(15); 
                } else {
                    // 👉 恋愛（Love）寄りだった場合：Likeを底上げ
                    data.setMessage(
                        "[NAME:NONE]帰り道。夜風が涼しく吹き抜ける中、サユキさんが晴れやかな表情でこちらを振り返った。" +
                        "[NEXT]" +
                        "[NAME:SAYUKI]「あの、" + pName + "さん。私、今日で確信しました。貴方は私の最高の相棒で……世界で一番信頼できる人です」" +
                        "[NEXT]" +
                        "[NAME:NONE]（お互いの技術と志を認め合い、二人の絆がかつてないほど強まった！）"
                    );
                    s.addLikePoint(15); 
                }

            } else {
                data.setMessage(
                    "[NAME:NONE]帰り道。" +
                    "[NEXT]" +
                    "[NAME:SAYUKI]「今日はありがとうございました。……じゃあ、また明日。アトリエで」" +
                    "[NEXT]" +
                    "[NAME:NONE]サユキは軽く会釈をして、足早に帰ってしまった。少し距離の詰め方を間違えたかもしれない……。"
                );
            }
            
            data.setChoice1Text("日常に戻る"); data.setChoice2Text("日常に戻る"); data.setChoice3Text("日常に戻る");
            data.setRes1(""); data.setRes2(""); data.setRes3("");
            break;
        }
        return data;
    }
}