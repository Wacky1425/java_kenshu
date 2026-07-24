package wakitahokuto_kenshu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Q0017 {

	public static void main(String[] args) {

		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		//try()の中にリーダーかいてるけど、これと後にライター書いてるのどっちがどういいんだ？表記そろえる説。
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			FileWriter file = new FileWriter("C:\\practice\\shain.csv");
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));
			String line;
            while ((line = br.readLine()) != null) {
            	String[] split = line.split(",");
            	pw.println(split[0] + "," + split[1] + "," + split[2] + "," + split[5]);
            	
            }
            pw.close();
            System.out.print("ファイル出力完了しました。");
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}