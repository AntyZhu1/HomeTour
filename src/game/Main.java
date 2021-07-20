
package game;

import java.util.Scanner;  // Import the Scanner class

import fixtures.Room;

/*
 * This class will store the main(String[]) method for our game (and of course, it will be the only class that has a main(String[]) method).
 * This is where the game-loop will go, where we'll display a prompt, collect input, and parse that input 
 */


public class Main {
	
	static boolean leaving = false;
	static Player p = new Player();
	
	public static void main(String[] args) {
		
		// Print introduction
		
		System.out.println("Welcome to this humble home, please take a look around. Just be careful not to make a mess of the place."
				+ "\n");
		
		// Print navigation instructions + help instructions
		printHelp();
		
//		System.out.println(leaving);
		
		
		
		RoomManager rm = new RoomManager();
		
		rm.init();
		
		p.setRoom(rm.startingRoom);
		
		rm.startingRoom.closelyExamineRoom();
		
		while (leaving == false) {
		parse(collectInput(), p);
		}
		
	}
	
	private static void printRoom(Player player) {
		System.out.println("You are currently in the " + player.currentRoom + ".");
	}

	/*
	 * The collectInput() method will use a Scanner object to collect console input from the user, and then will divide that input into multiple parts.
	 */
	private static String[] collectInput() {
		
		System.out.println("What would you like to do?");
		
		Scanner userIn = new Scanner(System.in);
		String input = userIn.nextLine();
		
		String[] collectedInputs = input.split(" ");
		return collectedInputs;
	}
		
	/*
	 * The parse(String[], Player) method will take the output of the above collectInput() method and a player object, and will resolve that command. 
	 */
	private static void parse(String[] command, Player player) {
		String command1 = command[0].toLowerCase();
		String command2 = command[1].toLowerCase();
		
//		System.out.println(command1);
//		System.out.println(command2);
		
		if (command1.equals("go")) {
			
			if (command2.equals("north")) {
				String roomCheck = "north";
				
				boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
				
				if (roomExists == true) {
					
					p.currentRoom = p.currentRoom.exits.get("north");
					System.out.println("You head north towards " + p.currentRoom.getCurrentRoom());
					System.out.println("\n");
					p.currentRoom.closelyExamineRoom();
					
				}
				else {
					System.out.println("There is no room to the north.");
				}
					
			}
			
			else if (command2.equals("south")) {
				String roomCheck = "south";
				
				boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
				
				if (roomExists == true) {
					
					p.currentRoom = p.currentRoom.exits.get("south");
					System.out.println("You head south towards " + p.currentRoom.getCurrentRoom());
					System.out.println("\n");
					p.currentRoom.closelyExamineRoom();
					
				}
				else {
					System.out.println("There is no room to the south.");
				}
				
			}
			
			else if (command2.equals("east")) {
				
				String roomCheck = "east";
				
				boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
				
				if (roomExists == true) {
					
					p.currentRoom = p.currentRoom.exits.get("east");
					System.out.println("You head east towards " + p.currentRoom.getCurrentRoom());
					System.out.println("\n");
					p.currentRoom.closelyExamineRoom();
					
				}
				else {
					System.out.println("There is no room to the east.");
				}
			}

			else if (command2.equals("west")) {
				
				String roomCheck = "west";
				
				boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
				
				if (roomExists == true) {
					
					p.currentRoom = p.currentRoom.exits.get("west");
					System.out.println("You head west towards " + p.currentRoom.getCurrentRoom());
					System.out.println("\n");
					p.currentRoom.closelyExamineRoom();
					
				}
				else {
					System.out.println("There is no room to the west.");
				}
			}
			
		}
		
		if (command1.equals("examine")) {
			
			/* Check if object in question is in the room
			 * print interaction
			 * leave loop
			 */
			
			System.out.println("Examine");
			
		}
		
		if (command1.equals("check")) {
			
			System.out.println("check");
		}
		
		if (command1.equals("print")) {
			printHelp();
		}
		
		if (command1.equals("leave")) {
			System.out.println("Leaving House");
			leaving = true;
			System.out.println(leaving);
		}
		
//		Testing Code
		System.out.println("End of Parse");
	
	}
	
	private static void printHelp() {
		
		System.out.println(
				"To navigate between rooms, enter 'go <direction>'. For example: 'go north'."
				+ "\n"
				+ "To Interact with an object, enter 'examine <object>'. For example: 'examine chair'."
				+ "\n"
				+ "To check the room again, use 'check room'."
				+ "\n"
				+ "To check exits again, use 'check exits'."
				+ "\n"
				+ "To check a specific direction for an exit, use 'check <direction>'. For example: 'check north'."
				+ "\n"
				+ "To exit the house, use 'leave house'."
				+ "\n"
				+ "To see this message again, use 'print help'."
				+ "\n");
		
	}
}
