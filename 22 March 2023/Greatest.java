//write a pgm to take 3 numbers and find the greatest of all 3 numbers
class Greatest
{
    public static void main(String args[])
	{
        int a=10,b=20,c=40;
		if(a>b && a>c)
		{
		     System.out.println("a is greatest");
		}
		else if(b>a && b>c)
		{
		     System.out.println("b is greatest");
		}
		else 
		{
		     System.out.println("c is greatest");
		}
	}
}