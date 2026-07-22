//wakitahokuto_kenshuというパッケージの作成を宣言
package wakitahokuto_kenshu;

//どこからでもアクセス可能なクラスであるQ0004を作成
public class Q0004 {

	//どこからでもアクセス可能な、Q0002クラス自体に属する、戻り値のない、String型の配列argsを引数とする、このクラスで最初に呼ばれるメソッドを作成。
	public static void main(String[] args) {
		
		//整数型の変数iを初期値0として宣言
		int i=0;
		
		//i<100を満たす間は{}内の処理を繰り返す
		while(i<100) {
			
			//Systemクラスに属するフィールドであるoutが指す標準出力をするためのメソッドを使い、Hello Worldを出力する
			System.out.println("Hello World");
			
			//iを+1する
			i++;
		}

	}

}
