package Second_program;
import java . util.*;
public class Manav {
	public static void main(String args[])
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int  num = sc.nextInt(); 
		for (int i=1; i<=num;i++)
		{
			if(num%i==0)
			{
		count = count + 1;
			}
		}
		if(count%2==0)
		{
			System.out.println(num+"is not a perfect square ");
			
		}
		else {
			System.out.println(num+"is a perfect square ");
		}
		
		
	}

}
