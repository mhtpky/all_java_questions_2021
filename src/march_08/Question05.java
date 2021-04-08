package march_08;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýný 1 ile 7 arasýnda bir sayý girdiðinde haftanýn hangi günü olduðunu
		 * yazdýran switch case java kodunu yazinýz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen haftanin gununu yazdirmak icin 1-7 arasi bir sayi giriniz");
		int gun = scan.nextInt();

		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembei");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Lutfen dogru giris yapiniz");
			;
		}
		scan.close();
	}

}
