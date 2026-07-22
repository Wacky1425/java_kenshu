//wakitahokuto_kenshuというパッケージの作成を宣言
package wakitahokuto_kenshu;

//どこからでもアクセス可能なクラスであるQ0003を作成
public class Q0003 {

	//どこからでもアクセス可能な、Q0002クラス自体に属する、戻り値のない、String型の配列argsを引数とする、このクラスで最初に呼ばれるメソッドを作成。
	public static void main(String[] args) {
		
		//初めに整数値型の変数iを初期値0として宣言し、{}内に書かれた処理を一度実行するごとにiを+1していき、i<100である限り繰り返し処理していく文
		for(int i=0;i<100;i++) {
			
			//Systemクラスに属するフィールドであるoutが指す標準出力をするためのメソッドを使い、Hello Worldを出力する
			System.out.println("Hello World");
		}

	}

}
