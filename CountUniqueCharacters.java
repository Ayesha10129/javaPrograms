package practice;
import java.util.*;
public class CountUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER A STRING");
		String s=sc.nextLine();
		String d="";
		for(int i=0;i<s.length();i++)
		{
			if(!d.contains(s.charAt(i)+""))
			{
				d+=s.charAt(i);
			}
		}
		boolean b=true;
		int c=0;
		for(int i=0;i<d.length();i++)
		{
			c=0;;
			for(int j=0;j<s.length();j++)
			{
				if(d.charAt(i)==s.charAt(j))
				{
				c++;
				}
			}
			if(c==1)
			{
				System.out.print(d.charAt(i));
			}
		}

	}

}
