package main;

import java.util.*;
public class Player {

	
	
	public void direction() {
		
		
		String n = "north";
		String s = "south";
		String e = "east";
		String w = "west";
		
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type north, south, sast or west");
		System.out.println("");
		
		System.out.println("Enter Direction:");
		String player = scan.nextLine();
		
		
			
			if (player.equals("north")) {
				System.out.println("Walking North");
				
			}else if (player.equals("south")) {
				System.out.println("Walking south");
			}else if (player.equals("east")) {
				System.out.println("Walking East");
			}else if (player.equals("west")) {
				System.out.println("Walking west");
			}else {
				System.out.println("Walk somewhere");
			}
			
	
	
	}
	
}
