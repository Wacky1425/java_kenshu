//wakitahokuto_kenshuという名前で処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//他のコードから参照可能な、コードの設計図、Q0010を作成する
public class Q0010 {

	//どこからでもアクセス可能な、Q0010自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//整数型の変数としてsum、a、bを宣言し、初期値10,15も設定する。
		int sum,a=10,b=15;
		
		//変数sumにaとbの和を代入する。
		sum = a + b;
		
		//変数sumの値を標準出力する。
		System.out.println(sum);

	}

}
