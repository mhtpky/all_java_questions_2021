package march_15;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		/* 
		Kullan�c�dan firstName ve lastName'i girmesini isteyin, 
		ard�ndan ba� harflerini b�y�k harf yap�n ve geri kalan� 
		tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		 kirac => Kirac
		          */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String firstName = scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String lastName = scan.next();
		
		System.out.println(firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1));
		System.out.println(lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1));
		scan.close();
	}

}
