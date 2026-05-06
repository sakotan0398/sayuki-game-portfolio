package sayukiGame.model.bo;

import java.util.Scanner;

import sayukiGame.model.beans.Player;
import sayukiGame.model.beans.Sayuki_Sakota;

public class Ivent_Item extends Dialogue {

	@Override
	public int play(Scanner sc, Player p, Sayuki_Sakota s) {
		refresh();

		// 1. コーヒー                    
		if (p.isHasCoffee()) {
			refresh();
			
			int lp = s.getLovePoint();

			// Phase 2
			if (lp >= 16 && lp < 32) {
				typeWrite(s.getName() + "「……あ、"+p.getName()+"さん。……えっ、これ、コーヒーですか？」");
				typeWrite("サユキは驚いたように目を丸くし、それから少し照れくさそうに微笑んだ。");
				waitEnter(sc);
				typeWrite(s.getName() + "「この前、眠いって言ったの……覚えててくれたんですね。ありがとうございます」");
				typeWrite("彼女は温かいカップを両手で包み、一口飲んで小さく息を吐いた。");
                waitEnter(sc);
				p.setHasCoffee(false); // アイテムを消費
				return 5; 
			}

			// Phase 3
			else if (lp >= 32 && lp < 48) {
				typeWrite(s.getName() + "「ふふ、ちょうど今『"+p.getName()+"さんのコーヒーが飲みたい』って思ってたところです」");
				typeWrite("サユキは迷わず手を受け取り、当然のようにあなたの隣に椅子を寄せた。");
				waitEnter(sc);
				typeWrite(s.getName() + "「不思議ですね。自分で淹れるより、"+p.getName()+"さんに貰うほうがずっと集中できる気がします」");
				typeWrite("二人の間に、コーヒーの香りと穏やかな時間が流れる。");
				waitEnter(sc);

				p.setHasCoffee(false);
				return 7;
			}
            // 隙間埋め
			else if (lp >= 48 && lp < 80) { // ★この範囲が抜けていました！
		    typeWrite(s.getName() + "「あ、コーヒー。ありがとうございます」");
		    typeWrite(s.getName() + "「"+p.getName()+"さんが淹れてくれるのを、ずっと待ってたんですよ？」");
		    
		    p.setHasCoffee(false); 
		    return 8;
			}
			
			// Phase 5
			else if (lp >= 80) {
				typeWrite(p.getName()+"がコーヒーを差し出すと、サユキは一瞬だけあなたの指に手を重ねた。");
				typeWrite(s.getName() + "「……ありがとう。……なんだか、こうしてもらうのが、一番甘えられてる気がして嬉しいです」");
				waitEnter(sc);
				typeWrite("サユキは一口飲むと、とろけるような笑顔であなたを見つめた。");
				typeWrite(s.getName() + "「あの……、これからもずっと、私の隣でコーヒーを淹れてくれませんか……？」");
				waitEnter(sc);

				p.setHasCoffee(false);
				int gain = (lp + 10 >= 100) ? (99 - lp) : 10; // 99を超えないように調整
				return gain;
			}
		}
        // 2. 教本
		if (p.isHasBook()) {
			refresh();
			int lp = s.getLovePoint();

			// Phase 2 
			if (lp >= 16 && lp < 32) {
				typeWrite(s.getName() + "「……えっ。この本、私が探していたリファレンス本……！」");
				typeWrite(s.getName()+"は勢いよく立ち上がり、差し出した本を食い入るように見つめた。");
				waitEnter(sc);
				typeWrite(s.getName() + "「Blenderのノードの組み方、ずっと独学で悩んでたんです。……どうして私が欲しかったって分かったんですか？」");
				typeWrite("彼女は本を胸に抱え、少しだけ頬を赤らめてあなたを見上げた。");
				typeWrite(s.getName() + "「……ありがとうございます、"+p.getName()+"さん。これ、大事に読みますね」");

				p.setHasBook(false); // アイテムを消費
				return 7;
			}

		     else if (lp >= 32 && lp < 64) {
		        // Phase 3～4 隙間埋め 
		        typeWrite(s.getName() + "「あ、この本！ ちょうどこの章の内容で詰まってたんです」");
		        typeWrite(s.getName() + "「ふふ、やっぱり"+p.getName()+"さんは私の『先生』ですね」");
		        return 6;
		     }
			
			// Phase 4
			else if (lp >= 64) {
				typeWrite("（サユキがソースコードの画面の前で頭を抱えている。あなたは無言で、買ってきた最新の技術資料を机に置いた）");
				typeWrite(s.getName() + "「……。……ふふ。やっぱり、"+p.getName()+"さんには敵わないな」");
				waitEnter(sc);
				typeWrite("サユキは顔を上げると、困ったような、でもどこか嬉しそうな笑顔を見せた。");
				typeWrite(s.getName() + "「ちょうどここのロジックで行き詰まってたんです。……何も言わなくても分かってくれるんですね」");
				waitEnter(sc);
				typeWrite(s.getName() + "「"+p.getName()+"がいてくれるから、私はもっと上を目指せます。……これからも、私を支えてくれますか？」");
				waitEnter(sc);

				p.setHasBook(false); // アイテムを消費
				return 8; 
			}
		}

		// 3.  ケーキ
		if (p.isHasSweets()) {
			refresh();
			int lp = s.getLovePoint();

			// Phase 3
			if (lp >= 32 && lp < 48) {
				typeWrite(s.getName() + "「……わっ、これ、駅前で人気のケーキじゃないですか！」");
				typeWrite("サユキはパッと表情を明るくし、箱の中を覗き込んで嬉しそうに笑った。");
				waitEnter(sc);
				typeWrite(s.getName() + "「ちょうど糖分が足りないな、って思ってたところなんです。ふふ、"+p.getName()+"さんはエスパーですか？」");
				typeWrite("彼女はフォークを準備しながら、あなたの分も椅子を引いて手招きした。");
				waitEnter(sc);
				typeWrite(s.getName() + "「さあ、一緒に食べましょう？ 一人より、二人で食べる方が絶対に美味しいですから」");
				waitEnter(sc);

				p.setHasSweets(false); // アイテムを消費
				return 7;
			}
			// Phase 4 隙間埋め
			else if (lp >= 48 && lp < 80) { 
		        typeWrite(s.getName() + "「……お疲れ様、ですか。なんだか、見透かされてるみたい」");
		        typeWrite(s.getName() + "「"+p.getName()+"さんの前だと、無理に背伸びしなくていい気がして……少し、甘えてもいいですか？」");
		        return 5;
			}    

			// Phase 5:
			else if (lp >= 80) {
				typeWrite("（作業が一段落した深夜。あなたがケーキを差し出すと、サユキは驚いた後、愛おしそうに瞳を細めた）");
				waitEnter(sc);
				typeWrite(s.getName() + "「……これ、私が前に『食べてみたい』って言ってた期間限定の……。覚えててくれたんですね」");
				typeWrite("サユキはケーキを一口食べると、幸せそうに頬を緩め、それからフォークをあなたの方へ向けた。");
				waitEnter(sc);
				typeWrite(s.getName() + "「……はい、あーん。……えへへ、変ですか？ でも、今の私は、こうしてあなたに甘えたい気分なんです」");
				typeWrite(s.getName() + "「ねえ、"+p.getName()+"さん。……私、世界で一番幸せなクリエイターかもしれません」");
				waitEnter(sc);

				p.setHasSweets(false); // アイテムを消費
				int gain = (lp + 10 >= 100) ? (99 - lp) : 10;// 99を超えないように調整
				return gain;
			}
		}

		// 4. PC冷却ファン
		if (p.isHasPC_Parts()) {
			refresh();
			int lp = s.getLovePoint();

			// Phase 3
			if (lp >= 32 && lp < 48) {
				typeWrite(s.getName() + "「……あ、これ。この前、ファンの音がうるさいかもって話してた……」");
				typeWrite("サユキは受け取った静音ファンを、愛おしそうに指でなぞった。");
				waitEnter(sc);
				typeWrite(s.getName() + "「"+p.getName()+"さんとお話ししながら作業したいから。……ふふ、嬉しい。さっそく付け替えてもいいですか？」");
				typeWrite("二人でケースを開けて、静かなファンに交換した。アトリエに穏やかな静寂が戻る。");
				waitEnter(sc);

				p.setHasPC_Parts(false); // アイテムを消費
				return 6;
			}

			// Phase 4 
			else if (lp >= 64) {
				typeWrite("（レンダリングの轟音とともに、サユキのPCが悲鳴を上げている。あなたは黙って最強の冷却パーツを差し出した）");
				typeWrite(s.getName() + "「……！ "+p.getName()+"さん、これ……これがあれば、今の重いシーンも描き出せます……！」");
				waitEnter(sc);
				typeWrite("サユキはあなたの手をぎゅっと握りしめ、真っ直ぐな瞳で感謝を伝えてきた。");
				typeWrite(s.getName() + "「私が止まりそうな時、いつも"+p.getName()+"さんが助けてくれますね。……もう、あなたがいない制作なんて考えられません」");
				waitEnter(sc);

				p.setHasPC_Parts(false); // アイテムを消費
				return 10;
			}
		}

		// 5. デッサン人形
		if (p.isHasDrawingDoll()) {
			refresh();
			int lp = s.getLovePoint();

			// Phase 4
			if (lp >= 64) {
				typeWrite("（以前、関節が緩くなったと言っていたデッサン人形。あなたは密かに用意していた新しいモデルを差し出した）");
				typeWrite(s.getName() + "「……えっ。これ、最新の可動域が広いタイプの……。……私のために、探してくれたんですか？」");
				waitEnter(sc);
				typeWrite("サユキは震える手で人形を受け取り、その滑らかな動きを確かめると、ふっと表情を和らげた。");
				typeWrite(s.getName() + "「……嬉しい。これで、ずっと描きたかった難しい角度のポーズも、自信を持って描けます」");
				typeWrite(s.getName() + "「"+p.getName()+"さんは、私が一番困っている時に、いつも魔法みたいに答えをくれますね」");
				waitEnter(sc);
				typeWrite(s.getName() + "「……ありがとうございます。この子と一緒に、最高の作品を仕上げてみせますから。見ていてくださいね」");
				waitEnter(sc);

				p.setHasDrawingDoll(false); // アイテムを消費
				s.setDollGiven(true); // 人形を渡したフラグを立てる
				return 10; 
			}
		}
		return 0;
	}
}