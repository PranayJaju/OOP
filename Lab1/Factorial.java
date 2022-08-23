import java.util.*;
class FactFinder
{
	public static int Fact(int x)
	{
	    if(x==0)
	    return 1;
	    int f=1;
	    for(int i=1; i<=x; i++)
	    f*=i;
	    return f;
	}
}
class Factorial
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
            FactFinder f=new FactFinder();
	    System.out.println("Enter n.");
	    int n=sc.nextInt();
	    System.out.println("Enter r.");
	    int r=sc.nextInt();
	    if(r>n||r<0)
	    System.out.println("Invalid entry for r.");
	    else
	    {
	        double nCr=f.Fact(n)/(f.Fact(r)*f.Fact(n-r));
	        System.out.println(n+"C"+r+" = "+nCr);
	    }
	}
}
