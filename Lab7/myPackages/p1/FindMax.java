package myPackages.p1;
import java.util.*;

class FindMax
{
	public static void main(String... args)
	{
	    Maximum m=new Maximum();
	    int a1[]={23,83,69,42,63,57};
	    int a2[][]={{23,74,1,90}, {923,8747,233}, {8,39,11,22,98,35}, {23,75,369,42}};

	    System.out.println("Max of 732, 81, 17: "+m.max(732, 81, 17));
	    System.out.println("Max of 7.32, 8.1, 1.7: "+m.max(7.32f, 8.1f, 1.7f));
	    System.out.println("Max of Array 1: "+m.max(a1));
	    System.out.println("Max of Array 2: "+m.max(a2));
	}
}