package practice;
import java.util.*;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String s=sc.nextLine();
		String e="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				e+=(char)(s.charAt(i)+32);
			}
			else
			{
				e+=(char)(s.charAt(i)-32);
			}
		}
		System.out.println(e);
		

	}

}
