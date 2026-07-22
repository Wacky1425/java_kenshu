package wakitahokuto_kenshu;

//javaの用意するtextパッケージにあるSimpleDateFormatクラスを使えるようにする
import java.text.SimpleDateFormat;
//javaが用意しているutilパッケージにあるCalendarクラスを使えるようにする
import java.util.Calendar;

public class Q0009 {

	public static void main(String[] args) {
		
		//CalendarクラスのインスタンスnowDateをCalendarクラスにあるgetInstanceメソッドを使って作成する。
		Calendar nowDate = Calendar.getInstance();
		
		//nowDateの時間の部分に時差として-17時間をCalendarクラスの.HOUR_OF_DAYメソッドを使用して加算する。
		nowDate.add(Calendar.HOUR_OF_DAY,-17);

		//SimpleDateFormatクラスの新たなインスタンスを名前をsdfとして作成。中身は2026/07/22 23:16のようなSimpleDateFormatの形式を指定する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		
		
		//nowDateインスタンスにその中に入っている時刻を取得するメソッドgetTime()を使用して時間を取得し、それを出力。
		System.out.println(sdf.format(nowDate.getTime()));
	}
	
}
