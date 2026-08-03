package wakitahokuto_kenshu;

public class Q0011 {

	public static void main(String[] args) {
		
		//整数型の、変数aに10を代入し、変数bに15を代入する。
		int a=10,b=15;
		
		//整数型の、変数sumに、変数aに変数bを足した結果を代入する。
		int sum = a + b;
		
		//整数型の、変数difに、変数aから変数bを引いた結果を代入する。
		int dif = a - b;
		
		//整数型の、変数proに、変数aに変数bを掛けた結果を代入する。
		int pro = a * b;
		
		//浮動小数点数型の、変数quoに、変数aを浮動小数点数型に変換した値を、変数bを浮動小数点数型に変換した値で割った結果を代入する。
		double quo = (double)a / (double)b;
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数sumと変数difと変数proと変数quoとカンマを結合した文字列をコンソールへ出力する。
		System.out.print(sum + "," + dif + "," + pro + "," + quo);

	}

}
