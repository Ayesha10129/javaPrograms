package practice;
import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter a string");
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++)
		{
			if(!rev.contains(s.charAt(i)+""))
			{
				rev+=s.charAt(i);
			}
		}
		System.out.println(rev);
		rev=s.charAt(0)+"";
		boolean d=true;
        for(int i=1;i<s.length();i++)
        {
              d=true;
              for(int j=0;j<rev.length();j++)
              {
            	  if(s.charAt(i)==rev.charAt(j)) {
            		  d=false;
            	  }
              }
              if(d==true)
              {
            	  rev+=s.charAt(i);
              }
        }
        System.out.println(rev);
	}

}
