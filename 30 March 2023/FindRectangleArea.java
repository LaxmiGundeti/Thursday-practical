//Write a program in java showing overloading of Add method with 2 and 3 parameters.
//In the user passes 2 values method with 2 parameter should be called if he passes 3 values method with 3 parameters should be called

class Rectangle
{
     double length;
	 double breadth;
	 
	 Rectangle(double length, double breadth)
	 {
	     this.length =length;
		 this.breadth=breadth;
	 }
	 double getArea()
	 {
	    return length * breadth;
	 }
	 double getPerimeter()
	 {
	     return 2 * (length+breadth);
	 }
}
class FindRectangleArea
{
      public static void main(String args[])
	  {
	       Rectangle rect = new Rectangle(10,5);
		   System.out.println("Length=" +rect.length);
		   System.out.println("Breadth=" +rect.breadth);
		   System.out.println("Area=" +rect.getArea());
		   System.out.println("Perimeter=" +rect.getPerimeter());
	  }
}