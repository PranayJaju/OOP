import java.util.*;
class InsDel
{
	public void insert(int a[], int n)
	{
		Scanner scI=new Scanner(System.in);
	    System.out.println("Enter element to be inserted.");
	    int element=scI.nextInt();
	    System.out.println("Enter position to be inserted at.");
	    int pos=scI.nextInt();
	    for(int i=n-1; i>=pos; i--)
	    a[i+1]=a[i];
	    a[pos]=element;
	    System.out.println("Array after insertion.");
	    for(int i=0; i<=n; i++)
	    System.out.println(a[i]+"  ");
	}
	public void del(int b[], int x)
	{
		Scanner scD=new Scanner(System.in);
		System.out.println("Enter position to be deleted.");
	    int pos=scD.nextInt();
	    for(int i=pos-1; i<x; i++)
	    b[i]=b[i+1];
	    System.out.println("Array after deletion.");
	    for(int i=0; i<x; i++)
	    System.out.println(b[i]+"  ");
	}
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size");
	    int n=sc.nextInt();
	    int a[]=new int[50];
        System.out.println("Enter "+n+" elements.");
        for(int i=0; i<n; i++)
        a[i]=sc.nextInt();
        InsDel id=new InsDel();
        id.insert(a, n);
        id.del(a, n);
	}
}