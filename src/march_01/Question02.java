package march_01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. 
		Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
		1 seker= 1.7 gr
		Ornek: Input ⇒      
		Cay : 10
		Seker :2
		Output : 12.41 kg/yil
		*/  

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gunde kac bardak cay ictiginizi yaziniz");
		int cay = scan.nextInt();
		System.out.println("Lutfen cayi kac sekerli ictiginizi yaziniz");
		int seker= scan.nextInt();
		
		System.out.println("CAY : " + cay);
		System.out.println("SEKER : " +seker);
		
		double sonuc = (double) 365*(cay*seker)*(1.7)/1000;
		
		System.out.println(sonuc  + " kg /yil seker kullaniyorsunuz");

		scan.close();
	}

}
