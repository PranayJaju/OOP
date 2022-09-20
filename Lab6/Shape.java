import java.util.*;
abstract class Figure
{
	int height;
	int base;

	public Figure(int height, int base)
	{
	    this.height=height;
	    this.base=base;
	}

	abstract public void area();
}

class Rectangle extends Figure
{

	public Rectangle(int height, int base)
	{
		super(height, base);
	}

	public void area()
	{
		System.out.println("Rectangle Area: "+height*base);
	}
}

class Square extends Figure
{

	public Square(int height)
	{
		super(height, height);
	}
    
    public void area()
    {
    	System.out.println("Square Area: "+height*height);
    }
}

class Triangle extends Figure
{

	public Triangle(int height, int base)
	{
		super(height, base);
	}
    
    public void area()
    {
    	System.out.println("Triangle Area: "+ 0.5*height*base);
    }
}

class Shape
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter height and base.");
	    int height=sc.nextInt();
	    int base=sc.nextInt();

	    Figure f;
	    Rectangle r=new Rectangle(height, base);
	    Square s=new Square(height);
	    Triangle t=new Triangle(height, base);

		f=r;
		f.area();

		f=s;
		f.area();

		f=t;
		f.area();
	}
}