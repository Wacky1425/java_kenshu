package wakitahokuto_kenshu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q0007 {

	public static void main(String[] args) {
		
		//日付や時刻を扱う処理群型の、変数nowDateに、日付や時刻を扱う処理群を実体化し、現在日時を取得し、代入する。
		Date nowDate = new Date();

		//日付の形式化と解析を行う処理群型の、変数sdfに、日付の形式化と解析を行う処理群を実体化し、日時形式を"年/月/日 12時間表記の時間:分"として設定し、代入する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		
		//日付の形式化と解析を行う処理群型の、変数sdf_ampmに、日付の形式化と解析を行う処理群を実体化し、日時形式を"午前or午後"として設定し、代入する。
		SimpleDateFormat sdf_ampm = new SimpleDateFormat("a");
		
		//文字列型の、変数ampmを宣言
		String ampm;
		
		//変数sdf_ampmの、変数nowDateを"午前or午後"の形式に設定する処理を行い、"午前"と等しければ{}内の処理を行う。
		if(sdf_ampm.format(nowDate).equals("午前")) {
			
			//変数ampmに文字列"AM"を代入
			ampm = "AM";
			
		//変数sdf_ampmの、変数nowDateを"午前or午後"の形式に設定する処理を行い、"午前"と等しくなければ{}内の処理を行う。
		}else{
			
			//変数ampmに文字列"PM"を代入
			ampm = "PM";
		}
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数sdfの、変数nowDateを"年/月/日 12時間表記の時間:分"の形式に設定する処理を行った値を、コンソールへ出力して改行する。
		System.out.println(sdf.format(nowDate) + " " + ampm);
	}

}