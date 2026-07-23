//wakitahokuto_kenshuという名前で、処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//javaが用意している、プログラミングを便利にする様々な処理や設計図の中で、特定の日付や指定した年・月・日・時などの操作を行うための設計図を、今のコードで使えるように宣言する。
import java.util.Calendar;

//他のコードから参照可能な、コードの設計図、Q00014を作成する
public class Q0014 {

	//どこからでもアクセス可能な、Q0014自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//特定の日付や指定した年・月・日・時などの操作を行うための設計図を使用して、nowDateという名前で、設計図の中にある、"データと処理を持った実体を作成する"処理、をしてデータと処理を持った実体を作成する。
		Calendar nowDate = Calendar.getInstance();
		
		int second = nowDate.get(Calendar.SECOND);
		int a = 10, b = 15;
		
		if(second % 2 == 1) {
			System.out.print(Q0013.calSum(a, b) + "," + Q0013.calPro(a, b));
		}else {
			System.out.print(Q0013.calDif(a, b) + "," + Q0013.calQuo(a, b));
		}
		
	}

}
