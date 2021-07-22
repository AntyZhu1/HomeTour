package fixtures;

public abstract class Fixture {
	

	//a short name / title for the fixture
	String name;
	
	// a one-sentence-long description of a fixture, used to briefly mention the fixture
	String shortDescription;
	
	//a paragraph-long description of the thing, displayed when the player investigates the fixture
	String longDescription;
	
	public Fixture(String name2, String shortDescription2, String longDescription2) {
		this.name = name2;
		this.shortDescription = shortDescription2;
		this.longDescription = longDescription2;
	}
	
}
