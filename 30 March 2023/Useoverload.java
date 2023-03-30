//write a pgm in java showing overloading of Add method with 2 and 3 parameters. In the user passes 2 values method with 2 parameter
//should be called if the passes 3 values method with 3 parameters should be called
class Addoverload
{
	//int a=20,b=30;
       public void add(int a,int b)
	   {
	       System.out.println(30+40);
	   }
	   public void add(int a,int b,int c)
	   {
	       System.out.println(20+30);
	   }
}

public class Useoverload
{
      public static void main(String args[])
	  {
	      Addoverload a1=new Addoverload();
		  a1.add(20,30);
		  a1.add(1,2,3);
	  }
}

	 