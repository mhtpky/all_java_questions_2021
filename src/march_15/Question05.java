package march_15;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir kelime girmesini isteyin. 
		Sözcükte tek sayýda karakter ve 3 veya daha fazla karakter içeriyorsa, 
		kelimenin ortasýndaki karakteri yazdýrýn.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scan.next().toLowerCase();
		
		if(kelime.length()>=3 && kelime.length() % 2 !=0) {
			System.out.println(kelime.charAt(kelime.length()/2));
		}scan.close();
			

	}

}
