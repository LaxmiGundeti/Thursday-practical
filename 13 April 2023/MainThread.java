//create two thread one thread id finding average of first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}

class Average extends Thread
{
    int avg,total=0;
	public void run()
	{
	    for(int i=1;i<=50;i++)
	    {
		    total=total+i;
			avg=total/50;
		}
		System.out.println("Average of first 50 number is:"+avg);
	}
		
}
class Square extends Thread 
{
	int i;
    int arr[]= {10,15,20,25,30};
	public void run()
	{
	     for(i=0;i<arr.length;i++)
		 {
		     System.out.println("square of "+arr[i] +" is "+(arr[i]*arr[i]));
			 
		 }
	}
}
public class MainThread
{
   public static void main(String args[])
   {
       Average a=new Average();
	   a.start();
	   Square s=new Square();
	   s.start();
   }
}
	   
	   

	
