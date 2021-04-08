package march_29;
import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		  Stringi ters çevirmek için bir Java Programý yazýn 
		 	1.Yol: StringBuilder () kullanarak 
			2.Yol: String Classini kullanarak 
			3.Yol: Bir method oluþturun, ardindan methodu main method dan çagirinn
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string girinz");
		String str = scan.nextLine();
		
		// 1.YOL
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		// 2.YOL
		tersCevir(str);
		scan.close();
	}
	public static void tersCevir(String str) {
		for(int i=str.length()-1;  i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	

}
