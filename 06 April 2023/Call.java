//write a pgm using constructor.create a class person with ID,name designation. ask the user what are his inputs and according to that call the constructor.
import java.util.Scanner;
class Person1
{
    int id;
	String name,designation;
	public Person1(int id,String name,String designation)
	{
	    this.id=id;
		this.designation=designation;
		this.name=name;
	}
}
class Call
{
    public static void main(String args[])
	{
	     System.out.println("Enter what you want id,name or designation");
		 Scanner sc=new Scanner(System.in);
		 String i=sc.next();
		 Person1 p1=new Person1(10, "Laxmi","java");
		 String pname=p1.name;
		 int pid=p1.id;
		 String des=p1.designation;
		 if(i.equalsIgnoreCase("name"))
		 {
		     System.out.println("Name is="+pname);
			 
		 }
		 else if(i.equalsIgnoreCase("id"))
		 {
		     System.out.println("ID is="+pid);
		 }
		 else if(i.equalsIgnoreCase("designation"))
		 {
		     System.out.println("Designation is="+des);
		 }
		 else
		 {
		      System.out.println("Name="+pname);
			  System.out.println("ID="+pid);
			  System.out.println("Designation="+des);
		 }
		 sc.close();
	}
		 
}