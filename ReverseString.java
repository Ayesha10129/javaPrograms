package practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		StringBuffer s=new StringBuffer(sc.nextLine());
		int j=s.length()-1;
		char temp='a';
		for(int i=0;i<s.length()/2;i++)
		{
			 temp=s.charAt(i);
		     s.setCharAt(i,s.charAt(j));
		     s.setCharAt(j, temp);
		     
		     j--;
		}
		System.out.println(s);

	}

}
