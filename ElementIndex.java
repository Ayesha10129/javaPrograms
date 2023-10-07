package practice;
import java.util.*;
public class ElementIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a size of an array");
		int s=sc.nextInt();
		int[] a=new int[s];
		System.out.println("please enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("please enter a key");
		int key=sc.nextInt();
		int c=count(a,key);
		printOccurence(a,c,key);

	}
	public static int count(int a[],int key)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				c++;
			}
		}
		return c;
	}
	public static void printOccurence(int a[],int c,int key)
	{
		if(c>=1)
		{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				count++;
				if(count==1)
				{
					System.out.println("firstoccurence index is "+i);
				}
				else if(count==c)
				{
					System.out.println("lastOccurence index is "+i);
				}
			}
		}
		}
		else
		{
			System.out.println("element not present");
		}
	}

}
