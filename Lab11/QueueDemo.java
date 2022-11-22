/*WAP a program to create generic interface Queue that describes two functions: put() and get(). Handle your own exceptions for 
these methods based on queue full and queue empty conditions. Define the class which implements this interface and demonstrates 
its working in main.*/

import java.util.*;

class QueueFullException extends Exception
{
	public String toString()
	{return "QueueFullException";}
}

class QueueEmptyException extends Exception
{
	public String toString()
	{return "QueueEmptyException";}
}

interface Queue<T>
{
	void put(T x)throws QueueFullException;
	T get()throws QueueEmptyException;
}

class Queue1<T> implements Queue<T>
{
	T[] q;
	int size, f, r;
	Queue1(int size)
	{
		this.size=size;
		q=(T[])new Object[size];
		f=-1; r=-1;
	}

	public void put(T x)throws QueueFullException
	{
		if(r==size-1) throw new QueueFullException();
		else q[++r]=x;
	}

	public T get()throws QueueEmptyException
	{
		if(f==r) throw new QueueEmptyException();
		else return q[++f];
	}

	public void display()throws QueueEmptyException
	{
		if(f==r)
			throw new QueueEmptyException();
		for(int i=f+1; i<=r; i++)
			System.out.print(q[i]+"  ");
		System.out.println();
	}
}

class QueueDemo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Queue1<String> q1=new Queue1<>(3);

		try
		{
			q1.put("bonjour");
			q1.put("hello");
			q1.put("hola");
			q1.put("hi");
		}
		catch(QueueFullException qfe)
		{System.out.println(qfe);}
		
		try{q1.display();}
		catch(QueueEmptyException qee)
		{System.out.println(qee);}

		try
		{
			q1.get();
			q1.get();
			q1.display();
			q1.get();
			q1.get();
		}
		catch(QueueEmptyException qfe)
		{System.out.println(qfe);}
	}
}