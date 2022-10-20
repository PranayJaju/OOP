import java.util.*;

class SeatsFilledException extends Exception
{
    SeatsFilledException()
    {super();}

    public String toString()
    {return "Seats Capacity reached.";}
}

class Student
{
	int RegNo;
	String fname;
    short sem;
    GregorianCalendar doj;
    float gpa, cgpa;

    public Student()
    {
    	fname="";
    	RegNo=0;
    	sem=0;
    	gpa=0.0f;
    	cgpa=0.0f;
    	doj=new GregorianCalendar();
    }

    public Student(String fn, short s, int year, int month, int day, float GPA, float CGPA, int sn)throws SeatsFilledException
    {
        try
        { RegNo=calRegNo(sn, year); }
        catch(SeatsFilledException sfe)
        {
            System.out.println("****"+sfe+"****");
            System.out.println("**"+sn+" is more than seat capacity of 25.**");
            RegNo=0;
        }
        fname=fn;
        sem=s;
        doj=new GregorianCalendar(year,month,day);
        gpa=GPA;
        cgpa=CGPA;
    }

    public void display()
    {
        System.out.printf("%-25s%-20s\n","Name:",fname);
        if(doj.get(Calendar.YEAR)<2010)
            System.out.printf("%-25s0%-10d\n","Registration Number:", RegNo);
        else 
        System.out.printf("%-25s%-10d\n","Registration Number:", RegNo);
        System.out.printf("%-25s%-10d\n", "Semester:", sem);
        System.out.printf("%-25s", "Date of Joining:");
        System.out.println(doj.get(Calendar.DATE)+"/"+doj.get(Calendar.MONTH)+"/"+doj.get(Calendar.YEAR));
        System.out.printf("%-25s%-10.2f\n", "GPA:", gpa);
        System.out.printf("%-25s%-10.2f\n", "CGPA:", cgpa);
    }

    public int calRegNo(int stuNo, int year)throws SeatsFilledException
    {
        if(stuNo>25)
            throw new SeatsFilledException();
        else
            RegNo=(year%100)*100+stuNo;
        return RegNo;      
    }
}

class StudentException
{
	public static void main(String args[])
	{
        Student s1=new Student(), s2=new Student();

        System.out.println("Student 1.");
        try
        {
	        s1=new Student("ABC", (short)3, 2021, 10, 18, 9.5f, 9.0f, 146);
        }
        catch(SeatsFilledException sfe){;;}
        finally{s1.display();}

        System.out.println("\nStudent 2.");
        try
        {
	        s2=new Student("XYZ", (short)7, 2019, 7, 14, 8.3f, 8.2f, 20);
        }
        catch(SeatsFilledException sfe){;;}
        finally{s2.display();}
	}
}
