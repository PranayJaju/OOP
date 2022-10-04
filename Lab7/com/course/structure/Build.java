package com.course.structure;
import java.util.*;

public class Build
{
	public static void main(String args[])
	{
		Building b=new Building(15000, 10);
	    House h=new House(15000, 10, 6, 8);
	    School s=new School(15000, 10, 80, "High School");

	    System.out.println("Building is "+b.getSqFoot()+" sqFeet and "+b.getStories()+" high.");
	    System.out.println("House has "+h.getBedroom()+" bedrooms and "+h.getBath()+" baths.");
	    System.out.println("School has "+s.getClassroom()+" classroooms and is "+s.getGradeLevel()+" level.");
	}
	
}	