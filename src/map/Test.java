package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		//HashMap is a class implements Map interface
		//Extends AbstractMap
		//It contains only unique elements
		//Stores value in 'key', 'value' pair
		//It may have only one null key and multiple null values
		//It maintains no order
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101,"abc");
		hm.put(102,"pqr");
        System.out.println(hm);
		hm.put(103,"xyz");
        System.out.println(hm);
        System.out.println(hm.get(102));
        System.out.println(hm.get(104));
        
       Set<Integer> s=hm.keySet();
       System.out.println(s);
       
       Collection<String> l=hm.values();
       System.out.println(l);

       System.out.println("Entries are: ");
       for(Map.Entry me:hm.entrySet())
       {
            System.out.println(me.getKey()+"\t"+me.getValue());
       }
		
		
		
		
	}

}
