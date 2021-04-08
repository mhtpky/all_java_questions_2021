package march_08;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
        Print "Lütfen iþ unvanýnýzý girin” 
        “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
        Doðru jobTitle yazdýrmak için aþaðýdaki test datalarini kullanýn. Example :
        Eger jobTitle  qa ise print “Ýþ unvanýnýz Quality Analyst” 
        test data: qa ise print Quality Analyst 
        dev ise print Developer 
        ba ise print Business Analyst 
        pm ise print Project Manager
       */

		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen iþ unvanýnýzý girin");
		String jobTitle=scan.next().toLowerCase();
		
		
		switch (jobTitle) {
		case "qa":
			System.out.println("Is unvaniniz Quality Analyst");
			break;
		case "dev":
			System.out.println("Is unvaniniz Developer");
			break;
		case "ba":
			System.out.println("Is unvaniniz Business Analyst");
			break;
		case "pm":
			System.out.println("Is unvaniniz Project Managert");
			break;
		default:
			System.out.println("Lutfen unvaninizi dogru bir sekilde giriniz");
		}
		scan.close();
	}

}
