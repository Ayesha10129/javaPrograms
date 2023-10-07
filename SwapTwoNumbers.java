package practice;
import java.util.*;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);

	}

}
