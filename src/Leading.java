import java.util.*;

public class Leading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		double x = sc.nextDouble();
		
		System.out.println(leading(x));

	}

	
	static int leading(double x) {
		double d=x;
		int z=(int)x;
		int t=0;
		if(d>0)
		while(z>0) {
		t=z%10;
			z=z/10;
		}
		else 
		System.out.println("Invalid input");
		return t;	
	}
}
