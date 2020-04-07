import java.util.*;
public class Countryproject {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("***enter how many countires to create***");
		int countrysize=sc.nextInt();
		Country []c1=new Country[countrysize];
		for(int i=0;i<countrysize;i++)
		{
			Country c=new Country();
			System.out.println("Entry country id");
			int id=sc.nextInt();
			c.setId(id);
			System.out.println("Enter country name");
			String name=sc.next();
			c.setName(name);
			System.out.println("Enter how many states to create");
			int statesize=sc.nextInt();
			State[] s=new State[statesize];
			
			for(int j=0;j<statesize;j++)
			{
				State s1=new State();
				System.out.println("enter state id");
				int id1=sc.nextInt();
				s1.setId(id1);
				System.out.println("enter state name");
				String name1=sc.next();
				s1.setName(name1);
				
				s[j] = s1;
				
				
			}
			c.setStates(s);
			
			c1[i]=c;
			
		}
		for(int i=0;i<countrysize;i++)
		{
			System.out.println("ID"+c1[i].getId());
			System.out.println("NAME"+c1[i].getName());
			System.out.println("states"+c1[i].getStates());
			System.out.println("***********************");
		}
		

	}

}
