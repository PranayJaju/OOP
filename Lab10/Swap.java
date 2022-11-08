class ArraySwap
{
	<T> void swap(T o[], int a, int b)
	{
		T temp=o[a];
		o[a]=o[b];
		o[b]=temp;
	}
	<T> void display(T o[])
	{
		for(T x: o)
			System.out.print(x+"  ");
		System.out.println();
	}
}

class Swap
{
	public static void main(String... args)
	{
		Integer i[]={23,89,69,42,38,77};
		String s[]={"abc","xyz","pqrs","lmn","ijk"};

		ArraySwap as=new ArraySwap();
		as.display(i);
		as.swap(i, 1, 4);
		as.display(i);
		System.out.println();
		as.display(s);
		as.swap(s, 0, 3);
		as.display(s);
	}
}