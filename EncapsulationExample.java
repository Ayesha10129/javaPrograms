package practice;
import java.util.*;
class Employee{
	private int id;
	private String name;
	private String project;
	private int salary;
	public void setId(int id)
	{
		this.id=id;
		System.out.println(id);
		
	}
	public int getId(int id)
	{
		return (id);
	}
	public void setName(String name)
	{
		this.name=name;
		System.out.println(name);
		
	}
	public String getName(String name)
	{
		return (name);
	}
	public void setProject(String project)
	{
		this.project=project;
		System.out.println(project);
		
	}
	public String getProject(String project)
	{
		return (project);
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
		System.out.println(salary);
		
	}
	public int getSalary(int salary)
	{
		return (salary);
	}
	
	
}

public class EncapsulationExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("please enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("please enter name");
		String name=sc.nextLine();
		System.out.println("please enter project");
		String project=sc.nextLine();
		System.out.println("please enter salary");
		int salary=sc.nextInt();
		Employee ob=new Employee();
		ob.setId(id);
		ob.getId(id);
		ob.setName(name);
		ob.getName(name);
		ob.setProject(project);
		ob.getProject(project);
		ob.setSalary(salary);
		ob.getSalary(salary);

	}

}
