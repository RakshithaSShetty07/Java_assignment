/*Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map. ("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")  
*/


package labprogram2;
import java.util.HashMap;
import java.util.*;
public class p6 {
	public static void main(String[] args) {
				Map< String,String> map1 = new TreeMap<>();
				map1.put( "c1", "Red");
				map1.put("c2", "Green");
				map1.put("c3", "Black");
				map1.put("c4", "White");
				
				System.out.println("Whehther it contains c4 or not: "+map1.containsKey("c4"));
				System.out.println("Whehther it contains c5 or not: "+map1.containsKey("c5"));


	}

}
