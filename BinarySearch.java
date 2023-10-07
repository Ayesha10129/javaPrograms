package practice;
import java.util.*;
public class BinarySearch {

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
		System.out.println("please enter a key to search");
		int key=sc.nextInt();
		System.out.println(search(a,key));
		}
	public static boolean search(int[] a,int key)
	{
	    int  low=0;
	    int  high=a.length-1;
	    int mid=(low+high)/2;
	    boolean present=false;
	    while(low<high)
	    {
	    	if(a[mid]==key)
	    	{
	    		present=true;
	    		break;
	    	}
	    	else if(key>a[mid])
	    	{
	    		low=mid+1;
	    		mid=(low+high)/2;
	    	}
	    	else
	    	{
	    		high=mid-1;
	    		mid=(low+high)/2;
	    	}
	    	
	    }
	    return present;
	}

}
