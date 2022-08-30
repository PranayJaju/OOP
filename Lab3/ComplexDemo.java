import java.util.*;
class Complex
{
    double real, img;
	public Complex(double real, double img)
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
	public Complex addition(Complex c)
	{
        Complex addRes=new Complex(0.0, 0.0);
        addRes.real=this.real+c.real;
        addRes.img=this.img+c.img;
        return addRes;
	}
	public Complex subtract(Complex c)
	{
		Complex subRes=new Complex(0.0, 0.0);
		subRes.real=this.real-c.real;
		subRes.img=this.img-c.img;
		return subRes;
	}
}

class ComplexDemo
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

	    Complex c1=new Complex(a, b);
	    Complex c2=new Complex(x, y);

	    Complex addRes;
	    addRes=c1.addition(c2);
	    addRes.display();

	    Complex subRes;
	    subRes=c1.subtract(c2);
	    subRes.display();
	}
}