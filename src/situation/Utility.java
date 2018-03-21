package situation;


public class Utility {
	
	String name;
	int getFood;
	int getHelp;
	int getSafe;
	int density;
	int durability;
	@Override
	public String toString() {
		return name;
	}

	
	public Utility(String name, int getFood, int getHelp, int getSafe, int density, int durability) {
		super();
		this.name = name;
		this.getFood = getFood;
		this.getHelp = getHelp;
		this.getSafe = getSafe;
		this.density = density;
		this.durability = durability;
	}
	
}
	
	