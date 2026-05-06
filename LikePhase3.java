package sayukiGame.model.bo;

import java.util.Scanner;

import sayukiGame.model.beans.Player;
import sayukiGame.model.beans.Sayuki_Sakota;

public abstract class Dialogue {
	//文字をカタカタさせる
	protected void typeWrite(String text) {
		for (char c : text.toCharArray()) {
			
			System.out.print(c);
			try {Thread.sleep(35);
			}
	catch (InterruptedException e) {}	
		}
		System.out.println();
	}
	// エンターキーを押して次に行く
		public void waitEnter(Scanner sc) {
			System.out.print("Entre>>");
			sc.nextLine();
		}
		
		public void refresh() {
			for(int i = 0; i<7; i++) {
				System.out.println();
		}
	}  
		public int inputChecker(Scanner sc) {
		    while (true) {
		        System.out.print("選択 (1-3) > ");
		        if (sc.hasNextInt()) { // 数字
		            int input = sc.nextInt();
		            sc.nextLine(); // 改行
		            if (input >= 1 && input <= 3) return input; // 1～3ならOK
		        } else {
		            sc.next(); // 文字なら読み飛ばす
		        }
		        System.out.println("※1～3の数字を入力してください。");
		    }
		}
		public abstract int play(Scanner sc, Player p, Sayuki_Sakota s);	
}    
    
