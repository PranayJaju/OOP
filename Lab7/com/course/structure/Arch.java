package com.course.structure;
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
