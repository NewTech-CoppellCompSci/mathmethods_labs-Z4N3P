package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a Posotive Integer: ");
		int userNum = inKey.nextInt();
		System.out.print("Enter another Posotive Integer: ");
		int userNum2 = inKey.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int x1 = userNum;
		int x2 = userNum2;
		max = Math.max(max, x1);	
		max = Math.max(max, x2);
		min = Math.min(min, x1);	
		min = Math.min(min, x2);
		int random = max-min+1;
		int random2 = min;
		for (int i = 0; i<10; i++) {
			int computer = (int) (Math.random() * random + random2);
			System.out.print(computer + " ");
		}
		System.out.println("");
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter Cylinder Radius: ");
		int rad = inKey.nextInt();
		System.out.print("Enter a Cylinder Height: ");
		int height = inKey.nextInt();
		System.out.println(Math.pow(rad, 2) * height *  Math.PI);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("X1: ");
		double x1 = inKey.nextDouble();
		System.out.print("Y1: ");
		double y1 = inKey.nextDouble();
		System.out.print("X2: ");
		double x2 = inKey.nextDouble();
		System.out.print("Y2: ");
		double y2 = inKey.nextDouble();
		System.out.println(Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)));
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter A-Value: ");
		double A = inKey.nextDouble();
		System.out.print("Enter B-Value: ");
		double B = inKey.nextDouble();
		System.out.print("Enter C-Value: ");
		double C = inKey.nextDouble();
		System.out.println("X1 Value = " + ((-1 * B + Math.sqrt(Math.pow(B, 2)-4*A*C)) / (2*A) ));
		System.out.println("X2 Value = " + ((-1 * B - Math.sqrt(Math.pow(B, 2)-4*A*C)) / (2*A) ));
		
	}
	
	

	
}