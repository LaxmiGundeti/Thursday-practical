//write a pgm to create thread. where you will take the input from the user and find if the number is even or odd.

import java.util.Scanner;
class ThreadE extends Thread
{
    public void run()
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		 
		if(n%2==0)
		{
		    System.out.println("Even number");
		}
		
		else
		{
		    System.out.println("Odd number");
		}
	}
}
public class EvenOdd1
{
   public static void main(String args[])
   {
       ThreadE t= new ThreadE();
	   t.start();
   }
}
	
   
   
		