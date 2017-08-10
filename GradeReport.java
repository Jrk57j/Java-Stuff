package project_five;

/**
 *	Write a program to store and process 2 test scores for a class of 4 students. Your program will prompt for the test scores as shown in the sample run (note the numbering in the prompts). After all the data is entered, your program will display the scores for test 1, test 2, the average and the letter grade for each student in a tabular format.
 *
 *	The average is converted to a letter grade using the following table:
 *	Average ( 100 at maximum)
 *	> 90	A
 *	> 80	B
 *	> 70	C
 *	less	F
 
 *  You must use 2 arrays of integers to store the 2 test scores for each student. You must use a third array to store the average and a fourth array to store the letter grade. You must print the test scores using 3 digits, and the average with 3 digits before the decimal point and 1 decimal place.
 *	Your sample runs must follow the exact format.

 *	Sample Run:
 *	For test 1,
 *	Enter score 1: 90
 *	Enter score 2: 80
 *	Enter score 3: 70
 *	Enter score 4: 60
 *	For test 2,
 *	Enter score 1: 90
 *	Enter score 2: 80
 *	Enter score 3: 70
 *	Enter score 4: 60

 *	Test 1 Test 2 Average Grade
 *	------ ------ ------- -----
 *	090 	090		090.0	A
 *	082 	080 	080.0 	B
 *	070 	070 	070.0 	C
 *	060 	060 	060.0 	F
 * 
 * @Julian Itwaru
 * @version 1.0
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class GradeReport
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formattedGrade = new DecimalFormat("000");
		DecimalFormat formattedAverage = new DecimalFormat("000.0");
		int[] test1 = new int[4];
		int[] test2 = new int[4];
		double[] testAverage = new double[4];
		char[] letterGrade = new char[4];
		

		//Will accept the values for the first test and store them
		System.out.println("For test 1,");
		for ( int i = 0; i< test1.length; i++)
		{
			System.out.print("Enter score " + (i + 1)+(":"));
			test1[i] = keyboard.nextInt();
		}	
		
		System.out.println();
		//Will accept the values for the second test and store them
		System.out.println("For test 2,");
		for ( int i = 0; i < test2.length; i++)
		{
			System.out.print("Enter score " + (i + 1)+(":"));
			test2[i] = keyboard.nextInt();
		}	
		//calculates the average to a double out put. Used a cast to change the int to doubles
		for(int i = 0; i < testAverage.length; i ++)
		{
			testAverage[i] = ((double)test1[i] + test2[i]) / 2;
		}	
		//compares an in value to another int value and changes the int to a char corresponding the letter grade
		for(int i = 0; i < letterGrade.length; i++)
		{
			if (testAverage[i] >= 90)
			{
				letterGrade[i] = 'A';
			}
			else if (testAverage[i] >= 80)
			{
				letterGrade[i] = 'B';
			}
			else if (testAverage[i] >= 70)
			{
				letterGrade[i] = 'C';
			}
			else
			{
				letterGrade[i] = 'F';
			}
		}
		//Lays out the format for the column. 
		System.out.println("Test 1" + "\t\t" + "Test 2" + "\t\t" + "Average" + "\t\t" + "Grade");
		System.out.println("------" + "\t\t" + "------" + "\t\t" + "-------" + "\t\t" + "-----");
		for (int i = 0; i < test1.length; i++)
		{
			System.out.println(formattedGrade.format( test1[i]) + "\t\t\t" + 
							formattedGrade.format(test2[i]) + "\t\t\t" + 
							formattedAverage.format(testAverage[i]) + 
							 "\t\t" + letterGrade[i]);
		}
		/*the above.
		  must assign the format with array operator or it will not take and you'll run into a series of errors.
		  the format must also align with each part breaking the phrases allows for easier placement
		 */	
	}
}	