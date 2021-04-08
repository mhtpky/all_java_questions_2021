package march_08;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin
		 * 
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * 
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * 
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin ORNEK: INPUT : techproed.com OUTPUT : “gecerli bir
		 * email girin” INPUT : techproed@gmail.com OUTPUT : “email onaylandi” INPUT :
		 * techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen e-mail adresinizi giriniz");
		String mail = scan.next().toLowerCase();

		int sonda = mail.indexOf("@gmail.com", mail.length() - 10);

		if (mail.contains("@")) {
			if (sonda != -1) {
				System.out.println("e-mail onaylandi");
			} else {
				System.out.println("Lutfen gmail hesabinizi giriniz");
			}
		} else {
			System.out.println("Lutfen gecerli bir email giriniz");
		}
		scan.close();
	}
}
