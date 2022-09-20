import java.util.*;
class Person
{
	private String name;
	private GregorianCalendar dob;

	public Person()
	{
	    name="";
        dob=new GregorianCalendar();
	}

	public Person(String name, GregorianCalendar dob)
	{
	    this.name=name;
	    this.dob=dob;
	}

	public void setName(String name)
	{
        this.name=name;
	}

	public void setDOB(GregorianCalendar dob)
	{
        this.dob=dob;
	}

	public String getName()
	{
        return name;
	}

	public GregorianCalendar getDOB()
	{
	    return dob;
	}
}

class CollegeGraduate extends Person
{
	private float gpa;
	private int yearOfGraduation;

	public CollegeGraduate()
	{
	    gpa=0.0f;
	    yearOfGraduation=0;
	}

	public CollegeGraduate(String name, GregorianCalendar DOB, float gpa, int year)
	{
	    super(name, DOB);
	    this.gpa=gpa;
	    yearOfGraduation=year;
	}

	public void setGPA(float gpa)
	{
        this.gpa=gpa;
	}

	public void setYear(int year)
	{
        yearOfGraduation=year;
	}

	public float getGPA()
	{
        return gpa;
	}

	public int getyear()
	{
	    return yearOfGraduation;
	}
}

class College
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Name.");
	    String name=sc.nextLine();
	    System.out.println("Enter Date of Birth.(dd/mm/yyyy)");
	    int date=sc.nextInt();
	    int month=sc.nextInt();
	    int year=sc.nextInt();
	    GregorianCalendar DOB=new GregorianCalendar(year, month, date);
	    System.out.println("Enter GPA.");
	    float gpa=sc.nextFloat();
	    System.out.println("Enter Year of Graduation.");
	    int yearOfGraduation=sc.nextInt();
	    CollegeGraduate cg=new CollegeGraduate(name, DOB, gpa, yearOfGraduation);

	    System.out.println("\nCollege Graduate Details.");
	    System.out.println("Name: "+cg.getName());
	    System.out.print("Date Of Birth: ");
	    System.out.println(cg.getDOB().get(Calendar.DATE)+"/"+cg.getDOB().get(Calendar.MONTH)+"/"+cg.getDOB().get(Calendar.YEAR));
	    System.out.println("GPA: "+cg.getGPA());
	    System.out.println("Year of Graduation: "+cg.getyear());
	}
}