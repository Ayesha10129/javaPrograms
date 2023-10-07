package practice;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size af an array");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("please enter elements for an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{	
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
