package labs;

import java.util.Scanner;

public class PerformanceTask {
	
	//public variables for ease
	public static double launchVelocity;
	public static double launchAngle;
	
	public static double time = 0;
	
	public static double xPos;
	static double yPos;
	
	
	

	
	public static void main(String[] args) {
		
		//Scanner for user input
		Scanner inKey = new Scanner(System.in);
		
		
		System.out.println("What is the T-Shirt launcher's initial velocity? (m/s)");
		
		launchVelocity = inKey.nextDouble();
		//asks user what angle the tshirt launcher is in degrees 
		System.out.println("What is the T-Shirt launcher's launch angle? (degrees)");
		
		launchAngle = inKey.nextDouble();
		
		//Loop that displays the displacement every increment(seconds) 
		while (time < 100) {
			
			//Math for x and y positions
			xPos = Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
			yPos = Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
			
			//Makes it start at 0 height
			if(yPos < 0) {
				yPos = 0;
			}
			
			System.out.println("Time: " + time + "m");
			System.out.println("The X-Position is: " + xPos + "m");
			System.out.println("The Y-Position is: " + yPos + "m");
			
			
			//Stops loop if the t-shirt hits the ground
			if(yPos == 0 && time > 0){
				break;
			}
			
			//adds an increment to the counter
			time++;
		}
		
		
		
		
	}
	
	
	
	
	
}