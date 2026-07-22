//wakitahokuto_kenshuという名前で処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//javaの用意するtextパッケージにあるSimpleDateFormatクラスを使えるようにする
import java.text.SimpleDateFormat;
//javaが用意している、プログラミングを便利にする様々な処理や設計図の中で、特定の日付や指定した年・月・日・時などの操作を行うための設計図を、今のコードで使えるように宣言する。
import java.util.Calendar;

//他のコードから参照可能な、コードの設計図、Q0008を作成する
public class Q0008 {

	//どこからでもアクセス可能な、Q0008自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//特定の日付や指定した年・月・日・時などの操作を行うための設計図を使用して、nowDateという名前で、設計図の中にある、"データと処理を持った実体を作成する"処理、をしてデータと処理を持った実体を作成する。
		Calendar nowDate = Calendar.getInstance();

		//SimpleDateFormatクラスの新たなインスタンスを名前をsdfとして作成。中身は2026年 07月 22日 14時 16分のようなSimpleDateFormatの形式を指定する。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年 MM月 dd日 HH時 mm分");
		
		
		//nowDateインスタンスにその中に入っている時刻を取得するメソッドgetTime()を使用して時間を取得し、それに"現在 "と"をお知らせします。"という文字列として連結し、それを出力。
		System.out.println("現在 " + sdf.format(nowDate.getTime()) + "をお知らせします。");
	}
	
}
