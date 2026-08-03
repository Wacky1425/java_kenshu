package wakitahokuto_kenshu;

public class Q0013 {

	public static void main(String[] args) {
		
		//整数型の、変数aに10を代入し、変数bに15を代入する。
		int a=10,b=15;
		
		//整数型の、変数sumに、変数aと変数bを引数とした和を計算する処理の結果を代入する。
		int sum = calSum(a,b);
		
		//整数型の、変数difに、変数aと変数bを引数とした差を計算する処理の結果を代入する。
		int dif = calDif(a,b);
		
		//整数型の、変数proに、変数aと変数bを引数とした積を計算する処理の結果を代入する。
		int pro = calPro(a,b);
		
		//浮動小数点数型の、変数quoに、変数aと変数bを引数とした商を計算する処理の結果を代入する。
		double quo = calQuo(a,b);
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数sumと変数difと変数proと変数quoとカンマを結合した文字列をコンソールへ出力する。
		System.out.print(sum + "," + dif + "," + pro + "," + quo);

	}
	
	//どこからでもアクセス可能な、Q0013処理群で共有される、整数型の返り値で、整数型の引数aと整数型の引数bの和を返す処理calSum
	public static int calSum(int a, int b){
	
		//整数型の、変数ansに、変数aに変数bを足した結果を代入する。
		int ans = a + b;
		
		//この処理を終了して呼び出し元に変数ansを返す。
		return ans;
		
	}
	
	//どこからでもアクセス可能な、Q0013処理群で共有される、整数型の返り値で、整数型の引数aと整数型の引数bの差を返す処理calDif
	public static int calDif(int a, int b){
	
		//整数型の、変数ansに、変数aから変数bを引いた結果を代入する。
		int ans = a - b;
		
		//この処理を終了して呼び出し元に変数ansを返す。
		return ans;
		
	}
	
	//どこからでもアクセス可能な、Q0013処理群で共有される、整数型の返り値で、整数型の引数aと整数型の引数bの積を返す処理calPro
	public static int calPro(int a, int b){
	
		//整数型の、変数ansに、変数aに変数bを掛けた結果を代入する。
		int ans = a * b;
		
		//この処理を終了して呼び出し元に変数ansを返す。
		return ans;
		
	}
	
	//どこからでもアクセス可能な、Q0013処理群で共有される、浮動小数点数型の返り値で、整数型の引数aと整数型の引数bの商を返す処理calQuo
	public static double calQuo(int a, int b){
	
		//浮動小数点数型の、変数ansに、変数aを浮動小数点数型に変換した値を、変数bを浮動小数点数型に変換した値で割った結果を代入する。
		double ans = (double)a / (double)b;
		
		//この処理を終了して呼び出し元に変数ansを返す。
		return ans;	
	
	}

}