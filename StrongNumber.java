package practice;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		boolean p=checkStrong(n,s.length());
		System.out.print(p);

	}
	public static boolean checkStrong(int m,int c)
	{
		int n=m;
		int sum=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			sum+=factorial(rem);
			n=n/10;
		}
		if(m==sum)
		{
			return true;
		}
		else
			return false;
	}
	public static int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}

}
