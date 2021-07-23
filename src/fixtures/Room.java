package fixtures;
/*
 * This class represents a room in the house. It will extend fixtures.Fixture, and so will inherit the descriptive properties.
 */
import java.util.HashMap;
public class Room extends Fixture {
	
	/*
	 * the rooms adjacent to this one. 
	 */
	
	public HashMap<String,Room> exits = new HashMap<>();
	
	public HashMap<String,Furniture> furnitureInRoom = new HashMap<>();
	
	public int flushedToiletCounter = 0;


	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}
	
	public String getCurrentRoom() {
		return this.name;
	}
	
	public void examineRoom() {
		System.out.println(this.shortDescription);
	}
	
	public void closelyExamineRoom() {
		System.out.println(this.longDescription);
	}
	
	//getter for all exits to a specific room
	public HashMap<String, Room> getExits() {
		
		return exits;
		
	}
	
	//getter for 1 exit in a room depending on the direction input
	public Room getExit(String direction) {
		
		return exits.get(direction);
	}
	
	public void incrementFlushes() {
		this.flushedToiletCounter++;
	}
	
	public void printToiletMessage() {
		System.out.println("Really? You've flushed the toilet 5 times now. Are you a plumber? Are you making ABSOLUTELY sure that the toilet's"
				+ "\n"
				+ "flush is working? Please, don't waste more water. Just move on.");
	}
	
	public void printToiletMessageBruh() {
		System.out.println("bruh");
	}
	
}
