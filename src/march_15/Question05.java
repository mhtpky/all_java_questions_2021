package march_15;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir kelime girmesini isteyin. 
		S�zc�kte tek say�da karakter ve 3 veya daha fazla karakter i�eriyorsa, 
		kelimenin ortas�ndaki karakteri yazd�r�n.
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String kelime = scan.next().toLowerCase();
		
		if(kelime.length()>=3 && kelime.length() % 2 !=0) {
			System.out.println(kelime.charAt(kelime.length()/2));
		}scan.close();
			

	}

}
