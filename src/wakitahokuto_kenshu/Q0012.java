package wakitahokuto_kenshu;

public class Q0012 {

	public static void main(String[] args) {
		
		//浮動小数点数型の、変数piに、3.141592を代入する。
		double pi=3.141592;
		
		//浮動小数点数型の、変数pi_roundに、数学計算に特化した処理群の、変数piを100倍した値を引数とした、引数に最も近い整数値を返す処理の結果、を100.0という浮動小数点数で割った値を代入する。
		double pi_round = Math.round(pi * 100) / 100.0;
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数pi_roundをコンソールへ出力して改行する。
		System.out.println(pi_round);
	}

}
