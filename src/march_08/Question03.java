package march_08;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 * 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yýlý, ayi ve günü tamsayý olarak alýn e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin.
		 * 
		 * Examples: int birthYearOfYusuf=2000, birthMonthOfYusuf=12,
		 * birthDayOfYusuf=12, int birthYearOfMehmet=2000,birthMonthOfMehmet=12,
		 * birthDayOfMehmet=21; Yusuf is Older
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen annenizin dogum tarihini sirasi ile yil ay ve gun olarak giriniz");
		int birthYearOfMother = scan.nextInt();
		int birthMonthOfMother = scan.nextInt();
		int birthDayOfMother = scan.nextInt();
		System.out.println("Lutfen babanizin dogum tarihini sirasi ile yil ay ve gun olarak giriniz");
		int birthYearOfFather = scan.nextInt();
		int birthMonthOfFather = scan.nextInt();
		int birthDayOfFather = scan.nextInt();

		if (birthYearOfMother == birthYearOfFather) {
			if (birthMonthOfMother == birthMonthOfFather) {
				if (birthDayOfMother == birthDayOfFather) {
					System.out.println("Your mother and father are the same age");
				} else if (birthDayOfMother < birthDayOfFather) {
					System.out.println("Your mother is older");
				} else {
					System.out.println("Your father is older");
				}
			} else if (birthMonthOfMother < birthMonthOfFather) {
				System.out.println("Your mother is older");
			} else {
				System.out.println("Your father is older");
			}
		} else if (birthYearOfMother < birthYearOfFather) {
			System.out.println("Your mother is older");
		} else {
			System.out.println("Your father is older");
		}
		scan.close();
	}
}
