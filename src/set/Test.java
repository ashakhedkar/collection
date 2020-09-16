package set;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;


public class Test {
	public static void main(String[] args) throws Exception, IOException {
	
	HashSet hs= new HashSet();//there is no order to store given data in set
	
	hs.add(123);
	hs.add("hello");
	hs.add(56.7);
	System.out.println(hs);
	hs.add(34);
	System.out.println(hs);
	
    hs.add(123);//it does not allow duplicate elements from the list
	System.out.println(hs);

	//checks the give element return either true or false
	System.out.println(	hs.contains("hello"));
	
	//removes the given element
	hs.remove(34);
	System.out.println(hs);
	
	 Iterator it=hs.iterator();
	while(it.hasNext()){
		System.out.print(it.next()+" ");
	}

	}
}
	
	
	
	
	
	
	
	