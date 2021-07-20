
package game;

import java.util.Scanner;  // Import the Scanner class

import fixtures.Room;

/*
 * This class will store the main(String[]) method for our game (and of course, it will be the only class that has a main(String[]) method).
 * This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input 
 */


public class Main {

	public static void main(String[] args) {
		
		
	}
	
	private static void printRoom(Player player) {
		System.out.println("You are currently in the " + player.currentRoom + ".");
	}

	/*
	 * The collectInput() method will use a Scanner object to collect console input from the user, and then will divide that input into multiple parts.
	 */
	private static String[] collectInput() {
		String[] inputCollection = new String[];
		Scanner userIn = new Scanner(System.in);
		String input = userIn.nextLine();
		
	}
		
	/*
	 * The parse(String[], Player) method will take the output of the above collectInput() method and a player object, and will resolve that command. 
	 */
	private static void parse(String[] command, Player player) {
		
	}
	
}
