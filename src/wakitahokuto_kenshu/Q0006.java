//wakitahokuto_kenshuという名前で、処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//javaが用意している、プログラミングを便利にする様々な処理群の中で、日付や時刻を扱うための処理群を、今のコードで使えるように宣言する。
import java.util.Date;

//他のコードから参照可能な、コードの設計図、Q0006を作成する
public class Q0006 {

	//どこからでもアクセス可能な、Q0006自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//日付や時刻を扱う処理群型の、変数nowDateに、日付や時刻を扱う処理群を実体化し、現在日時を取得し、代入する。
		Date nowDate = new Date();
		
		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数nowDateをコンソールへ出力して改行する。
		System.out.println(nowDate);
	}

}
