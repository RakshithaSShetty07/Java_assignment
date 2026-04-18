/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/

package labprogram1;
import java.util.*;
public class p9 {

	public static void main(String[] args) {
				LinkedList<String> ls = new LinkedList<>();
				ls.add("Orange");
				ls.add("green");
				ls.add("pink");
				ls.add("red");
				ls.add("Blue");
				for(int i=0;i<ls.size();i++) {
					System.out.println("index: "+i+" value:"+ls.get(i));
				}
			}

}
