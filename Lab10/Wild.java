import java.util.*;
class Num<T>
{
	T data;
	Num(T d){data=d;}
	static double diff(Num<? extends Number> a, Num<? extends Number> b)
	{return a.data.doubleValue()-b.data.doubleValue();}
}

class Wild
{
	public static void main(String[] args)
	{
		Num<Integer> i=new Num<>(12);
		Num<Float> f=new Num<>(2.389f);
		double diff=Num.diff(i, f);
		System.out.printf("%-10s %-5.2f", "Difference:", diff);
	}
}