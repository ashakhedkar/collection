package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Product{
	 private int id;
	 private String name;
	 private double price;
	 
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void printProduct(){
		System.out.println(id+" "+name+" "+price);
	}
	
}

public class TestObject {
	public static void main(String[] args) {

		ArrayList<Product> al= new ArrayList<Product>();
		
		Scanner sc= new Scanner(System.in);
		int id;
		String name;
		double price;
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id, name & price of Product");
			id=sc.nextInt();
			name=sc.next();
			price=sc.nextDouble();
			Product p=new Product(id,name,price);
			al.add(p);
		}
		
		System.out.println("Product details are: ");

		for(Product p:al)
		{
			p.printProduct();
		}
		
       
		/*using iterator to print
		
		Iterator<Product> it= al.iterator();
			while(it.hasNext()){
				Product p=(Product)it.next();
				p.printProduct();			
			}
		*/	
			

		
	}
}
