import java.util.*;
class Quadratic
{
	public static void main(String[] args)
	{
	    int ch;
	    double r1, r2;
	    double img;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a, b, c in form ax^2+bx+c.");
	    double a=sc.nextInt();
	    double b=sc.nextInt();
	    double c=sc.nextInt();
	    double dis=b*b-4*a*c;
	    if(dis>0)
        ch=1;
        else if(dis==0)
        ch=0;
        else ch=-1;
        switch(ch)
        {
            case 0: 
            r1=-b/(2*a);
            System.out.println("Equation has real and equal roots.");
            System.out.println("Roots = "+r1);
            break;

            case 1:
            r1=(-b+Math.sqrt(dis))/(2*a);
            r2=(-b-Math.sqrt(dis))/(2*a);
            System.out.println("Equation has real and unequal roots.");
            System.out.println("Root1 = "+r1+"  Root2 = "+r2);
            break;

            case -1:
            r1=-b/(2*a);
            img=Math.sqrt(-dis)/(2*a);
            System.out.println("Equation has complex roots.");
            System.out.println("Roots = "+r1+" +/- i"+img);
            break;  
        }
	}
}
