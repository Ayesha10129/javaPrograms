package practice;
import java.util.*;
public class ReverseArray {

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
		int j=a.length-1;
		int i=0;
		int temp=0;
		while(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int k:a)
		{
		System.out.print(k+" ");
		}

	}

}
