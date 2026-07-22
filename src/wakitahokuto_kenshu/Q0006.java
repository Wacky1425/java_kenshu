package wakitahokuto_kenshu;

//javaが用意しているutilパッケージにあるCalendarクラスを使えるようにする
import java.util.Calendar;

public class Q0006 {

	public static void main(String[] args) {
		
		//CalendarクラスのインスタンスnowDateをCalendarクラスにあるgetInstanceメソッドを使って作成する。
		Calendar nowDate = Calendar.getInstance();
		
		//nowDateインスタンスにその中に入っている時刻を取得するメソッドgetTime()を使用して時間を取得し、それを出力。
		System.out.println(nowDate.getTime());
	}

}
