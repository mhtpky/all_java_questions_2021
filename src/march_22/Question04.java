package march_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * Get numbers from the user and 
		 * output that number consecutive fibonacci number
		 * 
		 * sequence e.g : User enters 10 output : 0 1 1 2 3 5 8 13 21 34
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Fibonacci serisinde kac sayi gormek istiyorsaniz giriniz");
		int sayi = scan.nextInt();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		
		for(int i = 2 ; i<sayi; i++) {
			list.add(list.get(i-2)+list.get(i-1));
			
		}System.out.println(list);
		scan.close();
	}

}
