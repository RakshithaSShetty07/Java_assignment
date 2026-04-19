/*4. Add elements in the same order in the LinkedHaspMap using for() loop and put()  String[] keys = {"C", "A", "B", "E", "D"}; 
 Integer[] values = {3, 1, 2, 5, 4};
*/

package labprogram2;
import java.util.LinkedHashMap;
import java.util.Map;
public class p12 {

	public static void main(String[] args) {
		
		String[] keys = {"C", "A", "B", "E", "D"};
		Integer[] values = {3, 1, 2, 5, 4};
		Map<String,Integer> lMap = new LinkedHashMap<>();
		for(int i=0;i<keys.length;i++) {
			lMap.put(keys[i], values[i]);
		}
		System.out.println(lMap);
	}

}
