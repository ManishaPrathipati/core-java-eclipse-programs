package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorIteration {

	public static void main(String[] args) {
		Vector<String> contents=new Vector<String>();
					contents.add("OOPS");
					contents.add("inBuilt Libraries");
					contents.add("Array");
					contents.add("Collection Framework");
					contents.add("Multi Threading");
			
			//Iteration using for 
			System.out.println("****** Using for Loop ******");
			for (int i = 0; i < contents.size(); i++) {
					System.out.println((i+1) + ". " + contents.get(i));	
			}
			
			//Iteration using forEach 
			System.out.println("****** Using forEach Loop ******");
			for (String s:contents) {
					System.out.println(s);	
			}
			
			//Iteration using iterator
			System.out.println("****** Using iterator() ******");
			Iterator i = contents.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			
			//Iteration using listIterator
			System.out.println("***** Using listIterator() ******");
			 ListIterator li = contents.listIterator(contents.size());
			while (li.hasPrevious()) {
				System.out.println(li.previous());
			}
			
			
	}

}
