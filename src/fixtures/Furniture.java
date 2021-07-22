package fixtures;

public class Furniture extends Fixture{
	
	
	public Furniture(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	public String getFurnitureName() {
		
		return this.name;
	}
	
	public String getFurnitureDescription() {
		
		return this.shortDescription;
	}
	
	public String getFurnitureInteraction() {
		
		return this.longDescription;
	}
	
}
