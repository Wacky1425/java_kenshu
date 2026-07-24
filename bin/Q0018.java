package wakitahokuto_kenshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q0018 {

	public static void main(String[] args) {

		//正しいパス
//		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		//テストケース
		String path = "Z:\\個人フォルダ\\jusho.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
            while ((line = br.readLine()) != null) {
               
                System.out.println(line);
            }
		} catch (IOException e) {
			System.out.print("jusho.csvファイルが存在しません");
		}
	}

}
