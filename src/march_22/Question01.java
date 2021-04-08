package march_22;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir isim ve karakter girmesini isteyin, sonra karakterin kaç kez
		 * tekrarlandýðýný kontrol edin. e.g: char ch1= 'a' ; String name =“John came
		 * late" => Tekrar Sayisi = 2
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.nextLine().toLowerCase();

		System.out.println("Lutfen aramak istediginiz karakteri giriniz");
		String harf = scan.next().toLowerCase();

		int toplam = 0;

		for (int i = 0; i < isim.length(); i++) {
			if (isim.substring(i, i + 1).equals(harf)) {
				toplam++;
			}
		}

		System.out.println(toplam);
		scan.close();
	}

}
