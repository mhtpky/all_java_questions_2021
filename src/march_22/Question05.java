package march_22;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * String name = "Emine"; 
		 * charAt y�ntemini kullanarak konsolda t�m harfleri yazd�r�n.
		 */

		String name = "Emine"; 
		
		for(int i = 0 ; i <name.length() ;i++) {
			System.out.println("Ismin "+ (i+1) + "inci harfi : " + name.charAt(i));
		}
	}

}
