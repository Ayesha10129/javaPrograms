package practice;
import java.util.*;
public class WaveMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter row of a matrix");
		int r=sc.nextInt();
		System.out.println("please enter column of a matrix");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		System.out.println("please enter elements to a matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<c;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<r;j++)
				{
						System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}

			else
			{
			
				for(int j=r-1;j>=0;j--)
				{
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
		}
		

	}

}
