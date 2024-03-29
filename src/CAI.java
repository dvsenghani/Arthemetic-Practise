/********************************************************************************************************* 
 * Program Name: Part1.java 
 * Description : Arithmetic problems to study                                           
 * Programmer  : Dhiraj Senghani	                                                                           
 * Date        : 10/23/2018            
**********************************************************************************************************/
import java.util.Random; 
import java.util.Scanner; 
public class CAI 
{ 
	
	
	
	public static void CAI() 
	{ 
		int num1 = 0; 
		int num2 = 0; 
		int answer = 0; 
		int option = 0;
		
		Random r = new Random(); 
		Scanner in = new Scanner(System.in); 
		num1 = r.nextInt(10); 
		num2 = r.nextInt(10)+1; 

		//user to select type of arithmetic problem
		System.out.println("Select one Arthimetic Problems Option No: ");
		System.out.println("" );
		System.out.println("Option 1 :  Addition ");
		System.out.println("Option 2 :  Subtraction");
		System.out.println("Option 3 :  Multiplication");
		System.out.println("Option 4 :  Division" );
		System.out.println("Option 5 :  Random" );
		System.out.println("" );
		option = in.nextInt();
		System.out.println("" );
		

	
	
		// if user select option 1
		if (option == 1)
		{
			System.out.println("Addition Problems only");
			System.out.print(num1 + " plus " + num2 + " =  "); 
			answer = in.nextInt();	
				
		if (answer == (num1+num2)) 
		{ 
			System.out.println("Good job! You got it right!"); 
			CAI(); 
			System.out.println("" );
		} 
		else 
		{ 
			while (answer != (num1+num2)) 
			{ 
				System.out.println("You got it wrong, try again!"); 
				System.out.print(num1 + " plus " + num2 + " =  "); 
				answer = in.nextInt();
				
			} 
			CAI (); 
		} 
		}
		
		if (option == 2)
		{
			System.out.println("Subtraction Problems only");
			System.out.print(num1 + " Minus " + num2 + " =  "); 
			answer = in.nextInt(); 

		if (answer == (num1-num2)) 
		{ 
			System.out.println("Good job! You got it right!"); 
			CAI(); 
			
			System.out.println("" );
		} 
		else 
		{ 
			while (answer != (num1-num2)) 
			{ 
				System.out.println("You got it wrong, try again!"); 
				System.out.print(num1 + " Minus " + num2 + " =  "); 
				answer = in.nextInt(); 
			} 
			CAI(); 
		}
		}
		
		// if user selects option 2
		
		if (option == 3)
		{
			System.out.println("Multiplication Problems only");
			System.out.print(num1 + " Times " + num2 + " =  "); 
			answer = in.nextInt(); 

		if (answer == (num1*num2)) 
		{ 
			System.out.println("Good job! You got it right!"); 
			System.out.println("" );
			CAI(); 
			
			System.out.println("" );
		} 
		else 
		{ 
			while (answer != (num1*num2)) 
			{ 
				System.out.println("You got it wrong, try again!"); 
				System.out.print(num1 + " Times " + num2 + " =  ");
				answer = in.nextInt(); 
			} 
			CAI(); 
		} 
		
		
		
		}
		
		if (option == 4)
		{
			System.out.println("Division Problems only");
			System.out.print(num1 + " divide " + num2 + " =  "); 
			answer = in.nextInt(); 

		if (answer == (num1/num2)) 
		{ 
			System.out.println("Good job! You got it right!"); 
			CAI(); 
			
			System.out.println("" );
		} 
		else 
		{ 
			while (answer != (num1/num2)) 
			{ 
				System.out.println("You got it wrong, try again!"); 
				System.out.print(num1 + " divide " + num2 + " =  ");
				answer = in.nextInt(); 
			} 
			CAI(); 
		} 
		}
		
		if (option == 5)
		{
			System.out.println("Random Problems");
			System.out.print(num1 + " Plus " + num2 + " =  "); 
			answer = in.nextInt(); 

		if (answer == (num1+num2)) 
		{ 
			System.out.println("Good job! You got it right!"); 
			CAI(); 
			
			System.out.println("" );
		} 
		else 
		{ 
			while (answer != (num1+num2)) 
			{ 
				System.out.println("You got it wrong, try again!"); 
				System.out.print(num1 + " divide " + num2 + " =  ");
				answer = in.nextInt(); 
			} 
			CAI(); 
		} 
		}
		
		
		}

		
	public static void main(String[] args) 
	{ 
		CAI(); 
	} 
}                       