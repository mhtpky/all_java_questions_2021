package march_08;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. 
		 * b+c>a>b-c 1 
		 * a+c>b>a-c 1 
		 * a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. 
		 * Eskenar ucgen 
		 * Sadece ucgen 
		 * Ucgen degildir
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 1. pozitif tam sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("Lutfen 2. pozitif tam sayiyi giriniz");
		int num2 = scan.nextInt();
		System.out.println("Lutfen 3. pozitif tam sayiyi giriniz");
		int num3 = scan.nextInt();

		if (num1 != 0 && num2 != 0 && num3 != 0) {
			if (((num2 + num3) > num1 && num1 > (num2 - num3)) || ((num1 + num3) > num2 && num2 > (num1 - num3))
					|| ((num1 + num2) > num3 && num3 > (num1 - num2))) {
				if (num1 == num2 && num1 == num3) {
					System.out.println("Eskenar ucgen");
				} else {
					System.out.println("Ucgen");
				}
			} else {
				System.out.println("Ucgen degil");
			}	
		}else {
			System.out.println("Lutfen sifirdan buyuk bir sayi giriniz");
		}
	scan.close();		
	}

}
