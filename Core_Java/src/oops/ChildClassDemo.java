package oops;

public class ChildClassDemo extends ParentClassDemo{

	
	String name ="QAClickAcademy";


	public ChildClassDemo()
	{
	//super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}


	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub



		ChildClassDemo cd = new ChildClassDemo();

	cd.getStringdata();
	cd.getData();
	}
}
