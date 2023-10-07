package practice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a number");
		int n=sc.nextInt();
		System.out.println(fact(n));
		System.out.println(fact(n));

	}
	public static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}
	public static int fact2(int n)
	{
		if(n!=0)
		{
			return n*fact2(n-1);
		}
		else
			return 1;
	  
	
	}   

}
