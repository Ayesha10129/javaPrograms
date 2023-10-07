package practice;

class A{
    public void method1()
    {
        System.out.println("B");
    }
}
class B extends A{
   public void method2(){
       System.out.println("A");
   }
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new B();
        ob.method1();
	}

}
