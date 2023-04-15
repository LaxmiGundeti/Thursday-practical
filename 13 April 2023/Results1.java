//write a pgm to take input of marks of 3 subjects from user.check if the total of marks givenby the user is greater than 50 else throw an exception
//saying "you failed". or else print grade is A if the total is greater than 280. Grade B if the total is greater than 200. Grade C if the total is
//greater than 150. Grade D if the total is greater than 50.

import java.util.Scanner;
class Marks
{
    int oop,networking,php,total;
	void getmarks()
	{
	     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter oop subject marks:");  //taking subject marks from user
		 oop=sc.nextInt();
		 System.out.println("Enter networking subject marks:");  //taking subject marks from user
		 networking=sc.nextInt();
		 System.out.println("Enter php subject marks:");  //taking subject marks from user
		 php=sc.nextInt();
		 total=oop+networking+php;   
		 sc.close();
	}
	void display()
	{
	    if(total<50)
		{
		     throw new ArithmeticException("You failed");
		}
		else if(total>=280 && total<=300)
		{
		      System.out.println("You got A grade");
		}
		else if(total>=150 && total<280)
		{
		      System.out.println("You got B grade");
		}
		else if(total>=50 && total<150)
		{
		      System.out.println("You got C grade");
		}
		
	}
	
}
public class Results1
{
    public static void main(String args[])
	{
	    Marks m1=new Marks();
		m1.getmarks();
		m1.display();
	}
}
		

