import java.util.*;
class Student
{
	String Name;
	int Id;

	public Student(String Name, int Id)
	{
	    this.Name=Name;
	    this.Id=Id;
	}
}

class Sports extends Student
{
	int s_grade;
    
    public Sports(String Name, int Id, int s_grade)
    {
        super(Name, Id);
        this.s_grade=s_grade;
    }
}

class Exam extends Student
{
	int e_grade;
    
    public Exam(String Name, int Id, int e_grade)
    {
        super(Name, Id);
        this.e_grade=e_grade;
    }
}

class Results extends Exam
{
	String finalResult;
	Sports s;

	public Results(String Name, int Id, int e_grade, int s_grade, String finalResult)
	{
		super(Name, Id, e_grade);
		this.finalResult=finalResult;
		s=new Sports(Name, Id, s_grade);
	}

	public void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("ID: "+Id);
		System.out.println("Exam Grade: "+e_grade);
		System.out.println("Sports Grade: "+s.s_grade);
		System.out.println("Final Result: "+finalResult);
	}
}

class StudentRecord
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name.");
		String name=sc.nextLine();
		System.out.println("Enter ID.");
		int id=sc.nextInt();
		System.out.println("Enter Sports Grade.");
		int s_grade=sc.nextInt();
	    System.out.println("Enter Exam Grade.");
		int e_grade=sc.nextInt();
		System.out.println("Final Result.");
		sc.nextLine();
		String finalResult=sc.nextLine();

		Results r=new Results(name, id, e_grade, s_grade, finalResult);
		r.display();
	}
}