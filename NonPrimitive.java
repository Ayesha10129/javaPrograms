package practice;
class Laptop
{
	String brand;
	Laptop(String b)
	{
		brand=b;
	}
}

public class NonPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lappy=new Laptop("Dell");
		System.out.println("original lappy value(adress)"+lappy);
		System.out.println("original lappy brand"+lappy.brand);
		
	
	    modify(lappy);
	
		System.out.println("lappy value(adress) after modify()="+lappy);
        System.out.println(" lappy brand after modify()="+lappy.brand);
	}
	public static void modify(Laptop lappycopy)
	{
		System.out.println("original lappy value(adress)"+lappycopy);
		System.out.println("original lappy brand"+lappycopy.brand);
		lappycopy=new Laptop("lenovo");
		System.out.println("original lappy value(adress)"+lappycopy);
		System.out.println("original lappy brand"+lappycopy.brand);
		
		
	}

}

