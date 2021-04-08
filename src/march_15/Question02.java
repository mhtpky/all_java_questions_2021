package march_15;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran 
		* Switch Case java kodunu yaziniz.
			*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir ay giriniz");
		String ay = scan.next().toUpperCase();
		
		switch (ay) {
		case "SUBAT" :
			System.out.println(ay + " 28 gundur");
			break;
		case "OCAK" :
		case "MART":
		case "MAYIS":
		case "TEMMUZ":
		case "AGUSTOS":
		case "EKIM":
		case "ARALIK":
			System.out.println(ay + " 30 gundur");
			break;	
		case "NISAN":
		case "HAZIRAN":
		case "EYLUL":
		case "KASIM":
			System.out.println(ay + " 31 gundur");
			break;	
	} scan.close();
}
}
