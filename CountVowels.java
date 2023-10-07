package practice;
import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string");
        String s=sc.nextLine();
        String vowel="aeiouAEIOU";
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
        	if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z'))
        	{
        	if(vowel.contains(s.charAt(i)+""))
        	{
        		v++;
        	}
        	else
        		c++;
        	}
        }
        System.out.println("vowels: "+v+" consonants: "+c);
	}

}
