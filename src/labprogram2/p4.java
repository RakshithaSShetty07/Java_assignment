/*Write a Java program to check whether a map contains Key-Values mappings (empty) or not after adding all the following elements into Hashmap and after removing all the elements from the Hashmap.  
 (1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue") 
*/

package labprogram2;
import java.util.HashMap;
import java.util.Map;

public class p4 {

	public static void main(String[] args) {
				Map< Integer,String> map1 = new HashMap<>();
				map1.put( 1, "Red");
				map1.put(2, "Green");
				map1.put(3, "Black");
				map1.put(4, "White");
				boolean res=map1.isEmpty();
				System.out.println("Before Removing: "+res);
				map1.clear();
				
				res=map1.isEmpty();
				System.out.println("After removing: "+res);


	}

}
