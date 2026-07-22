//wakitahokuto_kenshuという名前で処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//javaの用意している、テキスト、日付、数値、およびメッセージを自然言語に依存しない方法で処理するための処理や設計図の中で、日付のフォーマットと解析を行うための設計図を、今のコードで使えるように宣言する。
import java.text.SimpleDateFormat;
//javaが用意している、プログラミングを便利にする様々な処理や設計図の中で、特定の日付や指定した年・月・日・時などの操作を行うための設計図を、今のコードで使えるように宣言する。
import java.util.Calendar;

//他のコードから参照可能な、コードの設計図、Q0009を作成する
public class Q0009 {

	//どこからでもアクセス可能な、Q0009自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//特定の日付や指定した年・月・日・時などの操作を行うための設計図を使用して、nowDateという名前で、設計図の中にある、"データと処理を持った実体を作成する"処理、をして現在の日付と時間に初期化された状態のデータと処理を持った実体を作成する。
		Calendar nowDate = Calendar.getInstance();
		
		//nowDateの時間の部分に時差として-17時間をCalendarクラスの.HOUR_OF_DAYメソッドを使用して加算する。
		nowDate.add(Calendar.HOUR_OF_DAY,-17);

		//SimpleDateFormatクラスの新たなインスタンスを名前をsdfとして作成。中身は2026/07/22 23:16のようなSimpleDateFormatの形式を指定する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		
		
		//nowDateインスタンスにその中に入っている時刻を取得するメソッドgetTime()を使用して時間を取得し、それを出力。
		System.out.println(sdf.format(nowDate.getTime()));
	}
	
}
