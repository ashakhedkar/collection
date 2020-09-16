package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add("Selenium");
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		al.add(0,20.5);
		System.out.println(al);

		System.out.println(al.get(0));		
		
		System.out.println(al.size());
		
		al.remove("Selenium");
		System.out.println(al);
		
		//checks is 10 there are not if there returns true
		System.out.println(al.contains(10));
		
		System.out.println("--------------check-----------------");

		Iterator it= al.iterator();
		//checks is that data is there are not
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
