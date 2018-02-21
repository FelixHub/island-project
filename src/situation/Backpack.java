package situation;

import java.util.ArrayList;

public class Backpack {
	
	int capacity;
	ArrayList<Utility> contents;
	
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
		this.contents = new ArrayList<Utility>();
	}
	
	public void add(Utility u) {
		contents.add(u);
	}

	@Override
	public String toString() {
		String s = " ";
		for(Utility u : contents) {
			s = s + u.name+ " and ";
		}
		return (s+" that's all.");
	}
	

}
