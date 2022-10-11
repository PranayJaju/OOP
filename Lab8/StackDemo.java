import java.util.*;

class PushException extends Exception
{
	PushException()
	{super();}

	public String toString()
	{return "Stack Overflow";}
}

class PopException extends Exception
{
	PopException()
	{super();}

	public String toString()
	{return "Stack Undeflow";}
}

class Stack
{
	int stack[];
	int top;
	int size;

	boolean isFull(){return top==size-1;}

	boolean isEmpty(){return top==-1;}

	Stack()
	{
		stack=new int[5];
		top=-1;
		size=5;
	}

	Stack(int size)
	{
		stack=new int[size];
		top=-1;
		this.size=size;
	}

	public void push(int ele)throws PushException
	{
		if(isFull())
			throw new PushException();
		else 
			stack[++top]=ele;
	}

	public int pop()throws PopException
	{
		if(isEmpty())
			throw new PopException();
		else 
			return stack[top--];
	}

	public void display()throws PopException
	{
		if(isEmpty())
			throw new PopException();
		else
		{
			for(int i=top; i>=0; i--)
				System.out.println(stack[i]);
		    System.out.println();
		}	
	}
}

class StackDemo
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stack size.");
		int size=sc.nextInt();
		Stack s=new Stack(size);
		int action;
		do
		{
			System.out.println("Enter action.\n1.Push\n2.Pop\n3.Display\n4.Exit");
			action=sc.nextInt();
            if(action==1)
            {
            	System.out.println("Enter element to be pushed: ");
                int ele=sc.nextInt();
                try{s.push(ele);}
                catch(PushException ex){
                	System.out.println(ex);
                }
            }
            else if(action==2)
            {
            	try{System.out.println("Element popped: "+s.pop());}
            	catch(PopException ex){
            		System.out.println(ex);
            	}
            }
            else if(action==3)
            {
            	System.out.println("The Stack is: ");
            	try{s.display();}
            	catch(PopException ex){
            		System.out.println(ex);
            	}
            }
            else if(action==4)
            {
            	System.out.println("The Stack is: ");
            	try{s.display();}
            	catch(PopException ex){
            		System.out.println(ex);
            	}
            	System.out.println("Exiting...");
            }
		}while(action!=4);
	}
}