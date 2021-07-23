package game;

import fixtures.Room;

import fixtures.Furniture;

import java.util.ArrayList;

import java.util.HashMap;


/* This class will be responsible for "loading" our rooms into memory. 
 * When game.Main is executed, it will invoke the init() method in this class that will instantiate all our Room objects,
 * link them together as exits, and designate a startingRoom.
 */

public class RoomManager {
	
	Room[] rooms = new Room[6];
	
	Room startingRoom;

	public void init() {

		//Foyer Information
		
		Room foyer = new Room(
				"The Foyer",
				"a small foyer",
				"You find yourself in a small foyer, it's walls decorated with old paintings and photographs."
				+ "\n"
				+ "You see a *painting* of a family and an antique *vase*."
				+ "\n"
				+ "To your west is a door leading to the dining room."
				+ "\n"
				+ "To the north of you lies a doorway leading to the living room."
				+ "\n"
				+ "To your east lies a small solarium."
				+ "\n");
		
		this.rooms[0] = foyer;
        this.startingRoom  = foyer;
                
        Furniture familyPainting = new Furniture(
        		"A painting of a family",
        		"A nice painting depicting a small family, it looks rather old.",
        		"You look at the painting, and appreciate the brushwork."
        		+ "\n"
        		+ "You think about touching it, but we all know you shouldn't touch old art."
        		);
        
        foyer.furnitureInRoom.put("painting", familyPainting);
       
        Furniture foyerVase = new Furniture(
        		"An antique vase",
        		"An old porcelain vase sits atop a small stand in the foyer.",
        		"You look at the vase, examining its intricate design and floral patterns."
        		+ "\n"
        		+ "It's quite a nice vase, though you think it could use some flowers."
        		);
        foyer.furnitureInRoom.put("vase", foyerVase);


        //Dining Room Information
        Room diningRoom = new Room(
        		"The Dining Room",
        		"a quaint dining room",
        		"You enter the dining room. A small warmly lit room greets you, a round mahogany *table* sitting in the center of the room."
        		+ "\n"
        		+ "Around the table sits several confortable looking *chairs*, each one with a red velvet cushion on the seat and back."
        		+ "\n"
        		+ "On the table, a collection of fine china sits. Alongside these plates and bowls are sets of beautiful silverware."
        		+ "\n"
        		+ "A small door sits on the north side of the room, leading into the kitchen"
        		+ "\n"
        		+ "To the east lies the foyer.");
        this.rooms[1] = diningRoom;
        
        Furniture mahoganyTable = new Furniture(
        		"A mahogany table",
        		"A well crafted table sitting in the center of the room",
        		"You run your hand along the surface of the table. The wood is smooth and finished."
        		);
        
        diningRoom.furnitureInRoom.put("table", mahoganyTable);
        
        Furniture chairs = new Furniture(
        		"A Set of Chairs",
        		"4 Wooden chairs with velvet cushions sitting around the dining table.",
        		"You sit in each of the chairs, finding each of them to be very comfortable."
        		);
        
        diningRoom.furnitureInRoom.put("chairs", chairs);
        
        //Kitchen Information
        Room kitchen = new Room(
        		"The Kitchen",
        		"a well stocked kitchen",
        		"Upon entering the kichen you find it to be quite simple, yet still very elegant in design."
        		+ "\n"
        		+ "Behind you, to your south, is the door to the dining room."
        		);
        
       this.rooms[2] = kitchen;
       
       
       //Living Room Information
       Room livingRoom = new Room(
    		   "The Living Room",
	       		"a welcoming living room",
	       		"A warm, crackling fire burns brightly in the fireplace within this living room."
	       		+ "\n"
	       		+ "Several *couches* surround a small coffee table at the center of the room, almost beckoning you to take a seat."
	       		+ "\n"
	       		+ "Behind you, to your south, is the foyer."
    		   );
       
       this.rooms[3] = livingRoom;
       
       Furniture couches = new Furniture(
       		"A few couches",
       		"The living room couches, each one looks very comfortable. ",
       		"You go from couch to couch, sitting down or laying down if the couch allows it."
       		+ "\n"
       		+ "Each couch is very comfortable and soft, and you almost feel like falling asleep from time to time."
       		+ "\n"
       		+ "You eventually get up and move on."
       		);
       
       livingRoom.furnitureInRoom.put("couches", couches);
       
       //Solarium Information
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
       
       
       //Garden Information
       Room garden = new Room(
    		   "The Garden",
	       		"a beautiful garden",
	       		"Before you stands a beautiful garden, well maintained and flourishing."
	       		+ "\n"
	       		+ "*Flowers* of many different types grow all around you, from roses to carnations."
	       		+ "\n"
	       		+ "The sweet, gentle fragrance of flowers is in the air all around you."
	       		+ "\n"
	       		+ "Behind you, to the west, is the door to the entrance to the Solarium."
    		   );
       
       this.rooms[5] = garden;
       Furniture flowers = new Furniture(
          		"Many different kinds of flowers",
          		"Several different flowers, planted around the garden. ",
          		"You stop and smell the flowers. The aromas which surround you are pleasant and comforting."
          		+ "\n"
          		+ "It's almost a nostalgic feeling, a small garden with beautiful flowers."
          		+ "\n"
          		+ "You eventually get up and move on."
          		);
       
       garden.furnitureInRoom.put("flowers", flowers);
       
       //Upstairs Hallway Information
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
       
       
       //Master Bedroom Information
       Room masterBed = new Room(
    		   "The Master Bedroom",
	       		"a well decorated bedroom with a large *bed*",
	       		"The master bedroom is well decorated and comfortable looking, a large king sized bed lies against the wall in front of you."
	       		+ "\n"
	       		+ "Behind you, to the south, is the upstairs hallway."
    		   );
       
       Furniture bigBed = new Furniture(
    		   "A large King bed",
    		   "The master bed, with very comfortable looking pillows.",
    		   "Despite knowing it's a bit of a faux pas, you lie down on the bed anyways."
    		   + "\n"
    		   + "It's very comfortable, the pillows just the right firmness to be comfortable without feeling like"
    		   + "\n"
    		   + "you've set your head down on some bricks."
    		   + "\n"
    		   + "Though you are loathe to do it, you eventually get up and fix the bed a bit."
    		   );
       
       masterBed.furnitureInRoom.put("bed", bigBed);
       
       //Guest Bedroom Information
       Room guestBed = new Room(
    		   "The Guest Bedroom",
	       		"a small, but comfortable, guest bedroom",
	       		"The guest bedroom is small, but still well furnished. A confortable looking bed lies against the wall and a small dresser rests against"
	       		+ "\n"
	       		+ "the opposite wall."
	       		+ "\n"
	       		+ "Behind you, to the east, is the upstairs hallway."
    		   );
       Furniture smallBed = new Furniture(
    		   "A small but comfortable looking twin bed.",
    		   "The smaller bed reserved for guests staying over. While not a massive mattress, it's still very soft looking.",
    		   "You lay down in the guest bed. You are a guest after all."
    		   + "\n"
    		   + "It's a nice bed, the kind you'd enjoy a nice lazy weekend sleeping in on."
    		   + "\n"
    		   + "Though it pains you to leave now that you've gotten comfortable, you feel it's best that you be on your way."
    		   );
       
       guestBed.furnitureInRoom.put("bed", smallBed);
       
       //Bathroom Information
       Room bathroom = new Room(
    		   "The Bathroom",
	       		"a clean bathroom",
	       		"The upstairs bathroom is clean and well kept. The smell of lavender emenates from a small candle atop the sink's countertop."
	       		+ "\n"
	       		+ "There is a shower and a *toilet*, as to be expected from a bathroom."
	       		+ "Behind you, to the west, is the upstairs hallway."
    		   );
       
       Furniture toilet = new Furniture(
    		   "A toilet",
    		   "It's a toilet.",
    		   "You flush the toilet. You watch as the water goes down the drain."
    		   );
       
       bathroom.furnitureInRoom.put("toilet", toilet);
       
       masterBed.furnitureInRoom.put("bed", bigBed);
       
       //Exit Assignments per room
       
       //foyer exits
       foyer.exits.put("west", diningRoom);
       foyer.exits.put("north", livingRoom);
       foyer.exits.put("east", solarium);
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
