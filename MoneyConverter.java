package project_one;

import java.util.Scanner;
/** 
		*Project description:
		*Write an application that prompts for and reads a double value representing a monetary amount. Then determine the fewest number of each 
		*bill and coin needed to represent that amount, starting with the highest (assuming $10 bill is the maximum size needed)
		*Sample run: (Your sample runs must follow the exact format.)
		*Enter monetary amount: 47.63
		*That's equivalent to:
		*4 ten dollar bills
		*1 five dollar bills
		*2 one dollar bills
		*2 quarters
		*1 dimes
		*0 nickels
		*3 pennies
		*/

/** 
*@ JulianItwaru
*@ V 1.0
*/
public class MoneyConverter
{
		/** 
		* Prompts for and reads a double value representing a monetary amount. Then determine the fewest
     	 * number of each bill and coin needed to represent that amount, starting with the highest
    	 * (assuming $10 bill is the maximum size needed).
		*/
		public static void main(String[] args)
	{	

		double originalAmount;
		int remainBalance;
		int amountInPennies;
		int tenDollar;
		int fiveDollar;
		int oneDollar;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		Scanner scan = new Scanner(System.in);
		
		//Read a monetary amount entered via keyboard
		System.out.print(" Enter Monetary amount:");
		originalAmount = scan.nextDouble ();
		
		amountInPennies = (int)( originalAmount * 100);
		
		tenDollar =  amountInPennies / 1000;
		remainBalance = amountInPennies % 1000;
		//Divide the remaining amount by five dollar to determine the number of $5
		fiveDollar = remainBalance / 500;
		remainBalance =  remainBalance % 500;
		//Divide the remaining amount by one dollar to determine the number of $1
		oneDollar =  remainBalance / 100;
		remainBalance =  remainBalance % 100;
		//Divide remaining amount by one quarter to determine the number of $0.25
		quarters = 	remainBalance / 25;
		remainBalance = remainBalance % 25;
		//Divide the remaining amount by one dime to determine the number of $0.10
		dimes =  remainBalance / 10;
		remainBalance =  remainBalance % 10;
		//Divide the remaining amount by one nickel to determine the number of $0.05
		nickels = remainBalance / 5;
		remainBalance =  remainBalance % 5;
		//Divide the remaining amount by one penny to determine the number of $0.01
		pennies =  remainBalance / 1;
		remainBalance = remainBalance % 1;
		
		//Will show the calculations to their designated location.
		System.out.println(" That's Equilivant to: ");
		//Will show amount in tens
		System.out.println(tenDollar + " ten dollar bills");
		//Will show amount in fives
		System.out.println(fiveDollar + " five dollar bills");
		//Will show amount in ones
		System.out.println(oneDollar + " one dollar bills");
		//Will show amount in quarters
		System.out.println(quarters + " quarters");
		//Will show amount in dimes
		System.out.println(dimes + " dimes");
		//Will amount in nickles 
		System.out.println(nickels + " nickels");
		//Will show amount in pennies
		System.out.println(pennies + " pennies");
			
	}	
}