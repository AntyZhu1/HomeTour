package fixtures;
/*
 * This class represents a room in the house. It will extend fixtures.Fixture, and so will inherit the descriptive properties.
 */

public class Room extends Fixture {
	
	/*
	 * the rooms adjacent to this one. 
	 */
	Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	String examineRoom() {
		return this.shortDescription;
	}
	
	String closelyExamineRoom() {
		return this.longDescription;
	}
	
	public Room[] getExits() {
		
	}
	
	public Room[] getExit(String direction) {
		
	}
	
}
