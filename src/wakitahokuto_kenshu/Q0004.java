//wakitahokuto_kenshuという名前で、処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//他のコードから参照可能な、コードの設計図、Q0004を作成する
public class Q0004 {

	//どこからでもアクセス可能な、Q0004自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//整数型の変数iに0を代入する。
		int i=0;
		
		//変数iが100未満である間は{}内の処理を繰り返す。
		while(i<100) {
			
			//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、HelloWorldをコンソールへ出力して改行する。
			System.out.println("Hello World");
			
			//変数iを+1する
			i++;
		}

	}

}
