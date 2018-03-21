package situation;

import java.util.ArrayList;

public class Traveler {
	
	String name;
	
	public Utility suggestUtility(ArrayList<Utility> utilities) {
		Utility u = utilities.get(utilities.size() - 1);
		utilities.remove(utilities.size() - 1);
		return u;
	}


	public Traveler(String name) {
		super();
		this.name = name;
	}
	
	public boolean evalUtility(Utility u) {
		return false;
	}
	
	
}
