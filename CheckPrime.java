package practice;
import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter two numbers range");
		int m=sc.nextInt();
		int n=sc.nextInt();
		boolean p;
		System.out.print("prime numbers between "+m+" and "+n+" are ");
	    if(m<=n) {
		for(int i=m;i<=n;i++)
		{
		    p=printPrime(i);
			if(p)
			{
				System.out.print(i+" ");
			}
		}
	    }
	}
		
	   static  boolean printPrime(int n)
		{
			int c=0;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					c++;
			}
			if(c==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		 

	     }

}
