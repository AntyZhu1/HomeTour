package game;

import fixtures.Room;

/* This class will be responsible for "loading" our rooms into memory. 
 * When game.Main is executed, it will invoke the init() method in this class that will instantiate all our Room objects,
 * link them together as exits, and designate a startingRoom.
 */

public class RoomManager {
	
	Room[] rooms = new Room[6];
	
	Room startingRoom;

	public void init() {
		
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"You find yourself in a small foyer, it's walls decorated with old paintings and photographs."
				+ "\n"
				+ "To your west is a door leading to the dining room."
				+ "\n"
				+ "To the north of you lies a doorway leading to the living room."
				+ "\n"
				+ "To your east lies a small solarium."
				+ "\n");
		
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
        		+ "A small door sits on the north side of the room, leading into the kitchen");
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
    		   "The Living Room",
	       		"a welcoming living room",
	       		"A warm, crackling fire burns brightly in the fireplace within this living room."
	       		+ "\n"
	       		+ "Several couches surround a small coffee table at the center of the room, almost beckoning you to take a seat."
	       		+ "\n"
	       		+ "Behind you, to your south, is the foyer."
    		   );
       
       this.rooms[3] = livingRoom;
       
       Room solarium = new Room(
    		   "The Solarium",
	       		"A pleasant solarium",
	       		"You find yourself in a solarium hanging off of the east side of the house. The large glass windows of the solarium allowing"
	       		+ "\n"
	       		+ "warm rays of sunshine into the room."
	       		+ "\n"
	       		+ "The room seems to be a quaint and relaxing place to sit and enjoy some time bathing in the sun's light."
	       		+ "\n"
	       		+ "Just to the east lies the exit to the garden"
	       		+ "\n"
	       		+ "Behind you, on the west of the room, is the foyer."
    		   );
       
       this.rooms[4] = solarium;
       
       Room garden = new Room(
    		   "The Garden",
	       		"a beautiful garden",
	       		"Before you stands a beautiful garden, well maintained and flourishing."
	       		+ "\n"
	       		+ "Flowers of many different types grow all around you, from roses to carnations."
	       		+ "\n"
	       		+ "The sweet, gentle fragrance of flowers is in the air all around you."
	       		+ "\n"
	       		+ "Behind you, to the west, is the door to the entrance to the Solarium."
    		   );
       
       this.rooms[5] = garden;
       
       Room upStairsHall = new Room(
    		   "The Upstairs Hallway",
	       		"a small hallway connecting a few rooms",
	       		"You arrive upstairs in a small hallway leading off into 3 rooms."
	       		+ "\n"
	       		+ "To the north is the master bedroom"
	       		+ "\n"
	       		+ "To the west is the guest bedroom"
	       		+ "\n"
	       		+ "To the east is a bathroom"
	       		+ "\n"
	       		+ "Behind you, down the stairs, is the foyer."
    		   );
       
       Room masterBed = new Room(
    		   "The Master Bedroom",
	       		"a well decorated bedroom with a large bed",
	       		"The master bedroom is well decorated and comfortable looking, a large king sized bed lies against the wall in front of you."
	       		+ "\n"
	       		+ "Behind you, to the south, is the upstairs hallway."
    		   );
       
       Room guestBed = new Room(
    		   "The Guest Bedroom",
	       		"a small, but comfortable, guest bedroom",
	       		"The guest bedroom is small, but still well furnished. A confortable looking bed lies against the wall and a small dresser rests against"
	       		+ "\n"
	       		+ "the opposite wall."
	       		+ "\n"
	       		+ "Behind you, to the east, is the upstairs hallway."
    		   );
       
       Room bathroom = new Room(
    		   "The Bathroom",
	       		"a clean bathroom",
	       		"The upstairs bathroom is clean and well kept. The smell of lavender emenates from a small candle atop the sink's countertop."
	       		+ "\n"
	       		+ "Behind you, to the west, is the upstairs hallway."
    		   );
       
       //Exit Assignments per room
       
       //foyer exits
       foyer.exits.put("east", diningRoom);
       foyer.exits.put("north", livingRoom);
       foyer.exits.put("west", solarium);
       foyer.exits.put("up", upStairsHall);
       
       //dining room exits
       diningRoom.exits.put("north", kitchen);
       
       //kitchen exits
       kitchen.exits.put("south", diningRoom);
       
       //living room exits
       livingRoom.exits.put("south", foyer);
       
       //solarium exits
       solarium.exits.put("west", foyer);
       solarium.exits.put("east", garden);
       
       //garden exits
       garden.exits.put("west", solarium);
       
       //upstairs hallway exits
       upStairsHall.exits.put("east", bathroom);
       upStairsHall.exits.put("north", masterBed);
       upStairsHall.exits.put("west", guestBed);
       upStairsHall.exits.put("down", foyer);
       
       //master bedroom exits
       masterBed.exits.put("south", upStairsHall);
       
       //guest bedroom exits
       guestBed.exits.put("east", upStairsHall);
       
       //bathroom exits
       bathroom.exits.put("west", upStairsHall);
	}

}
