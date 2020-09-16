package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPalindrom {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter five strings");
		String s;
		ArrayList<String> al=new ArrayList<String>();

		for(int i=0;i<5;i++){
					 s=sc.next();
					    al.add(s);

		}
		
		for(String s1:al){ //for each loop is used to store homogeneous
			StringBuffer sb=new StringBuffer(s1);

		     sb.reverse();
			String	st=sb.toString();
			
			if(s1.equals(st))
			System.out.println(s1+"\t");
		}
		
		
		
		
		
		
	}

}
