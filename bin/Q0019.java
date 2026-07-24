package wakitahokuto_kenshu;

public class Q0019 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		leap_year(1900,2100);
		
	}
	
	private static void leap_year(int first, int last) {
		for(int a = first ; a <= last ; a++) {
			
			if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
				System.out.println(a);
			}
		}
		
	}

}
