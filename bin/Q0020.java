package wakitahokuto_kenshu;

import java.util.Random;

public class Q0020 {

	public static void main(String[] args) {
		
		
		
		int gu = 2;
		int cho = 1;
		int pa = 0;
		
		int a_flag = 0;
		
		
		for(int i = 1;i<=10;i++) {
			Random rand = new Random();
			int a=rand.nextInt(3);
			int b=rand.nextInt(3);
			boolean aiko_flag = false;
			
			System.out.println(a + ","+ b);
			
			switch(Math.abs(a-b)) {
				case 1:
					if(a>b) {
						a_flag = 0;
					}else {
						a_flag++;
					}
					break;
				case 0:
					a_flag = 0;
					aiko_flag = true;
					break;
				case 2:
					if(a>b) {
						a_flag++;
					}else {
						a_flag = 0;
					}
			}
			
			String a_hand, b_hand, winner;
			
			a_hand = "";
			b_hand = "";
			
			
			if(aiko_flag) {
				winner = "なし";
				
			}else if(a_flag == 0){
				winner = "Aさん";
								
			}else {
				winner = "Bさん";
			}
			
			System.out.println(i + "回目" + " Aさん" + a_hand + " Bさん" + b_hand + " 勝者：" + winner);
			
			
			
		}
		
		//ハンドが何にあたるかを文字として返す関数
//		private static String hand() {
//			switch 
//		}
			
			
		
		
		
	}
}
