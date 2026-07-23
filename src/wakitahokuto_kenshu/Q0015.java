package wakitahokuto_kenshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q0015 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String val : values) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
