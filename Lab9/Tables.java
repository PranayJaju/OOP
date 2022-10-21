import java.util.*;

class Multiply extends Thread
{
	int number;
	Multiply(int number)
	{
		super("Multiply Thread "+Integer.toString(number));
		System.out.println("New Thread: "+this);
		this.number=number;
		start();
	}

	public void run()
	{
       try
       {
           for(int i=1; i<=10; i++)
           {
               System.out.println(number+" * "+i+" = "+number*i);
               Thread.sleep(750);
           }
       }
       catch(InterruptedException ie)
       {
       	   System.out.println(number+" table interrupted.");
       }
       System.out.println("Exiting "+number+" table.");
	}
}

class Tables
{
	public static void main(String args[])
	{
		new Multiply(5);
		new Multiply(7);
		try
		{Thread.sleep(8000);}
		catch(InterruptedException ie)
		{System.out.println("Main Thread Interrupted.");}
		System.out.println("Main Thread Exiting.");
	}
}