package buildcalc;

import java.util.Scanner;

public class CalcIfElse {

	public static void main(String[] args) {
		
			

			System.out.println("Please enter your number");
			
			Scanner input1 = new Scanner(System.in);
			int a = input1.nextInt();
			
			System.out.println("Please enter your number");
			Scanner input2 = new Scanner(System.in);
			
			int b =input2.nextInt(); 
			
			System.out.println("Choose ADD, SUB, MULTI, or DIV.");
			Scanner input3 = new Scanner(System.in);
			
			String operation = input3.nextLine();
			
			
			Operations mul = new Operations( ); 
			Operations div = new Operations();
			
			if (operation.equalsIgnoreCase("ADD")) {
				int result1=Operations.add(a, b);
				System.out.println("sum = " + result1);
			} 
			else if (operation.equalsIgnoreCase("SUB")) { 
				int result2=Operations.sub(a, b);
				System.out.println("difference = " + result2);
			} 
			else if (operation.equalsIgnoreCase("MULTI")) {
			    int result3= mul.multi(a, b);
				System.out.println("product = " + result3);
			} 
			else if (operation.equalsIgnoreCase("DIV")) {
	           double result4= div.div(a, b);
	           System.out.println("Quotient = " + result4);
			}
			else { 
				System.out.println(" Please choose one of the four operations listed.");
			
			
			}
			input1.close();
			input2.close();
			input3.close();
			
		}

	}


