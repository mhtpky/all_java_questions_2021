package march_15;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		StringMethods:
			Çift uzunlukta bir degiskenin ilk yarýsýný konsolda yazdirmak için bir Java programý yazýniz.
	    	     ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str = scan.next();
		
		if (str.length()%2==0) {
			System.out.println(str.substring(0,str.length()/2));
		}scan.close();
	}

}
