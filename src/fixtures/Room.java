package fixtures;

public class Room extends Fixture {
	/*
	 * Arbitrarily establish 4 exits (north, south, east, west)
	 * per room
	 */
	private Room[] exits = new Room[4];
	
	// If you want extra knick-knacks in your rooms...
	private Fixture[] items;

	public Room(String name, String shortDescription, String longDescription) {
		super();
	}
	
	public Room[] getExits() {
		return this.exits;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getShortDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShortDescription(String shortDescription) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLongDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLongDescription(String longDescription) {
		// TODO Auto-generated method stub
		
	}
}