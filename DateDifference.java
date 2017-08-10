package project_three;

/**
* @ Julian Itwaru
* @Ver 1.0
*/
/**This program will take two different Year statements and two different Month statements and calculate the difference in years and months. 
After which it will produce a numerical value for both Year difference and Month Difference. 
*/	
import java.util.Scanner;

public class DateDifference
{	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		// Initiate the variables
		int firstmonthNumber = 0;
		int secondmonthNumber = 0;
		int yearDifference = 0;
		int endMonth = 0;
		int firstyear = 0;
		int secondyear = 0;
		String firstmonth;
		String secondmonth;
		
		//Prompts the user to enter the year and months. Also catches variable 
		System.out.println("For the first date,");
		System.out.print("Enter month: ");
		firstmonth = keyboard.nextLine();
		System.out.print("Enter year: ");
		firstyear = keyboard.nextInt();
		System.out.println("");
		System.out.println("For the second date,");
		System.out.print("Enter Month: ");
		secondmonth = keyboard.next();
		System.out.print("Enter Year: ");
		secondyear = keyboard.nextInt();
		
		// If match is made, it will take the month and convert it to a int
		if (firstmonth.equalsIgnoreCase("January"))
		{
			firstmonthNumber = 1;
		}
		else if (firstmonth.equalsIgnoreCase("February"))
		{
			firstmonthNumber = 2;
		}
		else if (firstmonth.equalsIgnoreCase("March"))
		{
			firstmonthNumber = 3;
		}
		else if (firstmonth.equalsIgnoreCase("April"))
		{
			firstmonthNumber = 4;
		}
		else if (firstmonth.equalsIgnoreCase("May"))
		{
			firstmonthNumber = 5;
		}
		else if (firstmonth.equalsIgnoreCase("June"))
		{
			firstmonthNumber = 6;
		}
		else if (firstmonth.equalsIgnoreCase("July"))
		{
			firstmonthNumber = 7;
		}
		else if (firstmonth.equalsIgnoreCase("August"))
		{
			firstmonthNumber = 8;
		}
		else if (firstmonth.equalsIgnoreCase("September"))
		{
			firstmonthNumber = 9;
		}
		else if (firstmonth.equalsIgnoreCase("October"))
		{
			firstmonthNumber = 10;
		}
		else if (firstmonth.equalsIgnoreCase("November"))
		{
			firstmonthNumber = 11;
		}
		else if (firstmonth.equalsIgnoreCase("December"))
		{
			firstmonthNumber = 12;
		}
		
		
		if (secondmonth.equalsIgnoreCase("January"))
		{
			secondmonthNumber = 1;
		}	
		else if (secondmonth.equalsIgnoreCase("February"))
		{
			secondmonthNumber = 2;
		}
		else if (secondmonth.equalsIgnoreCase("March"))
		{
			secondmonthNumber = 3;
		}	
			else if  (secondmonth.equalsIgnoreCase("April"))
		{
			secondmonthNumber = 4;
		}	
			else if (secondmonth.equalsIgnoreCase("May"))
		{
			secondmonthNumber = 5;
		}	
			else if (secondmonth.equalsIgnoreCase("June"))
		{
			secondmonthNumber = 6;
		}	
			else if (secondmonth.equalsIgnoreCase("July"))
		{
			secondmonthNumber = 7;
		}	
			else if (secondmonth.equalsIgnoreCase("August"))
		{
			secondmonthNumber = 8;
		}
			else if (secondmonth.equalsIgnoreCase("September"))
		{
			secondmonthNumber = 9;
		}			
			else if (secondmonth.equalsIgnoreCase("October"))
		{
			secondmonthNumber = 10;
		}	
			else if (secondmonth.equalsIgnoreCase("November"))
		{
			secondmonthNumber = 11;
		}	
			else if (secondmonth.equalsIgnoreCase("December"))
		{
			secondmonthNumber = 12;
		}	
		
		// Will add 12 months if it is found true that the months are only 1 month apart. 		
		if (firstyear > secondyear)
		{
			yearDifference = firstyear - secondyear;
			endMonth = firstmonthNumber - secondmonthNumber;
			if ( endMonth < 0)
			{
				endMonth += 12;
				yearDifference --;
			}
		}
			
			else if (firstyear < secondyear)
			{
				yearDifference = secondyear - firstyear;
				endMonth = secondmonthNumber - firstmonthNumber;
				if ( endMonth < 0)
				{
					endMonth += 12;
					yearDifference --;
				}
			}
		
		System.out.println();
		System.out.println("These dates are " + yearDifference + " years and " + endMonth+ " months apart.");
	}
}	