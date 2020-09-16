package set;

import java.util.HashSet;
import java.util.TreeSet;

public class TestSetHomogeneus {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		
		
		hs.add("abc");
		hs.add("sss");
		hs.add("kkk");
		hs.add("llll");
        System.out.println(hs);
        
        
       // it ads the given content in sorted order-->from SortedSet interface of Set interface    
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("abc");
		ts.add("sss");
		ts.add("kkk");
		ts.add("llll");
        System.out.println(ts);
		ts.add("ppp");
       System.out.println(ts);


		
		
		
	}

}
