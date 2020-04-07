import java.util.*;
public class Productmanager {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	
		//System.out.println(new Product(1,"xyz",100,5).getId());
		Product[] obj=new Product[2];
		for(int i=0;i<2;i++)
		{ 
			Product p=new Product();
			System.out.println("Enter id");
			int id=sc.nextInt();
			p.setId(id);
			System.out.println("enter name");
			String name=sc.next();
			p.setName(name);
			System.out.println("Enter price");
			double price=sc.nextDouble();
			p.setPrice(price);
			System.out.println("Enter rating");
			double rating=sc.nextDouble();
			p.setRating(rating);
			//Product p=new Product(id,name,price,rating);
			obj[i]=p;
		}
		
		//for(int i=0;i<2;i++)
		//{
			//String s=obj[i].toString();
			//System.out.println(s);
		//}
		for(int i=0;i<obj.length;i++)
		{
			System.out.println("************************");
			System.out.println("ID:"+obj[i].getId());
			System.out.println("NAME:"+obj[i].getName());
			System.out.println("PRICE:"+obj[i].getPrice());
			System.out.println("RATING:"+obj[i].getRating());
			System.out.println("***************************");
		}

	}

}
