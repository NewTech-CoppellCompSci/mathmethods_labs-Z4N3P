package labs;
import java.util.Scanner;


public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	
	public static void problem01() {
		
		//Creates a new scanner
		Scanner inKey = new Scanner(System.in);
				
		//Asks user to enter positive number
		System.out.print("Enter a positive integer here: ");
		int userNum1 = inKey.nextInt();
		System.out.print("Enter one more integer here: ");
		int userNum2 = inKey.nextInt();
		//creates a result based in the max and min numbers 
		double powResult = Math.pow(userNum1, userNum2);
		
		System.out.println(userNum1 + "^" + userNum2 + " = " + powResult + "/n");
	} 
	
	

	public static void problem02() {
		
		// creating a new scanner for user to input
		Scanner inKey2 = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		double userNum = inKey2.nextDouble();
		double sqrtOfNum = Math.sqrt(userNum);
		System.out.println("The square root of " + userNum + " is " +sqrtOfNum + "./n");
		
		
	}

	public static void problem03() {
		//creates new scanner for user input
		Scanner inKey3 = new Scanner(System.in);
		//asks user to input side length A
		System.out.print("Length of side A: ");
		double sideA = inKey3.nextDouble();
		//asks user to input side length B
		System.out.print("Length of side B: ");
		double sideB = inKey3.nextDouble();
		double hypotenuse = Math.sqrt((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)));
		System.out.println("Hypotenuse = " + hypotenuse + "\n");
		

	}


	
	
	public static void problem04() {
		Scanner inKey4 = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//Creates storage for user inputs (creates variable) 
		int userNum = 1;
		boolean not0 = true;
		while(not0) {
			System.out.print("Enter a integer: ");
			userNum = inKey4.nextInt();
			if (userNum == 0) {
				not0 = false;
			}
			//checks for min and max within the numbers 
			max = Math.max(max, userNum);
			min = Math.min(min, userNum);
		}
		
			System.out.print("Max = " + max);
			System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
