package main;

import java.util.*;

public class App {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		MagicCompass compass = new MagicCompass();
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("Grey foggy clouds float oppressively close to you, \r\n" + 
				"reflected in the murky grey water which reaches up your shins.\r\n" + 
				"Some black plants barely poke out of the shallow water.\r\n" + 
				"Try \"north\", \"south\", \"east\", or \"west\"\r\n" + 
				"You notice a small watch-like device in your left hand.  \r\n" + 
				"It has hands like a watch, but the hands don't seem to tell time. \r\n" + 
				"");
		
	    //.out.println("Enter Number : ");
		//String input = scan.nextLine();
	    
		//System.out.println("The dial reads " + input);
	
		player1.direction();
		
		compass.compass();
	

	}

}
