package main;

import java.util.Scanner;

public class MagicCompass {

	double a;
	double b;
	double distance;
	double destination;
	double north;

	public double north() {
		return Math.hypot(a, b);

	}

	public double south() {
		return Math.hypot(a, b);

	}

	public double east() {
		return Math.hypot(a, b);
	}

	public double west() {
		return Math.hypot(a, b);
	}

	/*
	 * public double distanceTravel() { if (distance > destination) {
	 * System.out.println("dial reads " + destination); }else { destination -= 1;
	 * System.out.println("carry on"); } return destination;
	 * 
	 * }
	 */

	public double travel() {
		while (distance > destination) {
			if (distance == north) {
				destination -= 1;
			} else if (distance < destination) {
				System.out.println("Right Path");
				destination += 1;
			}
		}
		return destination;
	}

	public String compass() {

		Scanner in = new Scanner(System.in);

		while (destination == 0) {

			double totalDistance = 0;
		
			System.out.println("Enter number: ");
			distance = in.nextInt();
			System.out.println(" The Dial reads: " + distance + "m");

			
			
			if (distance >= 20) {
			
				System.out.println("north");
				
			} else if (distance >= 15) {
				
				System.out.println("north");
			} else if (distance >= 10) {
				
				System.out.println("south");
			} else if (distance >= 2) {
				
				System.out.println("south");
			} else if (distance < 2) {
				
				System.out.println("East");
				System.out.println("");
				System.out.println("You see a box sitting on the plain. It’s filled with treasure! You win! The end.");
				in.close();
			} 
			}
			
		

		return "End";

	}

}
