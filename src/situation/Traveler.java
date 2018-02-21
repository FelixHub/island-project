package situation;

import java.util.ArrayList;

public class Traveler {
	
	String name;
	
	public Utility suggestUtility(ArrayList<Utility> utilities) {
		
		int rando = (int)(Math.random() * (utilities.size()));
		Utility u = utilities.get(rando);
		utilities.remove(rando);
		System.out.println(name+" : we should take the "+ u + ".");
		return u;
		
		
	}
	
	public boolean evalUtility(Utility u) {
		if (Math.random() < 0.5) {
			System.out.println(name+" : yes, good idea ! let's put the "+ u.name +" in the backpack.");
			return true;
		}
		else {
			System.out.println(name+" : no, it's a bad idea.");
			return false;
		}
	}

	public Traveler(String name) {
		super();
		this.name = name;
	}
	
	
}
