package march_29;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan sayilar girmesini isteyin ve girdigi sayilari toplayip yazdirin.
		 * yeni sayi isteyin girilen sayilarin toplami 100 'u gecerse
		 * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
		 *
		 */

		Scanner scan = new Scanner(System.in);
		int sayi = 0;
		int count = 0;
		int sum = 0;
		
	
		System.out.println("Lutfen toplamak istediginiz sayilari sirasi ile giriniz ");
		do {
			sayi = scan.nextInt();
			count++;
			sum += sayi;
			System.out.println("Girdiginiz sayilarin toplami : " + sum);
		} while (sum < 100);
		System.out.println(count + " kere sayi girdin.Bu kadar sayi yeter");
		
		 
		scan.close();
	}
}
