package march_22;

public class Question02 {

	public static void main(String[] args) {

		// a) 1-20 arasindaki -20 dahil olmak �zere- �ift say�lar� yazd�r�n. e.g.2 4 6.. 20
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// b) 1-20 arasindaki -20 dahil olmak �zere- tek say�lar� yazd�r�n. e.g 1,3,5,7,...,19 Virgul dahil!
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// c) 20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		for (int i = 20; i >= 5; i--) {
			if (i % 5 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// d) 1 - 20 aras�ndaki t�m �ift say�lar�n toplam�n� bulun.
		int toplam = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				toplam += i;
			}
		}
		System.out.print("1-20 arasinda ki cift sayilarin toplami : " +toplam);
		System.out.println();

		
		// e) 11 veya 15 hari� 1-20 aras�ndaki t�m say�lar� yazd�r�n; break or continue kullanin.
		for (int i = 1; i <= 20; i++) {
			if (i == 11 || i == 15) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
