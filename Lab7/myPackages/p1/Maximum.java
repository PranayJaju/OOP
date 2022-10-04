package myPackages.p1;
import java.util.*;

class Maximum
{
	static int max(int x, int y, int z)
	{
	    return (x>y)?(x>z)?x:z:(y>z)?y:z;
	}

	static float max(float x, float y, float z)
	{
	    return (x>y)?(x>z)?x:z:(y>z)?y:z;
	}

	static int max(int a[])
	{
	    int max=a[0];
	    for(int i=1; i<a.length; i++)
	    {
            if(a[i]>max)
            max=a[i];
	    }
	    return max;
	}

	static int max(int a[][])
	{
	    int max=a[0][0];
	    for(int i=0; i<a.length; i++)
	    {
	        for(int j=0; j<a[i].length; j++)
            if(a[i][j]>max)
            max=a[i][j];
	    }
	    return max;
	}

}