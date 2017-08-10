package project_four;

/**
 * This program will perform simple 2 integer math problems. You will need to use a double value for the division to keep for less than 1 answers.
 *Run a do loop for infinite calculations. 
 * @Julian itwaru
 * @1.0
 */
import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String[] args)
	{
	
		Scanner keyboard = new Scanner(System.in);
		int choice;
		choice = 0;
		// all ints must be finalized as constants to keep proper convention
		final int ADDITION = 1;// a + b = c
		final int SUBTRACTION = 2;// a - b = c
		final int MULTIPLICATION = 3;// a * b = c
		final int DIVISION = 4;// (double)a / (double)b be sure to cast double values for this equation 
		final int EXIT = 5;//exit 
		int a = 0;//a will equal first integer
		int b = 0;//b will equal second integer
		double c;//c will equal answer in double.
		do{
				System.out.println("Choose from the Following");
				System.out.println(" 1.Add 2 integers\n 2.Subtract 2 integers\n 3.Multiply 2 integers\n 4.Divide 2 integers");
				System.out.println(" 5.Exit");
				System.out.print("Enter Choice ");
				choice = keyboard.nextInt();
				if (choice == ADDITION || choice == SUBTRACTION || choice ==MULTIPLICATION || choice == DIVISION)//Give a range of possible functions
					{//will initialized 
						System.out.println("Enter first integer");
						a = keyboard.nextInt();
						System.out.println("Enter Second Interger");
						b = keyboard.nextInt();
						switch(choice)
						{
					
							//the addition equation
						    case ADDITION:
						    	c = a + b;
						    	System.out.println(a+" + "+b+" = " +c);
					    	break;
							//the subtraction equation
							case SUBTRACTION:
							c = a - b;
							System.out.println(a+" - "+b+" = " +c);
							break;
							// the multiplication equation
							case MULTIPLICATION:
								c = a * b;
								System.out.println(a+" * "+b+" = " +c);
							break;
				
							case DIVISION:
								//cast double on a and b to create double values for proper division
								c = (double)a / (double)b;
								System.out.println(a+" / "+b+" = " +c);
							break;		
						}
					}	
			}while(choice != EXIT);//exit function
	}		
}		
	