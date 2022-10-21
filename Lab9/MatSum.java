import java.util.*;

class RowSum implements Runnable
{
	int row[]; int sum=0;
	Thread t;
	RowSum(int row[])
	{
        t=new Thread(this);
		this.row=row;
		t.start();
	}
	public void run()
	{
		for(int i=0; i<row.length; i++)
			sum+=row[i];
	}
	int returnSum()
	{
		try {t.join();}
		catch(InterruptedException ie){;;}
		return sum;
	}
}

class MatSum
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3,4},
		         {5,6,7,8},
		         {9,10,11,12},
		         {13,14,15,16}};

		RowSum rs[]=new RowSum[arr.length];         
		int row_sum[]=new int[arr.length];
		int mat_sum=0;

		for(int i=0; i<arr.length; i++)
		{
			rs[i]=new RowSum(arr[i]);
			row_sum[i]=rs[i].returnSum();
		}

		try
		{
			for(int i=0; i<arr.length; i++)
                rs[i].t.join();
		}
		catch(InterruptedException ie)
		{System.out.println(ie);}

		for(int i=0; i<arr.length; i++)
            mat_sum+=row_sum[i];

        System.out.println("Matrix Sum: "+mat_sum);
	}
}