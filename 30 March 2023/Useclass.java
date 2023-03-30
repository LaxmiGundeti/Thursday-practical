//write a java pgm using inheritance.make a parent class as vehical.use data members as branch,model, 
//and year.take driver as a method.derive a another child class Car and make a type method.
class Vehical
{
      String brand="Thar";
	  String model="Model";
	  int year=2020;
	  void driver()
	  {
	      System.out.println("Brand="+brand);
		  System.out.println("Model="+model);
		  System.out.println("Year="+year);
		  
	  }
}
class Car extends Vehical
{
   String color="Black";
   void type()
   {
        System.out.println("car color="+color);  
   }
   
}
class Useclass
{
     public static void main(String args[])
	  {
	       Car c=new Car();
	       c.driver();
	       c.type();
	  }
}
