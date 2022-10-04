import java.util.*;
class Student
{
	private int RollNo, marks;
    
    void getMarks(int marks)
    {
    	this.marks=marks;
    }
    void getNum(int RollNo)
    {
    	this.RollNo=RollNo;
    }
    int putMarks()
    {
    	return marks;
    }
    int putNum()
    {
    	return RollNo;
    }
}

interface Sports
{
    void putGrade(int s_grade);
}

class Results extends Student implements Sports
{
	int s_grade;
	public void putGrade(int s_grade)
    {
   		this.s_grade=s_grade;
   	}

   	int FinalGrade()
   	{
   		return super.putMarks()+s_grade;
   	}
}

class Grades
{
    public static void main(String... args)
    {
    	Results r=new Results();
    	r.putGrade(25);
    	r.getNum(100);
    	r.getMarks(75);

    	System.out.println("RollNo "+r.putNum()+" has Final Grade of "+r.FinalGrade());
    }
}