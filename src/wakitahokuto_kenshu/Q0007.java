package wakitahokuto_kenshu;


//javaが用意しているutilパッケージにあるCalendarクラスを使えるようにする
import java.util.Calendar;

//javaの用意するtextパッケージにあるSimpleDateFormatクラスを使えるようにする
import java.text.SimpleDateFormat;

public class Q0007 {

	public static void main(String[] args) {
		
		//CalendarクラスのインスタンスnowDateをCalendarクラスにあるgetInstanceメソッドを使って作成する。
		Calendar nowDate = Calendar.getInstance();

		//SimpleDateFormatクラスの新たなインスタンスを名前をsdfとして作成。中身は2026/07/22 01:52のようなSimpleDateFormatの形式を指定する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm");
		
		//文字列型の変数ampmを宣言
		String ampm;
		
		//CalendarクラスのAM,PMを取得するメソッドを使用してnowDateから現在のAM,PMを取得し、その値が0(AM)なら{}内の処理を行う
		if(nowDate.get(Calendar.AM_PM)==0) {
			
			//変数ampmに文字列"AM"を代入
			ampm = "AM";
			
		//AM_PMが0でない値を取る(1を取る)ならば{}内の処理を行う
		}else{
			
			//変数ampmに文字列"PM"を代入
			ampm = "PM";
		}
		
		//nowDateインスタンスに現在時刻を取得するメソッドgetTime()を使用して時間を取得し、先ほど代入したAMもしくはPMを文字列として連結し、それを出力。
		System.out.println(sdf.format(nowDate.getTime()) + " " + ampm);
	}

}