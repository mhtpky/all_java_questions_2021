package march_22;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * Verilen String array icerisindeki tekrar eden karakterleri yazdiran 
		 * Java kodunu yaziniz. 
		 *
		 * String str=“ilovejavatoo” Output: o v a
		 */

		String str="ilovejavatoo";
		String arr[]=str.split("");// split ile stringi bolerek Array'e cevirdk
		List<String> list = new ArrayList<>();
		
		
		for (int i = 0; i < arr.length ; i++) {
			for(int j=i+1; j < arr.length; j++) {
				if(arr[i].contains(arr[j]) && !list.contains(arr[j])){
					list.add(arr[i]);
				}
			}
		}System.out.println(list);
		
	
}}