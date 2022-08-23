import java.util.*;
class Largest
{
    public static void fLarge(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            System.out.println(a+" is the largest.");
            else
            System.out.println(c+" is the largest.");
        }
        if(a<b)
        {
            if(b>c)
            System.out.println(b+" is the largest.");
            else
            System.out.println(c+" is the largest.");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 nos:");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    fLarge(a,b,c);
    }
	
}