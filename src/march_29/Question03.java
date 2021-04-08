package march_29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question03 {

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

		System.out.println(iceriyorMu(arr, sayi));
	}

	public static String iceriyorMu(int arr[], int sayi) {

		String flag = "Girdiginiz sayi Arrayde var";
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		if (!list.contains(sayi)) {
			flag = "Girdiginiz sayi Arrayde yok";
		}
		return flag;
	}

}
