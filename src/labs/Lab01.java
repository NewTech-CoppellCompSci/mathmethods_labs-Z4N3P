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
		
		//creating a new scanner
		Scanner inKey = new Scanner(System.in);
				
		//asking for positive integers to user
		System.out.print("Enter a positive integer here: ");
		int userNum1 = inKey.nextInt();
		System.out.print("Enter one more integer here: ");
		int userNum2 = inKey.nextInt();
		
		double powResult = Math.pow(userNum1, userNum2);
		
		System.out.println(userNum1 + "^" + userNum2 + " = " + powResult + "/n");
	} 
	
	
	
	
	public static void problem02() {
		
		// creating a new scanner to get input from user
		Scanner inKey2 = new Scanner (System.in);
		
		System.out.print("Enter a positive integer: ");
		double userNum = inKey2.nextDouble();
		double sqrtOfNum = Math.sqrt(userNum);
		System.out.println("The square root of " + userNum + " is " +sqrtOfNum + "./n");
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey3 = new Scanner(System.in);
		System.out.print("Length of side A: ");
		double sideA = inKey3.nextDouble();
		System.out.print("Length of side B: ");
		double sideB = inKey3.nextDouble();
		double hypotenuse = Math.sqrt((Math.pow(sideA, 2)) + (Math.pow(sideB, 2)));
		System.out.println("Hypotenuse = " + hypotenuse + "\n");
		

	}


	
	
	public static void problem04() {
		Scanner inKey4 = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		//variable to store number user inputs 
		int userNum = 1;
		boolean not0 = true;
		while(not0) {
			System.out.print("Enter a integer: ");
			userNum = inKey4.nextInt();
			if (userNum == 0) {
				not0 = false;
			}
			
			max = Math.max(max, userNum);
			min = Math.min(min, userNum);
		}
		
			System.out.print("Max = " + max);
			System.out.println("Min = " + min);
		
		
	}
	
	
	
	
	
	
}
