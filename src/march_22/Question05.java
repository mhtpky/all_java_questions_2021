package march_22;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * String name = "Emine"; 
		 * charAt yöntemini kullanarak konsolda tüm harfleri yazdýrýn.
		 */

		String name = "Emine"; 
		
		for(int i = 0 ; i <name.length() ;i++) {
			System.out.println("Ismin "+ (i+1) + "inci harfi : " + name.charAt(i));
		}
	}

}
