package wakitahokuto_kenshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q0016 {

	public static void main(String[] args) {
		
		//文字列型の、変数pathに、jusho.csvの最上位ディレクトリからのパスを代入する。
		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		
		//{}内の処理中に例外が発生した際、発生した例外に対応したcatchブロックに処理を移す
		try{
			
			//ファイルを読み込む処理群型の、変数frに、ファイルを読み込む処理群を実体化し、変数pathにあるファイルパスを取得し、代入する。
			FileReader fr = new FileReader(path);
			
			//文字、配列、行を一度に指定した量まとめて読み込む処理群型の、変数brに、文字、配列、行を一度に指定した量まとめて読み込む処理群を実体化して変数frを取得し、代入する。
			BufferedReader br = new BufferedReader(fr);
			
			//文字列型の、変数lineを作成
			String line;
			
			//変数lineに変数brの文字列行を読み込む処理の結果を代入し、その結果が空でない限り{}内の処理をする。
			while((line = br.readLine()) != null) {
            	
            	//文字列配列型の、変数split_lnに、変数lineを、","で分割した処理結果を代入する。
            	String[] split_ln = line.split(",");
            	
            	//変数split_lnのインデックスが4に指定されている要素が、0と等しければ、{}内の処理を行う。
            	if(split_ln[4].equals("0")) {
            		
            		//javaに実装されている入出力およびエラー出力に関する処理群の中の、出力処理を指定して、変数lineをコンソールへ出力して改行する。
    				System.out.println(line);
            	}
            	
            }
			
			//変数brの、ファイルを閉じてメモリやネットワークなどを解放する処理を行う
			br.close();
			
			//変数frの、ファイルを閉じてメモリやネットワークなどを解放する処理を行う
			fr.close();
		
		//入出力処理の失敗や割込みの発生によって生成される例外を扱う処理群型の、変数eを作成し、try文の処理中にその例外が発生すると{}内の処理を行う。
		} catch (IOException e) {

			//変数eの、プログラム上の例外からエラー情報と呼び出し履歴をエラー専用の経路でコンソールに出力する処理を行う。
			e.printStackTrace();
		}
	}

}
