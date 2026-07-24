
package wakitahokuto_kenshu;


import java.util.Random;


public class Q0021 {

	
	public static void main(String[] args) {
		
		
		int[] a_flag = {0};
		
		
		for(int i = 1;i<=10 && a_flag[0]<3;i++) {
			
			
			Random rand = new Random();
			
			
			int a=rand.nextInt(3);
			
			
			int b=rand.nextInt(3);
			
			
			boolean aiko_flag = false;
			
			
			System.out.println(i + "回目" + " Aさん" + hand(a) + " Bさん" + hand(b) + " 勝者：" + winner(a,b,a_flag,aiko_flag));
		}	
	}
	
	//ハンドが何にあたるかを文字として返す関数
	private static String hand(int a) {
		
		
		String ans = null;
		
		
		switch (a) {
		
		
		case 0:
			
			
			ans = "パー";
			
			
			break;
			
			
		case 1:
			
			
			ans = "チョキ";
			
			
			break;
			
			
		case 2:
			
			
			ans = "グー";
		}
		
		
		return ans;
	}
			
	//勝者を返す関数
	private static String winner(int a, int b, int[] a_flag, boolean aiko_flag) {
		
		
				switch(Math.abs(a-b)) {
				
				
					case 1:
						
						
						if(a>b) {
							
							
							a_flag[0] = 0;
							
							
						}else {
							
							
							a_flag[0]++;
							
							
						}
						
						
						break;
						
						
					case 0:
						
						
						a_flag[0] = 0;
						
						
						aiko_flag = true;
						
						
						break;
						
						
					case 2:
						
						
						if(a>b) {
							
							
							a_flag[0]++;
							
							
						}else {
							
							
							a_flag[0] = 0;
						}
				}
				
				
				String winner;
				
				
				if(aiko_flag) {
					
					
					winner = "なし";
					
					
				}else if(a_flag[0] == 0){
					
					
					winner = "Aさん";
					
									
				}else {
					
					
					winner = "Bさん";
				}
				
				
				return winner;
	}
}
