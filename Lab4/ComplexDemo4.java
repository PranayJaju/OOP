import java.util.*;
class Complex4
{
    double real, img;
    public Complex4()
    {
    	real=0.0;
    	img=0.0;
    }
	public Complex4(double real, double img)
	{
	    this.real=real;
	    this.img=img;
	}
	public void display()
	{
		if(img>0)
	    System.out.println("The complex number is: "+real+"+i"+img);
	    else System.out.println("The complex number is: "+real+"-i"+Math.abs(img));
	}
	public Complex4 addition(Complex4 c)
	{
        Complex4 addRes=new Complex4(0.0, 0.0);
        addRes.real=this.real+c.real;
        addRes.img=this.img+c.img;
        return addRes;
	}
	public Complex4 subtract(Complex4 c)
	{
		Complex4 subRes=new Complex4(0.0, 0.0);
		subRes.real=this.real-c.real;
		subRes.img=this.img-c.img;
		return subRes;
	}
}

class ComplexDemo4
{	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Complex number 1(only the numeric value)");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println("Enter Complex number 2(only the numeric value)");
	    int x=sc.nextInt();
	    int y=sc.nextInt();

	    Complex4 c1=new Complex4(a, b);
	    Complex4 c2=new Complex4(x, y);

	    Complex4 addRes;
	    addRes=c1.addition(c2);
	    addRes.display();

	    Complex4 subRes;
	    subRes=c1.subtract(c2);
	    subRes.display();
	}
}
