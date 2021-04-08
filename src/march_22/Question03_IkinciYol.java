package march_22;

import java.util.ArrayList;
import java.util.List;

public class Question03_IkinciYol {

	public static void main(String[] args) {
		/*
		 * Verilen String array icerisindeki tekrar eden karakterleri yazdiran 
		 * Java kodunu yaziniz. 
		 *
		 * String str=“ilovejavatoo” Output: o v a
		 */
		
		String str = new String("ilovejavatoo");
		ArrayList<Character> charList = new ArrayList<>();
		
		for( int i =0; i<str.length();i++) {
			charList.add(str.charAt(i));
		}System.out.println(charList);
		
		tekrarliKarakter(charList);
	}
	
	public static void tekrarliKarakter(ArrayList<Character> a) {
		String tekrarlilar = "";
		
		for(int i =0; i <a.size(); i++) {
			for(int j =i+1 ; j<a.size(); j++) {
				if(a.get(i) == a.get(j) && !tekrarlilar.contains(a.get(i) +"")) { // char(a.get(i))'i stringe cevirmenin en iyi yolu bir string("") ile toplamaktir
					tekrarlilar += a.get(i) + " ";
				}
			}
		}System.out.println(tekrarlilar);
	}

}
