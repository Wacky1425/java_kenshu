package wakitahokuto_kenshu;

import java.util.Random;

public class Q0020 {

	public static void main(String[] args) {
		
		//整数型の変数a_flagに、0を代入する。
		int a_flag = 0;
		
		//整数型の変数iに1を代入し、変数iが10以下かつ変数a_flagが3未満であるならば、変数iを+1しながら、{}内の処理を繰り返す。
		for(int i = 1;i<=10 && a_flag<3;i++) {
			
			//疑似乱数を生成する処理群型の、変数randに、疑似乱数を生成する処理群を実体化し、乱数生成の開始値を自動で決定し、代入する。
			Random rand = new Random();
			
			//整数型の変数aに、疑似乱数を生成する処理群の、0から2までの範囲で1つの整数を返す処理結果を代入する。
			int a=rand.nextInt(3);
			
			//整数型の変数bに、疑似乱数を生成する処理群の、0から2までの範囲で1つの整数を返す処理結果を代入する。
			int b=rand.nextInt(3);
			
			//真偽値型の変数aiko_flagに、偽を代入する。
			boolean aiko_flag = false;
			
			//数学計算処理群の、変数aと変数bの差の絶対値を取る処理の結果によってcase文で処理を指定する。
			switch(Math.abs(a-b)) {
				
				//switch文で指定した式の結果が1であれば、:以下の処理を行う。
				case 1:
					
					//変数aが変数bよりも大きければ、{}内の処理を行う。
					if(a>b) {
						
						//変数a_flagに0を代入する。
						a_flag = 0;
					
					//変数aが変数b以下であれば、{}内の処理を行う。
					}else {
						
						//変数a_flagを+1する。
						a_flag++;
					}
					
					//switch文を終了し、次の処理に移る。
					break;
					
				//switch文で指定した式の結果が0であれば、:以下の処理を行う。
				case 0:
					
					//変数a_flagに0を代入する。
					a_flag = 0;
					
					//変数aiko_flagに真を代入する。
					aiko_flag = true;
					
					//switch文を終了し、次の処理に移る。
					break;
					
				//switch文で指定した式の結果が2であれば、:以下の処理を行う。
				case 2:
					
					//変数aが変数bよりも大きければ、{}内の処理を行う。
					if(a>b) {
						
						//変数a_flagを+1する。
						a_flag++;
						
					//変数aが変数b以下であれば、{}内の処理を行う。
					}else {
						
						//変数a_flagに0を代入する。
						a_flag = 0;
					}
			}
			
			//文字列型の、変数winnerを作成する。
			String winner;
			
			//変数aiko_flagが真であれば、{}内の処理を行う。
			if(aiko_flag) {
				
				//変数winnerに"なし"を代入する。
				winner = "なし";
				
			//変数aiko_flagが偽で、a_flagが0であれば、{}内の処理を行う。
			}else if(a_flag == 0){
				
				//変数winnerに"Aさん"を代入する。
				winner = "Aさん";
			
			//変数aiko_flagが偽で、a_flagが0でなければ、{}内の処理を行う。
			}else {
				
				//変数winnerに"Bさん"を代入する。
				winner = "Bさん";
			}
			
			//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数iと"回目"と、"Aさん"と変数aを実際のハンドに変換する処理handの結果と、"Bさん"と変数bを実際のハンドに変換する処理handの結果と、"勝者"と変数winner、をコンソールへ出力して改行する。
			System.out.println(i + "回目" + " Aさん" + hand(a) + " Bさん" + hand(b) + " 勝者：" + winner);	
		}
	}
	
			//同一クラス内でのみアクセス可能な、Q0020処理群で共有される、返り値が文字列型の、整数型の引数aを実際のジャンケンのハンドに割り当てて文字として返す処理
			private static String hand(int a) {
				
				//文字列型の変数ansに何も定義されていない状態を表す値を代入する。
				String ans = null;
				
				//変数aの値によりcase文で処理を行う。
				switch (a) {
				
					//変数aの値が0ならば、:以下の処理を行う。
					case 0:
						
						//変数ansに"パー"を代入する。
						ans = "パー";
						
						//switch文を終了し、次の処理に移る。
						break;
						
					//変数aの値が1ならば、:以下の処理を行う。
					case 1:
						
						//変数ansに"チョキ"を代入する。
						ans = "チョキ";
						
						//switch文を終了し、次の処理に移る。
						break;
						
					//変数aの値が2ならば、:以下の処理を行う。
					case 2:
						
						//変数ansに"グー"を代入する。
						ans = "グー";
						
				}
				
				//この処理を終了して呼び出し元に変数ansを返す。
				return ans;
			}
}
