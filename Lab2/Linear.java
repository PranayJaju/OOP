import java.util.*;
class Linear
{
	public void linearSearch(int a[], int n)
	{
	    int flag=0;
	    Scanner scL=new Scanner(System.in);
	    System.out.println("Enter element to be searched.");
	    int x=scL.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i]==x)
            {
                flag=1;
                System.out.println("Element found at position "+(i+1));
                break;
            }
        }
        if(flag==0)
        System.out.println("Element not found.");
	}
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size.");
	    int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements.");
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        Linear l=new Linear();
        l.linearSearch(a, n);
	}
}