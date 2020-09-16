package list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {

		// it returns <  >homogeneous kind of data 
		ArrayList<String> al=new ArrayList<String>();

		al.add("suraj");
		al.add("rohit");
		al.add("virat");
		al.add("suhas");
		System.out.println(al);
		al.add(1, "adi");
		System.out.println(al);
		System.out.println(al.get(3));
		//sets new data into list
         al.set(1,"prakash");
 		System.out.println(al);
 		//check given content in list
         System.out.println(al.contains("adi"));
		
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("atul");
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1);

		/*System.out.println("------------Iterator------------");
		Iterator<String> it=al1.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+"\t");
		}*/
		
		
		for(String s:al1){
			System.out.println(s+"\t");
		}
		
		

		
		
         
		
		
		
		
		
		
	}

}
