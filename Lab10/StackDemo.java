import java.util.*;
class Student
{
	String name; int regNo;
	Student(String n, int rn){name=n; regNo=rn;}
	public String toString()
	{return "Name: "+name+" RegNo: "+regNo;}
}
class Employee
{
	String name; int empNo;
	Employee(String n, int en){name=n; empNo=en;}
	public String toString()
	{return "Name: "+name+" EmpNo: "+empNo;}
}
class Stack<T>
{
	T[] s;
	int top;

	Stack(int size)
	{
		s=(T[])new Object[size];
		top=-1;
	}
	void push(T ele)
	{
		if(top==s.length-1)
			System.out.println("Stack overflow.");
		else
			s[++top]=ele;
	}
	T pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow.");
			return null;
		}
		else
			return s[top--];
	}
	void display()
	{
		if(top==-1)
			System.out.println("Stack underflow.");
		else
			for(T x: s)
				System.out.println(x);
	}
}
class StackDemo
{
	public static void main(String... args)
	{
		Stack<Student> ss=new Stack<>(3);
		Stack<Employee> se=new Stack<>(3);

		for(int i=0; i<3; i++)
		{
			Student s=new Student("s"+Integer.toString(i), i);
			Employee e=new Employee("e"+Integer.toString(i), i);
			ss.push(s);
			se.push(e);
		}
		System.out.println("Student stack.");
        ss.display();
        System.out.println("\nEmployee stack.");
        se.display();
	}
}