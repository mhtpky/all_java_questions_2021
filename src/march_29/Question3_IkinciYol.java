package march_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3_IkinciYol {
	public static void main(String[] args) {

		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz
		 *
		 * Array={3,5,21,32,34,45,56,57,76,87,95}
		 *
		 * Input : 5 Output: Girdiginiz sayi Arrayde var 
		 * Input : 15 Output: Girdiginiz
		 * sayi Arrayde yok
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");
		int sayi = scan.nextInt();

		int arr[] = { 3, 5, 21, 32, 34, 45, 56, 57, 76, 87, 95 };

		varMi(arr, sayi);
	}

	public static void varMi(int arr[], int i) {

		List<Integer> list = new ArrayList<>();

		for (int w : arr) {
			list.add(w);
		}
		if (list.contains(i)) {
			System.out.println("Girdiginiz sayi Arrayde var");
		} else {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
	}
}
