package practice;
import java.util.*;
public class CheckPalingrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String s=sc.nextLine();
		int j=s.length()-1;
		boolean palindrome=true;
		for(int i=0;i<s.length()/2;i++)
		{
			if(!(s.charAt(i)==s.charAt(j)))
			{
				palindrome=false;
				break;
			}
			else
				j--;
		}
		if(palindrome)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome"); 
		

	}

}
