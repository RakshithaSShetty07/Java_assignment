/* Write a java program for getting different colors through ArrayList interface and search
whether the color &quot;Red&quot; is available or not
( Hint : Use ArrayListObj.contains() )*/

package labprogram1;
import java.util.*;
public class p1 {

	public static void main(String[] args) {
				List<String> ls = new ArrayList<>();
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				System.out.println(ls);
				if(ls.contains("red")) {
					System.out.println("available");
				}else {
					System.out.println("available not");
				}
			}

	}


