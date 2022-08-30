import java.util.*;
class Mixer
{
	int arr[], n;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array size.");
	    n=sc.nextInt();
	    arr=new int[n];
	    System.out.println("Enter array elements.");
	    for(int i=0; i<n; i++)
	    arr[i]=sc.nextInt();
	}

	public Mixer mix(Mixer A)
	{
	    Mixer result=new Mixer();
        result.n=n+A.n;
        result.arr=new int[result.n];

        int this_pointer=0, A_pointer=0;
        for(int i=0; i<result.n; i++)
        {
            if(this_pointer>=n)
            {
                result.arr[i]=A.arr[A_pointer];
                A_pointer++;
            }
            else if(A_pointer>=A.n || arr[this_pointer]<A.arr[A_pointer])
            {
                result.arr[i]=arr[this_pointer];
                this_pointer++;
            }
            else
            {
                result.arr[i]=A.arr[A_pointer];
                A_pointer++;
            }
        }

        return result;
	}

	public void display()
	{
	    System.out.println("Array:");
	    for(int i=0; i<n; i++)
	    System.out.print(arr[i]+"  ");
	}

	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    Mixer A=new Mixer();
	    Mixer B=new Mixer();

	    System.out.println("Enter A");
        A.accept();

        System.out.println("Enter B");
        B.accept();

        Mixer res;
        res=A.mix(B);
        res.display();
	}
}