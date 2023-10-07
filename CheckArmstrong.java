package practice;
import java.util.*;
public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int c=count(n);//count the integers
		String s=Integer.toString(n);
		int res=armstrong(n,s.length());
		if(res==n)
		{
			System.out.println("armstrong");
		}
		else
			System.out.println("NOT ARMSTRONG");

	}
	public static int count(int n)
	{   
		int sum=0;
		int rem=0;
		int c=0;
		while(n>0)
		{
			rem=n%10;
			c++;
			n=n/10;
		}
		return c;
	}
	
	public static int armstrong(int n,int c)
	{
		int rem=0;
		int sum=0;
		int cube=1;
		while(n>0)
		{
			rem=n%10;
			cube=1;
			//cube=(int)(Math.pow(rem,c));
			for(int i=0;i<c;i++)
			{
			cube*=rem;
			}
			sum+=cube;
			n=n/10;
		}
		return sum;
	}

}
