package wakitahokuto_kenshu;

//javaの用意するtextパッケージにあるSimpleDateFormatクラスを使えるようにする
import java.text.SimpleDateFormat;
//javaが用意しているutilパッケージにあるCalendarクラスを使えるようにする
import java.util.Calendar;

public class Q0008 {

	public static void main(String[] args) {
		
		//CalendarクラスのインスタンスnowDateをCalendarクラスにあるgetInstanceメソッドを使って作成する。
		Calendar nowDate = Calendar.getInstance();

		//SimpleDateFormatクラスの新たなインスタンスを名前をsdfとして作成。中身は2026年 07月 22日 02時 16分のようなSimpleDateFormatの形式を指定する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日 hh時 mm分");
		
		
		//nowDateインスタンスに現在時刻を取得するメソッドgetTime()を使用して時間を取得し、それに"現在 "と"をお知らせします。"という文字列として連結し、それを出力。
		System.out.println("現在 " + sdf.format(nowDate.getTime()) + "をお知らせします。");
	}
	
}
