package test;

import java.util.ArrayList;

public class dialog {
	
	Agent traveler1;
	Agent traveler2;
	ArrayList<ObjetTransportable> utilities;
	Backpack backpack;
	
	
	public void BackpackFilling() {
		
		Message.currentObject = null;
		Message.speaker = traveler1;
		Message.nonSpeaker = traveler2;
		Message.prP = null;
		
		while (this.backpack.isNotFull() && !(this.utilities.isEmpty()) ){
			
			Message.display();
			
		}
		
		if (utilities.size() == 0) {
			System.out.println("No more utilities");
		}
		else if (!(this.backpack.isNotFull())) {
			System.out.println("The backpack is full");
		}
		System.out.println(backpack);
	}

	public dialog(Agent traveler1, Agent traveler2, ArrayList<ObjetTransportable> utilities, Backpack backpack) {
		super();
		this.traveler1 = traveler1;
		this.traveler2 = traveler2;
		this.utilities = utilities;
		this.backpack = backpack;
	}
	
	
	
}
