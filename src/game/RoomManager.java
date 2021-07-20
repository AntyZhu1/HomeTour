package game;

import fixtures.Room;

/* This class will be responsible for "loading" our rooms into memory. 
 * When game.Main is executed, it will invoke the init() method in this class that will instantiate all our Room objects,
 * link them together as exits, and designate a startingRoom.
 */

public class RoomManager {
	
	int floor;
	Room[] rooms = new Room[6];
	Room[] floorTwoRooms = new Room[4];
	Room startingRoom;

	public void init() {
		
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"You find yourself in a small foyer, it's walls decorated with old paintings and photographs."
				+ "\n"
				+ "You see a set of stairs which lead to the second floor of the house."
				+ "\n"
				+ "To your west is a door leading to the dining room."
				+ "\n"
				+ "To the north of you lies a doorway leading to the living room."
				+ "\n"
				+ "To your east lies a small solarium."
				+ "\n"
				+ "Behind you, to your south, is the exit to the house.");
		
		this.rooms[0] = foyer;
        this.startingRoom  = foyer;
        
        
        Room diningRoom = new Room(
        		"The Dining Room",
        		"a quaint dining room",
        		"You enter the dining room. A small warmly lit room greets you, a round mahoganny table sitting in the center of the room."
        		+ "\n"
        		+ "Around the table sits several confortable looking chairs, each one with a red velvet cushion on the seat and back."
        		+ "\n"
        		+ "On the table, a collection of fine china sits. Alongside these plates and bowls are sets of beautiful silverware."
        		+ "\n"
        		+ "A small door sits on the other side of the room, leading into the kitchen");
        this.rooms[1] = diningRoom;
        
        Room kitchen = new Room(
        		"The Kitchen",
        		"a well stocked kitchen",
        		"Upon entering the kichen you find it to be quite simple, yet still very elegant in design."
        		+ "\n"
        		+ "Behind you, to your south, is the door to the dining room."
        		);
        
       this.rooms[2] = kitchen;
       
       Room livingRoom = new Room(
    		   
    		   );
       
       Room solarium = new Room(
    		   
    		   );
       
       Room upstairsFoyer = new Room(
    		   
    		   );
       
       Room masterBed = new Room(
    		   
    		   );
       
       Room guestBed = new Room(
    		   
    		   );
       
       Room bathroom = new Room(
    		   
    		   );
	}

}
