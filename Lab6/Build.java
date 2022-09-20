import java.util.*;
class Building
{
	private int sqFoot;
	private int stories;

	public Building()
	{
	    sqFoot=0;
	    stories=0;
	}

	public Building(int sqFoot, int stories)
	{
	    this.sqFoot=sqFoot;
	    this.stories=stories;
	}

	public void setSqFoot(int sqFoot)
	{
		this.sqFoot=sqFoot;
	}

	public void setStories(int stories)
	{
		this.stories=stories;
	}

	public int getSqFoot()
	{
		return sqFoot;
	}

	public int getStories()
	{
		return stories;
	}
}

class House extends Building
{
	private int bedroom;
	private int bath;

	public House()
	{
	    bedroom=0;
	    bath=0;
	}

	public House(int sqFoot, int stories, int bedroom, int bath)
	{
		super(sqFoot, stories);
	    this.bedroom=bedroom;
	    this.bath=bath;
	}

	public void setBedroom(int bedroom)
	{
		this.bedroom=bedroom;
	}

	public void setBath(int bath)
	{
		this.bath=bath;
	}

	public int getBedroom()
	{
		return bedroom;
	}

	public int getBath()
	{
		return bath;
	}
}

class School extends Building
{
	private int classroom;
	private String gradeLevel;

	public School()
	{
	    classroom=0;
	    gradeLevel="";
	}

	public School(int sqFoot, int stories, int classroom, String gradeLevel)
	{
		super(sqFoot, stories);
	    this.classroom=classroom;
	    this.gradeLevel=gradeLevel;
	}

	public void setClassroom(int classroom)
	{
		this.classroom=classroom;
	}

	public void setGradeLevel(String gradeLevel)
	{
		this.gradeLevel=gradeLevel;
	}

	public int getClassroom()
	{
		return classroom;
	}

	public String getGradeLevel()
	{
		return gradeLevel;
	}
}

class Build
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter sq footage.");
	    int sqFoot=sc.nextInt();
	    System.out.println("Enter stories.");
	    int stories=sc.nextInt();
	    System.out.println("Enter bedroom.");
	    int bedroom=sc.nextInt();
	    System.out.println("Enter bath.");
	    int bath=sc.nextInt();
	    System.out.println("Enter classroom.");
	    int classroom=sc.nextInt();
        System.out.println("Enter Grade Level.");
        sc.nextLine();
	    String gradeLevel=sc.nextLine();

	    Building b=new Building(sqFoot, stories);
	    House h=new House(sqFoot, stories, bedroom, bath);
	    School s=new School(sqFoot, stories, classroom, gradeLevel);

        System.out.println("\nBuilding Details.");
		System.out.println("Building Sq Footage: "+b.getSqFoot());
		System.out.println("No.of Stories in building: "+b.getStories());

		System.out.println("\nHouse Details.");
		System.out.println("No.of bedroom in house: "+h.getBedroom());
		System.out.println("No.of bath: "+h.getBath());

		System.out.println("\nSchool Deatils.");
		System.out.println("No.of classrooms: "+s.getClassroom());
		System.out.println("Grade Level: "+s.getGradeLevel());

	}
}