/* Write a Java program to traverse / iterate all the keys with the specified value in a TreeMap  (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) 
[ hint : put() ; for (Map.Entry<Integer,String> entry : tree_map.entrySet()); getKey() and getValue()] 
*/




package labprogram2;

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class p5 {

	public static void main(String[] args) {
	
				Map< Integer,String> treeMap = new TreeMap<>();
				treeMap.put(1,"Apple");
				treeMap.put(2,"Strawberry");
				treeMap.put(3,"Pear");
				treeMap.put(4,"Cucumber");
				treeMap.put(5,"Grapes");
			
				System.out.println("Iterating over entries:");
				for (Entry<Integer, String> entry : treeMap.entrySet()) {
				System.out.println(entry.getKey() + " -> " + entry.getValue());
				}
			}


}
