import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		System.out.println("entr array elements");
		int array[]=new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
			System.out.println("enter array size");
			int size1=sc.nextInt();
			System.out.println("enter String array elements");
			String array1[]=new String[size1];
			for(int i=0;i<array1.length;i++)
			{
				array1[i]=sc.next();
			}
			for(int i=0;i<array1.length;i++)
			{
				System.out.println(array1[i]);
			}

	}

}
