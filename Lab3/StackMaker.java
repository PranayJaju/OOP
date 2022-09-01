import java.util.*;

class Stack
{
    int arr[];
    int tos;
    int top_pos=0;

    public Stack(int cap, int tos)
    {
        arr=new int[cap];
        arr[top_pos++]=tos;
        this.tos=tos;
    }
    public void push(int n)
    {
        if(top_pos==arr.length)
            System.out.println("---Stack Overflow---\nElement cannot be added.");
        else 
            arr[top_pos++]=n;
    }
    public int pop()
    {
        if(top_pos<=0)
        {
            System.out.println("---Stack Underflow---\nNo element to be popped.");
            return -10000000;
        }
        else
        {
            tos=arr[--top_pos];
            return tos;
        }
    }
    public void display()
    {
        if(top_pos<0)
        {
            System.out.println("Stack is empty.");
        }
        else
        {
            for(int i=top_pos-1; i>=0; i--)
            System.out.println(arr[i]);
            System.out.println("---------------");
        }
    }
}

class StackMaker
{
    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stack capacity.");
        int cap=sc.nextInt();
        System.out.println("Enter first num.");
        int f_ele=sc.nextInt();
        Stack st=new Stack(cap, f_ele);
        
        int action;
        do       
        {
            System.out.println("Enter action:\n1.Push\n2.Pop\n3.Exit.");
            action=sc.nextInt();

            if(action==1)
            {
                System.out.println("Enter number to be pushed");
                int element=sc.nextInt();
                st.push(element);
                System.out.println("The stack is:");
                st.display();
            }
            else if(action==2)
            {
                int popped=st.pop();
                System.out.println("Element popped: "+popped);
                System.out.println("The stack is:");
                st.display();
            }
            else 
            {
                System.out.println("The stack is:");
                st.display();
                System.out.println("Exiting...");
            }
        }while(action!=3);
    }
}