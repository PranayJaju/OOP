import java.util.*;
class Time
{
	int hours, minutes, seconds;
	public Time(int hours, int minutes, int seconds)
	{
	    this.hours=hours;
	    this.minutes=minutes;
	    this.seconds=seconds;
	}

	public void display()
	{
	    System.out.println("Time in 24-hour format: "+hours+":"+minutes+":"+seconds);
	}

	public Time addition(Time t)
	{
	    Time addTime=new Time(0, 0, 0);

	    if(seconds+t.seconds>60)
	    {
            addTime.seconds=seconds+t.seconds-60;
            minutes++;
	    }
	    else
	    	addTime.seconds=seconds+t.seconds;

	    if(minutes+t.minutes>60)
	    {
	    	addTime.minutes=minutes+t.minutes-60;
	        hours++;
	    }
	    else
	    	addTime.minutes=minutes+t.minutes;

	    if(hours+t.hours>=24)
	        addTime.hours=hours+t.hours-24;
        else 
        	addTime.hours=hours+t.hours;

	    return addTime;
	}

    public Time subtract(Time t)
    {
    	Time subTime=new Time(0, 0, 0);

    	System.out.println(hours+"   "+t.hours);

    	subTime.hours=hours-t.hours;
    	subTime.minutes=minutes-t.minutes;
    	subTime.seconds=seconds-t.seconds;

    	System.out.println(subTime.hours);

    	if(subTime.seconds<0)
    	{
    		subTime.seconds+=60;
    		subTime.minutes--;
    	}	
    	if(subTime.minutes<0)
    	{
    		subTime.minutes+=60;
    		subTime.hours--;
    	}	
    	if(subTime.hours<0)
    		subTime.hours+=24;

        return subTime;
    }

    public int compare(Time t)
    {
    	if(hours>t.hours)
    		return 1;
    	if(hours<t.hours) 
    		return -1;
    	if(minutes>t.minutes)
    		return 1;
    	if(minutes<t.minutes)
    		return -1;
    	if(seconds>t.seconds)
    		return 1;
    	if(seconds<t.seconds)
    		return -1;
    	return 0;
    }
}

class TimeDemo
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Time 1 in format hh:mm:ss");
	    int hours1=sc.nextInt();
	    int minutes1=sc.nextInt();
	    int seconds1=sc.nextInt();
	    System.out.println("Enter Time 2 in format hh:mm:ss");
	    int hours2=sc.nextInt();
	    int minutes2=sc.nextInt();
	    int seconds2=sc.nextInt();

	    Time t1=new Time(hours1, minutes1, seconds1);
	    Time t2=new Time(hours2, minutes2, seconds2);

	    Time subTime;
        subTime=t1.subtract(t2);
        System.out.println("Subtraction Result:");
        subTime.display();

	    Time addTime;
        addTime=t1.addition(t2);
        System.out.println("Addition Result:");
        addTime.display();

        t1.hours=hours1;
        t1.minutes=minutes1;
        t1.seconds=seconds1;

        int comp=t1.compare(t2);
        if(comp==1)
        	System.out.println("Time 1 is greater than Time 2.");
        else if(comp==-1)
        	System.out.println("Time 2 is greater than Time 1.");
        else 
        	System.out.println("Time 1 == Time 2.");
	}
}