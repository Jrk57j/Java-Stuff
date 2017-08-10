package project_six;
/**
 * 
 * @author Julian Itwaru
 * @ver 1.0
 */
public class Student
{
	
	
	//Sets string name to private and instantiates string
	private String name;
	//Sets testOne to private and instantiates int
	private int testOne;
	//Sets testOne to private and instantiates int
	private int testTwo;
	
	/*
	* creates a constructor for the name, testOne, and testTwo. Then it will allow for a user to enter from driver side the name 
	* the test scores and so on.
	*/
	//creates the constructor for the class that will pull data from the driver side
	public Student()
	{
		this.name = "";
		this.testOne = 0;
		this.testTwo = 0;
	}
	//instantiates the values 
	public Student(String name)
	{
		
		this.name = name;
		this.testOne = 0;
		this.testTwo = 0;
	}
	//will get the names from the driver 
	public String getName() 
	{//gets the name value from driver
		return this.name;
	}
	public void setName(String name) 
	{//sets the name value to void and enters the name from driver 
		this.name = name;
	}
	
	
	public int getTestOne() 
	{//gets the test value entered by the driver 
		return this.testOne;
	}
	public void setTestOne(int testOne) 
	{//sets the test value to void and take the test value entered by driver
		
		this.testOne = testOne;//change values
	}
	
	
	public int getTestTwo() 
	{//gets the test value entered by the driver 
		return this.testTwo;
	}
	public void setTestTwo(int testTwo) 
	{//sets the test value to void and take the test value entered by driver 
		
		this.testTwo = testTwo;
	}
	
	
	public double calculatedAverage()
	{//takes both test scores adds them and divides to return an average 
		return (this.testOne + (double)this.testTwo) / 2;
	}
	
	public String toString()
	{//produces a string that contains the name of the student and their test scores. 
		return "Student " + this.name + "\nTestOne " + this.testOne + "\nTestTwo " + this.testTwo;
	}
	
	
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))//compares the name of each student and returns a true or false value
		{
			return false;
		}
		
		//Compare contents of Student to see if the test average are the same and returns a true or false value
		 Student other = (Student)obj;
		 return this.name.equalsIgnoreCase(other.name)&& (this.testOne == other.testOne) && (this.testTwo == other.testTwo);
		 
	}
	
	
	
}	
	