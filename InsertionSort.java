package practice;
import java.util.*;
public class InsertionSort {

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

	    int temp =0;
	    for(int i=1;i<a.length;i++)
	    {
	    	for(int j=i;j>0;j--)
	    	{
	    		if(a[j-1]>a[j])
	    		{
	    			temp=a[j-1];
	    			a[j-1]=a[j];
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
