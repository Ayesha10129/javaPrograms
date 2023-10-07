package practice;
import java.util.*;
public class HollowPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(k);
				if(k<i)
					System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i;k++)
			{
				System.out.print(s);
				s++;
				if(k<n-i)
					System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
