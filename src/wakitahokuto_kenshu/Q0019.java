package wakitahokuto_kenshu;

public class Q0019 {

	public static void main(String[] args) {

		//1900年から2100年までのうるう年を全てコンソールに出力する処理leap_yearを行う
		leap_year(1900,2100);
		
	}
	
	//同一クラス内でのみアクセス可能な、Q0019処理群で共有される、返り値のない、整数型の引数firstから整数型の引数lastまでの全てのうるう年を出力する処理leap_year
	private static void leap_year(int first, int last) {
		
		//整数型の変数aに変数firstを代入し、変数aが変数last以下であるならば、変数aを+1しながら、{}内の処理を繰り返す。
		for(int a = first ; a <= last ; a++) {
			
			//変数aを4で割った余りが0かつ変数aを100で割った余りが0でない、または、変数aを400で割った余りが0であるならば、{}内の処理を行う。
			if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
				
				//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数aをコンソールへ出力して改行する。
				System.out.println(a);
			}
		}
		
	}

}
