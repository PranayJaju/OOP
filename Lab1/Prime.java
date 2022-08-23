import java.util.*;
class PrimeChecker
{
	public static boolean isPrime(int x)
	{
	    for(int i=2; i<x; i++)
	    {
	        if(x%i==0)
	        return false;
	    }
	    return true;
	}
}
class Prime
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
            PrimeChecker p=new PrimeChecker();
	    System.out.println("Enter value of n.");
	    int n=sc.nextInt();
	    System.out.println("First "+n+" prime nos:");
	    int i=2;
            while(n>0)
            {
                if(p.isPrime(i))
                {
                    System.out.println(i);
                    n--;
                }
                i++;
            }
	}
}
