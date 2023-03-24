//write a pgm create class calculation  add methods add sub mul divide and create objects and access those methods
class Calculator
{
    int a,b;
	Calculator(int a,int b) //parameterized constructor
	{
	   this.a=a;
	   this.b=b;
	}
	void display()  
    {
       System.out.println("Addition="+(a+b)); //addition
	   System.out.println("Substraction="+(a-b)); //substraction
	   System.out.println("Multiplication="+(a*b)); //multiplication
	   System.out.println("Division="+(a/b));  //Division
	  
    }
}
class Result  //main class
{
	public static void main(String args[])  
	{
		Calculator c1=new Calculator(30,50); //created an object
		c1.display();  //call display method
	}

}
