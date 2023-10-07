package practice;
import java.util.*;
public class LinearSearch {

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
		int key=sc.nextInt();
		boolean p=false;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				p=true;
				break;
			}
		}
		if(p)
		{
			System.out.println("key is present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
