import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in)
		while(true) {
		System.out.println("enter the option");
		System.out.println(" 1 for add");
		System.out.println("2 for highest and lowest");
		System.out.println(" 3 3rd highest");
		System.out.println(" 4 exit");
		int p=sc.nextInt();
		switch (p)
		{
		   case 1:
			     Add();
			     break;
		   case 2:
			   Display();
			     break;
		   
			   
		   case 4:
			   System.exit(0);
		   default:
				System.out.println("Enter a valid input(1/2/3/4)");
			   
		}
		}		   
	}
	public static void Add()
	{
		System.out.println("enter marks of the student");
		Scanner a=new Scanner(System.in);
	
		int []array1=new int[10];
		
		for(int i=0;i<10;i++)
		{
		array1[i]=a.nextInt();	
		}
		for( int i=0;i<10;i++)
		{
			System.out.println(array1[i]);
	}
	}




	public static void Display()
	{
		int min;
		System.out.println("enter marks of the student");
		Scanner b=new Scanner(System.in);
		int max=0,i;
	
		int []arr1=new int[10];
		
		for( i=0;i<10;i++)
		{
		arr1[i]=b.nextInt();	
		}
		if(arr1[i]>max)
		{
			max=arr1[i];
			System.out.println("highest score is " +max);
		}
		min=arr1[0];
		{
			if(arr1[i]<min)
			{
				min=arr1[i];
				System.out.println("least score is"+min);
		
	}
}
	}
	
public static void Display2()
{
	int min;
	System.out.println("enter marks of the student");
	Scanner b=new Scanner(System.in);
	int max=0,i;

	int []arr1=new int[10];
	
	for( i=0;i<10;i++)
	{
	arr1[i]=b.nextInt();	
	}
	
	
}
}

	
