package wakitahokuto_kenshu;

import java.util.Calendar;

public class Q0014 {

	public static void main(String[] args) {
		
		//日付や時刻の演算処理群型の、変数nowDateに、日付や時刻の演算処理群の、グレゴリオ暦体系を扱う処理群型の実体を作成して現在日時を設定する処理の結果を、代入する。
		Calendar nowDate = Calendar.getInstance();
		
		//整数型の、変数secondに、変数nowDateの、日付や時刻の演算処理群において、秒を表す要素を取得した結果を、代入する
		int second = nowDate.get(Calendar.SECOND);
		
		//整数型の、変数aに10を代入し、変数bに15を代入する。
		int a = 10, b = 15;
		
		//変数secondを2で割った余りが、1ならば{}内の処理を行う。
		if(second % 2 == 1) {
			
			//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、Q0013処理群の変数aと変数bを引数とした和を計算する処理calSumの結果と、カンマと、Q0013処理群の変数aと変数bを引数とした積を計算する処理calProの結果、をコンソールへ出力して改行する。
			System.out.print(Q0013.calSum(a, b) + "," + Q0013.calPro(a, b));
		
		//変数secondを2で割った余りが、1でないならば{}内の処理を行う。
		}else {
			
			//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、Q0013処理群の変数aと変数bを引数とした差を計算する処理calDifの結果と、カンマと、Q0013処理群の変数aと変数bを引数とした商を計算する処理calQuoの結果、をコンソールへ出力して改行する。
			System.out.println(Q0013.calDif(a, b) + "," + Q0013.calQuo(a, b));
		}
		
	}

}
