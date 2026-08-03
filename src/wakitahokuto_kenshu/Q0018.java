package wakitahokuto_kenshu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q0018 {

	public static void main(String[] args) {

		//正しいパス
		//文字列型の、変数pathに、jusho.csvの最上位ディレクトリからのパスを代入する。
//		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		
		//誤ったパスのテストケース
		//文字列型の、変数pathに、jusho.csvの最上位ディレクトリからのパスを代入する。
		String path = "Z:\\個人フォルダ\\jusho.csv";
		
		//ファイルを扱う処理群型の、変数fileに、ファイルを扱う処理群を実体化し、変数pathを取得し、代入する。
		File file = new File(path);
		
		//{}内の処理中に例外が発生した際、発生した例外に対応したcatchブロックに処理を移す
		try{
			
			//変数fileの、ファイルが存在するかどうかを判定する処理を行い、存在しなければ{}内の処理を行う。
			if(!file.exists()) {
				
				//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、"jusho.csvファイルが存在しません"をコンソールへ出力する。
				System.out.print("jusho.csvファイルが存在しません");
				
				//処理を終了し、処理結果を呼び出し元に返す。
				return;
			}
			
			//ファイルを読み込む処理群型の、変数frに、ファイルを読み込む処理群を実体化し、変数pathにあるファイルパスを取得し、代入する。
			FileReader fr = new FileReader(file);
			
			//整数型の、変数dataを作成
			int data;
			
			//変数dataに変数frの文字を読み込む処理の結果を代入し、その結果が-1でない限り{}内の処理をする。
			while((data = fr.read())!=-1) {
				
				//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数dataを文字型に変換した結果をコンソールへ出力する。
				System.out.print((char)data);
			}
			
			//変数frの、ファイルを閉じメモリやネットワークなどを解放する処理を行う
			fr.close();
			
		//入出力処理の失敗や割込みの発生によって生成される例外を扱う処理群型の、変数eを作成し、try文の処理中にその例外が発生すると{}内の処理を行う。
		} catch (IOException e) {

			//変数eの、プログラム上の例外からエラー情報と呼び出し履歴をエラー専用の経路でコンソールに出力する処理を行う。
			e.printStackTrace();
		}
		
	}

}


