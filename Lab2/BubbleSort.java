import java.util.*;
class BubbleSort
{
	public void sort(int a[], int n)
	{
	    for(int i=0; i<n-1; i++)
	    {
	        for(int j=0; j<n-i-1; j++)
	        {
	            if(a[j]>a[j+1])
	            {
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	    System.out.println("Array in ascending order.");
	    for(int i=0; i<n; i++)
	    System.out.println(a[i]+"  ");

	    for(int i=0; i<n-1; i++)
	    {
	        for(int j=0; j<n-i-1; j++)
	        {
	            if(a[j]<a[j+1])
	            {
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	        }
	    }
	    System.out.println("Array in descending order.");
	    for(int i=0; i<n; i++)
	    System.out.println(a[i]+"  ");
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
	    BubbleSort bs= new BubbleSort();
	    bs.sort(a, n);
	}
}