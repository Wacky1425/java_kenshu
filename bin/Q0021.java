
package wakitahokuto_kenshu;


import java.util.Random;


public class Q0021 {

	
	public static void main(String[] args) {
		
		
		int[] a_flag = {0};
		
		
		for(int i = 1;i<=10 && a_flag[0]<3;i++) {
			
			
			Random rand = new Random();
			
			
			int a=rand.nextInt(3), b=rand.nextInt(3);
			
			
			System.out.println(i + "回目" + " Aさん" + hand(a) + " Bさん" + hand(b) + " 勝者：" + winner(a,b,a_flag));
		}	
	}
	
	//ハンドが何にあたるかを文字として返す関数
	private static String hand(int a) {
		
		
		switch (a) {
		
		
		case 0:
			
			
			return "パー";
			
			
		case 1:
			
			
			return "チョキ";
			
			
		case 2:
			
			
			return "グー";
		}
		
		
		return null;
	}
			
	//勝者を返す関数
	private static String winner(int a, int b, int[] a_flag) {
		
		
		switch(Math.abs(a-b)) {
		
		
			case 1:
				
				
				if(a>b) {
					
					
					a_flag[0] = 0;
					
					
					return "Aさん";
					
					
				}else {
					
					
					a_flag[0]++;
					
					
					return "Bさん";
					
					
				}
				
				
			case 0:
				
				
				a_flag[0] = 0;
				
				
				return "なし";
				
				
			case 2:
				
				
				if(a>b) {
					
					
					a_flag[0]++;
					
					
					return "Bさん";
					
					
				}else {
					
					
					a_flag[0] = 0;
					
					
					return "Aさん";
				}
		}
		
		
		return null;
	}
}