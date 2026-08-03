package wakitahokuto_kenshu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q0008 {

	public static void main(String[] args) {
		
		//日付や時刻を扱う処理群型の、変数nowDateに、日付や時刻を扱う処理群を実体化し、現在日時を取得し、代入する。
		Date nowDate = new Date();

		//日付の形式化と解析を行う処理群型の、変数sdfに、日付の形式化と解析を行う処理群を実体化し、日時形式を"年 月 日 24時間表記の時間 分"として設定し、代入する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日 HH時 mm分");
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数sdfの、"現在 "と変数nowDateを指定した形式にした処理結果と"をお知らせします。"を結合した文字列を、コンソールへ出力して改行する。
		System.out.println("現在 " + sdf.format(nowDate) + "をお知らせします。");
	}
	
}
