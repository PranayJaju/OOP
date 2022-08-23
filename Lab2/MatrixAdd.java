import java.util.*;
class MatrixAdd
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter order of Matrix 1.");
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    System.out.println("Enter order of Matrix 2.");
	    int p=sc.nextInt();
	    int q=sc.nextInt();
	    if(m!=p && n!=q)
	    {
	        System.out.println("Matrix addition is not possible.");
	    }
	    else
	    {
	        int a[][]=new int[m][n];
	        int b[][]=new int[p][q];
	        System.out.println("Enter Matrix 1 elements.");
	        for(int i=0; i<m; i++)
	            for(int j=0; j<n; j++)
	                a[i][j]=sc.nextInt();
	        System.out.println("Enter Matrix 2 elements.");
	        for(int i=0; i<p; i++)
	            for(int j=0; j<q; j++)
	                b[i][j]=sc.nextInt();

	        int r[][]=new int[m][n]; 
	        for(int i=0; i<m; i++)
	            for(int j=0; j<n; j++)
	                r[i][j]=a[i][j]+b[i][j];

	        System.out.println("Addition Result.");
	        for(int i=0; i<m; i++)
	        {
	            for(int j=0; j<n; j++)
	                System.out.print(r[i][j]+"  ");
	            System.out.println();                 
	        }
	    }
	}
}