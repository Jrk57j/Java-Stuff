package project_two;
/**
*This program will Take a users name and format it. It will then create a customer ID that append  a two digit number to it. 
*Then it will take the input create an area an perform a mathematical process that will produce a final cost, a tax amount and the cost of material. 
*@Julian Itwaru
*@Version 1.0
*/
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class CarpetBill
{
	public static void main(String[] args)
	{
		Scanner Keyboard = new Scanner(System.in);
		Random generator = new Random();
		DecimalFormat QuantityFormat = new DecimalFormat("000");//Length, Width and Area format
		DecimalFormat CarpetCostFormat = new DecimalFormat("00.00");//format cost amount
		DecimalFormat TaxFormat = new DecimalFormat("0.00%");//format the 0.0000 sales tax to final format
		DecimalFormat CarpetFormat = new DecimalFormat("$0000.00");//format for carpet cost and final amount
		DecimalFormat CarpTaxFormat = new DecimalFormat("0000.00");//format for tax amount
			
		
		String FirstN,LastN,Fname,Fnam2,FIRSTNAME,Lname,Lnam2,Lnam3,LastName,LASTNAME,FinalN;//Strings for Customer
		String formattedlenght,formattedwidth,Taxes,formattedCarpetCost,formattedCarpCharges;//Strings for Carpet Cost, Finding Area, and Final Amounts
		String formattedCarpTax,formattedArea,formattedFinalAmountOutput;//Strings for Carpet Cost, Finding Area, and Final Amounts
		
		
		final double SALES_TAXES = 0.0850;
		final double FinalCarp;
		final double FinalTaxes;
		double FinalAmountOutput;
		double CarpetCost;
		double CarpetFormt;
		double CarpCharges;
		double TaxCharges;
		int Lenght;
		int Width;
		int Area;
		int num1;
		
		//First set of user inputs and First set of string instances and int instances
		System.out.print("Enter your first name: ");
		FirstN = Keyboard.nextLine();
		System.out.print("Enter your last name:" );
		LastN = Keyboard.nextLine();
		System.out.print("Enter length of room(feet): ");
		Lenght = Keyboard.nextInt();
		System.out.print("Enter width of room(feet): ");
		Width = Keyboard.nextInt();
		System.out.print("Enter cost per square foot: ");
		CarpetCost = Keyboard.nextDouble();
		
		//This section will format the Name to Show proper output
		Fname = FirstN.substring(0,1).toUpperCase();
		Fnam2 = FirstN.substring(1).toLowerCase();
		FIRSTNAME = Fname+Fnam2;
		Lname = LastN.substring(0,1).toUpperCase();
		Lnam2 = LastN.substring(1).toLowerCase();
		LastName = Lname + Lnam2;
		Lnam3 = LastN.substring(1,5).toLowerCase();
		LASTNAME = Lname + Lnam3;
		
		
		//This Section is to format the ID name with a two digit number trail
		num1 = generator.nextInt(89) + 10;//Allows for a number to generate from 10-99
		FinalN = Fname + LASTNAME + num1;
		
		
		
		//This section will Format and do math processes
		// Will format the length, width and area into a triple digit leading with 0 if less than 100.
		formattedlenght = QuantityFormat.format(Lenght);
		formattedwidth = QuantityFormat.format(Width);
		//Will multiple the Length and Width to find area.
		Area = (Lenght * Width);
		formattedArea = QuantityFormat.format(Area);
		//Finds the cost of carpet charges.
		CarpCharges = Area * CarpetCost;
		formattedCarpetCost = CarpetCostFormat.format(CarpetCost);
		//Format taxes quantity to show. Taxes are originally 0.0850 will convert to 8.50%
		Taxes = TaxFormat.format(SALES_TAXES);
		//Creates final carpet charges and formats it to a 0000.00
		FinalCarp = CarpCharges;
		formattedCarpCharges = CarpetFormat.format(CarpCharges);
		//Uses a mathematical formula to find the tax amount for the material
		FinalTaxes = CarpCharges * SALES_TAXES;
		formattedCarpTax = CarpTaxFormat.format(FinalTaxes);
		//Produces a final amount including taxes and material charge holding the $0000.00 format
		FinalAmountOutput = CarpCharges+FinalTaxes;
		formattedFinalAmountOutput = CarpetFormat.format(FinalAmountOutput);
		
	


		// Will show all outputs in a formatted style
		System.out.println("CUSTOMER");
		System.out.println("Last Name\t\t"+LastName);
		System.out.println("First Name\t"+FIRSTNAME);
		System.out.println("ID\t\t\t"+FinalN);
		System.out.println();
		System.out.println();
		System.out.println("MEASUREMENT");
		System.out.println("Lenght\t"+formattedlenght);
		System.out.println("Width\t"+formattedwidth);
		System.out.println("Area\t\t"+formattedArea);
		System.out.println();
		System.out.println("CHARGES");
		System.out.println("Description\t\tCost/Sq.Ft.\t\tCharges");
		System.out.println("-----------		----------		--------");
		System.out.println("Carpet\t\t"+"\t"+formattedCarpetCost+"\t\t\t"+formattedCarpCharges);
		System.out.println("Tax\t\t\t\t "+Taxes+"\t\t\t "+formattedCarpTax);
		System.out.println("\t\t\t\t\t\t\t\t--------");
		System.out.println("Total\t\t\t\t\t\t\t"+formattedFinalAmountOutput);
	}
}	