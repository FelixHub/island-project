package test;

import java.util.ArrayList;

public class Backpack {
	
	int capacity;
	ArrayList<ObjetTransportable> contents;
	
	public boolean isNotFull() {
		
		if (capacity == contents.size()) {
			return false;
		}
		else {
			return true;
		}
	}

	public Backpack(int capacity) {
		super();
		this.capacity = capacity;
		this.contents = new ArrayList<ObjetTransportable>();
	}
	
	public void add(ObjetTransportable u) {
		contents.add(u);
	}

	@Override
	public String toString() {
		String s = "Le sac contient les objets : ";
		
		for(ObjetTransportable u : contents) {
			if (u == null) {
				continue;
			}
			else{
				s = s + u.getName() + " and ";
			}
		}
		return (s+" et c'est tout.");
		
	}

	

}
