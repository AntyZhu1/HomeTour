
package game;

import java.util.Scanner;  // Import the Scanner class

import java.util.HashMap; // Import the HashMap class

import fixtures.Furniture;
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
		
		System.out.println("You are currently in " + player.currentRoom.getCurrentRoom() + ".");
		player.currentRoom.closelyExamineRoom();
		
	}

	/*
	 * The collectInput() method will use a Scanner object to collect console input from the user, and then will divide that input into multiple parts.
	 */
	private static String[] collectInput() {
		
		System.out.println("What would you like to do?"
				+ "\n");
		
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
		try {
			String command2 = command[1].toLowerCase();
//			System.out.println(command1);
//			System.out.println(command2);

			//Movement between Rooms
			if (command1.equals("go")) {
				
				//Cardnial directions and up/down
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
				
				else if (command2.equals("up")) {
					
					String roomCheck = "up";
					
					boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
					
					if (roomExists == true) {
						
						p.currentRoom = p.currentRoom.exits.get("up");
						System.out.println("You go upstairs towards " + p.currentRoom.getCurrentRoom());
						System.out.println("\n");
						p.currentRoom.closelyExamineRoom();
						
					}
					else {
						System.out.println("There are no stairs leading up here.");
					}
				}
				
				else if (command2.equals("down")) {
					
					String roomCheck = "down";
					
					boolean roomExists = p.currentRoom.exits.containsKey(roomCheck);
					
					if (roomExists == true) {
						
						p.currentRoom = p.currentRoom.exits.get("down");
						System.out.println("You go downstairs towards " + p.currentRoom.getCurrentRoom());
						System.out.println("\n");
						p.currentRoom.closelyExamineRoom();
						
					}
					else {
						System.out.println("There are no stairs leading down here.");
					}
				}
				else {
					System.out.println("Sorry, what was that?"
							+ "\n");
				}
				
			}
			
			//Examining furniture
			if (command1.equals("examine")) {
				
				/* Check if object in question is in the room
				 * print interaction
				 * leave loop
				 */
				try {
					Furniture examinedFurniture = p.currentRoom.furnitureInRoom.get(command2);
					System.out.println("You see " + examinedFurniture.getFurnitureName());
					System.out.println(examinedFurniture.getFurnitureDescription());
					System.out.println("");

				}
				catch (Exception examineException) {
					System.out.println("Sorry, I don't think that furniture exists here.");
				}
				
//				System.out.println("Furniture still a work in progress");
				
			}
			
			//interacting with furniture
			if (command1.equals("use")) {
				try {
					Furniture usedFurniture = p.currentRoom.furnitureInRoom.get(command2);
					System.out.println(usedFurniture.getFurnitureInteraction()
							+ "\n");
					
				}
				
				catch (Exception furnitureException) {
					System.out.println("I'm sorry, I don't think that furniture is here.");
				}
			}
			
			//checking room or exits
			if (command1.equals("check")) {
				

				
				if (command2.equals("room")){
					printRoom(p);
				}
				// All Exits
				else if (command2.equals("exits")) {
					
					boolean northExitExists = p.currentRoom.exits.containsKey("north");
					boolean southExitExists = p.currentRoom.exits.containsKey("south");
					boolean eastExitExists = p.currentRoom.exits.containsKey("east");
					boolean westExitExists = p.currentRoom.exits.containsKey("west");
					boolean upstairsExists = p.currentRoom.exits.containsKey("up");
					boolean downstairsExists = p.currentRoom.exits.containsKey("down");
					
					if (northExitExists == true) {
						
						System.out.print("To the north, you see "); 
						p.currentRoom.exits.get("north").examineRoom();
						
					}
					
					if (southExitExists == true) {
						
						System.out.print("To the south, you see "); 
						p.currentRoom.exits.get("south").examineRoom();					
					}
					
					if (eastExitExists == true) {
						
						System.out.print("To the east, you see "); 
						p.currentRoom.exits.get("east").examineRoom();					
					}
					if (westExitExists == true) {
						
						System.out.print("To the west, you see "); 
						p.currentRoom.exits.get("west").examineRoom();					
					}
					if (upstairsExists == true) {
						
						System.out.print("Upstairs, you see "); 
						p.currentRoom.exits.get("up").examineRoom();					
					}
					if (downstairsExists == true) {
						
						System.out.print("Downstairs, you see "); 
						p.currentRoom.exits.get("up").examineRoom();					
					}
						
				}
				
				// Specific Exits
				else if (command2.equals("north")) {
					boolean northExitExists = p.currentRoom.exits.containsKey("north");
					if (northExitExists == true) {
						System.out.print("To the north lies ");
						p.currentRoom.getExit("north").examineRoom();
					}
					else {
						System.out.println("There is no exit in that direction.");
					}
				}
				
				else if (command2.equals("south")) {
					boolean southExitExists = p.currentRoom.exits.containsKey("south");
					if (southExitExists == true) {
						System.out.print("To the south lies ");
						p.currentRoom.getExit("south").examineRoom();	
					}

				}
				
				else if (command2.equals("east")) {
					boolean eastExitExists = p.currentRoom.exits.containsKey("east");
					if (eastExitExists == true) {
						System.out.print("To the east lies ");
						p.currentRoom.getExit("east").examineRoom();
					}
					else {
						System.out.println("There is no exit in that direction.");
					}

				}
				
				else if (command2.equals("west")) {
					boolean westExitExists = p.currentRoom.exits.containsKey("west");
					if (westExitExists == true) {
						System.out.print("To the west lies ");
						p.currentRoom.getExit("west").examineRoom();
					}
					else {
						System.out.println("There is no exit in that direction.");
					}

				}
				
				else if (command2.equals("up")) {
					boolean upstairsExists = p.currentRoom.exits.containsKey("up");
					if (upstairsExists == true) {
						System.out.print("Upstairs is ");
						p.currentRoom.getExit("up").examineRoom();
					}
					else {
						System.out.println("There is no exit in that direction.");
					}

				}
				
				else if (command2.equals("down")) {
					boolean downstairsExists = p.currentRoom.exits.containsKey("down");
					if (downstairsExists == true) {
						System.out.print("Downstairs is ");
						p.currentRoom.getExit("down").examineRoom();
					}
					else {
						System.out.println("There is no exit in that direction.");
					}
					
				}
//				
				else {
					System.out.println("Sorry, what was that?"
							+ "\n");
				}

			}
			
			//getting help
			if (command1.equals("print")) {
				printHelp();
			}
			
			//exiting house
			if (command1.equals("leave")) {
				System.out.println("Leaving House");
				leaving = true;
//				System.out.println(leaving);
			}
			
//			Testing Code
//			System.out.println("End of Parse");
		}
		// Covering my bases, leave and help commands can be used with 1 word rather than 2.
		catch (Exception e) {
			
			if (command1.equals("leave")) {
				System.out.println("Leaving House");
				leaving = true;
//				System.out.println(leaving);
			}
			else if (command1.equals("help")) {
				printHelp();
			}
			else {
//				e.printStackTrace();
				System.out.println("Sorry, I didn't catch that. Did you have a second word in the command?"
						+ "\n");
			}


		}
		

	
	}
	
	private static void printHelp() {
		
		System.out.println(
				"1.)To navigate between rooms, enter 'go <direction>'. For example: 'go north'."
				+ "\n"
				+ "2.) To check a specific opject, enter 'examine <object>'. For example: 'examine chair'."
				+ "\n"
				+ "3.) To interact with an object, use 'use <object>. For example: 'use painting'. You can tell what furniture is usable by"
				+ "\n"
				+ "the asterisks around specific words. If the word has asterisks around it, for example: *chair*, you can interact with it."
				+ "\n"
				+ "4.) To check the room again, use 'check room'."
				+ "\n"
				+ "5.) To check exits again, use 'check exits'."
				+ "\n"
				+ "6.) To check a specific direction for an exit, use 'check <direction>'. For example: 'check north'."
				+ "\n"
				+ "7.) To exit the house, use 'leave house' or 'leave'."
				+ "\n"
				+ "8.) To see this message again, use 'print help' or 'help'."
				+ "\n");
		
	}
}
