//wakitahokuto_kenshuという名前で処理や設計図をひとまとめにするためのグループを作成する宣言
package wakitahokuto_kenshu;

//他のコードから参照可能な、コードの設計図、Q0011を作成する
public class Q0011 {

	//どこからでもアクセス可能な、Q0011自体に属する、処理完了後に呼び出し元に渡す結果やデータがない、入力値を要素が文字列の配列(args)で受け取る、最初に呼ばれる処理
	public static void main(String[] args) {
		
		//限界値が決まった整数値のみをとる、変数としてsum、dif、pro、quo、a、bを宣言し、a,bには初期値10,15も同時に設定する。
		int sum,dif,pro,quo,a=10,b=15;
		
		//変数sumに、a、とb、の和を、代入する。
		sum = a + b;
		
		//変数difに、a、とb、の差を、代入する。
		dif = a - b;
		
		//変数proに、a、とb、の積を、代入する。
		pro = a * b;
		
		//変数quoに、a、とb、の商を、代入する。
		quo = a / b;
		
		//javaに標準実装されている基本的なコードの設計図を使い、標準的な出力を指し示す変数に対して、()内に書かれた値を、表示して改行する処理。()内は先ほど計算した変数sum、dif、pro、quoの値が、それぞれ","という区切り文字を挟んで文字列として連結されて入っている。
		System.out.print(sum + "," + dif + "," + pro + "," + quo);

	}

}
