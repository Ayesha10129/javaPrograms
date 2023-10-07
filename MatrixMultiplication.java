package practice;
import java.util.*;
public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no of rows in matrix 1");
		int r1=sc.nextInt();
		System.out.println("please enter no of colunms in matrix 1");
		int c1=sc.nextInt();
		System.out.println("no of colunms in matrix 1 is equal to number of rows in matrix 2");
		System.out.println("please enter no of colunms in matrix 2");
        int c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[c1][c2];
        System.out.println("please enter elements for matrix 1");
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a[i].length;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("please enter elements for matrix 2");
        for(int i=0;i<b.length;i++)
        {
        	for(int j=0;j<b[i].length;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}
        }
        int[][] c =multiplyMatrix(a,b);
        System.out.println("multiplied matrix is ");
        for(int i=0;i<c.length;i++)
        {
        	for(int j=0;j<c[i].length;j++)
        	{
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}
	public static int[][] multiplyMatrix(int[][] a,int[][] b)
	{
		int[][] c=new int[b.length][b[0].length];
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			for(int k=0;k<c[i].length;k++)
			{
				sum=0;
			
				for(int j=0;j<c.length;j++)
				{
					sum+=a[i][j]*b[j][k];
				}
			  c[i][k]=sum;
			}
		}
		return c;
	}

}
