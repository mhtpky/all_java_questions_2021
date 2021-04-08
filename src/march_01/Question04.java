package march_01;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		Kullanicidan 3 basamakli bir sayi isteyin 
		ve bu sayinin basamaklari toplamini konsolda yazdiran programi yaziniz.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int birlerBas = sayi%10;
		int onlarBas = (sayi/10)%10;
		int yuzlerBas = (sayi/100)%10;
		
				
		if(sayi>=100 && sayi<1000) {
			System.out.println("Birler basamagi : " + birlerBas );
			System.out.println("Onlar basamagi : " + onlarBas);
			System.out.println("Yuzler basamagi : " + yuzlerBas);
			System.out.println("Basamaklari toplami : " + (birlerBas + onlarBas + yuzlerBas));
		} else {
			System.out.println("Lutfen girdiginiz sayinin 3 basamakli olup olmadigini kontrol ediniz");
		}
	
	scan.close();
	}

}
