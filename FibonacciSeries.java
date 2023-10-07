package practice;
import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int n=sc.nextInt();
		if(n>0)
		{
			int n1=0;
			int n2=1;
			int n3=0;
			int i=0;
			while(i<n)
			{
			  System.out.print(n1+" ");
			  n3=n1+n2;
			  n1=n2;
			  n2=n3;
			  i++;
			}
		}
		else
		{
			System.out.println("enter a valid number");
		}
           
	}

}
