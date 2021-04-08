package march_15;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Urun fiyatini giriniz");
		int price = scan.nextInt();
		
		String secim = price<=10 ? "UCUZ" : (price <= 20 ? "UYGUN" : "PAHALI");
		System.out.println(secim);
		scan.close();
	}

}
