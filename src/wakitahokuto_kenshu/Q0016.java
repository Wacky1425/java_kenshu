package wakitahokuto_kenshu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q0016 {

	public static void main(String[] args) {

		String path = "Z:\\個人フォルダ\\わ行\\脇田北斗\\01.研修資料\\05.Java研修\\jusho.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
            while ((line = br.readLine()) != null) {
            	String[] split = line.split(",");
            	if(split[4].equals("0")) {
            		System.out.println(line);
            	}
            	
            }
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
