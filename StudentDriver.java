package project_six;

/*
*@Julian Itwaru
*ver 1.0
* this program will test the class to ensure that it is returning the proper values. This is strictly a test program 
*/

import java.util.Scanner;
public class StudentDriver
{
	

	public static void main(String[] args)
	{
		//creates the objects for the class 
		Scanner keyboard = new Scanner(System.in);
		//create instance variables
		Student studentOne = new Student("Julian");
		Student studentTwo = new Student("");
		System.out.print("Enter Student 2 name: ");
		studentTwo.setName(keyboard.nextLine());
		//show the new students and their test scores 
		System.out.println(studentOne.getName());
		System.out.println(studentOne.getTestOne());
		System.out.println(studentOne.getTestTwo());
		System.out.println(studentTwo.getName());
		System.out.println(studentTwo.getTestOne());
		System.out.println(studentTwo.getTestTwo());
		
		//sets test one and test two scores
		studentOne.setTestOne(100);
		studentOne.setTestTwo(95);
		studentTwo.setTestOne(95);
		studentTwo.setTestTwo(70);
		//this will show the new scores and the averages and compare the students to show if the statements are true or false
		System.out.println();
		System.out.println(studentOne + "Average");
		System.out.println(studentOne.getTestOne());
		System.out.println(studentOne.getTestTwo());
		System.out.println(studentOne.calculatedAverage());
		System.out.println();
		System.out.println(studentTwo + "Average");
		System.out.println(studentTwo.getTestOne());
		System.out.println(studentTwo.getTestTwo());
		System.out.println(studentTwo.calculatedAverage());
		System.out.println();
		System.out.println(studentOne.toString());
		System.out.println(studentOne.equals(studentTwo));
		System.out.println();
		
		studentTwo.setName("Julian");
		studentTwo.setTestOne(100);
		studentTwo.setTestTwo(95);
		System.out.println(studentOne.equals(studentTwo));
		
	}	
}	