package wakitahokuto_kenshu;

import java.util.Calendar;

public class Q0009 {

	public static void main(String[] args) {
		
		//日付や時刻の演算処理群型の、変数nowDateに、日付や時刻の演算処理群の、グレゴリオ暦体系を扱う処理群型の実体を作成して現在日時を設定する処理を行った結果を、代入する。
		Calendar nowDate = Calendar.getInstance();
		
		//変数nowDateの、日付や時刻の演算処理群において、時間を表す要素に-17を加算する。
		nowDate.add(Calendar.HOUR_OF_DAY,-17);
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数nowDateの時間値を日付や時刻を扱う処理群型で返し、コンソールへ出力して改行する。
		System.out.println(nowDate.getTime());
	}
	
}
