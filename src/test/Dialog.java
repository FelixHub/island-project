package test;

import java.util.ArrayList;

public class Dialog {
	
	public static final int NB_TOURS = 10;
	
	
	Agent[] travelers;
	ArrayList<ObjetTransportable> utilities;
	Backpack backpack;
	
	public Dialog(Agent traveler1, Agent traveler2, ArrayList<ObjetTransportable> utilities, Backpack backpack) {
		this.travelers[0] = traveler1;
		this.travelers[1] = traveler2;
		this.utilities = utilities;
		this.backpack = backpack;
	}
	
	public void BackpackFilling() {
		int current_speaker = 0;
		//while (à décider)
		for(int i=0;i<NB_TOURS;i++) {
			Message[] lmes = travelers[current_speaker].parler();
			afficher(lmes);
		}
		
	}
		
//		Message.currentObject = null;
//		Message.speaker = traveler1;
//		Message.nonSpeaker = traveler2;
//		Message.prP = null;
//		
//		while (this.backpack.isNotFull() && !(this.utilities.isEmpty()) ){
//			
//			Message.display();
//			
//		}
//		
//		if (utilities.size() == 0) {
//			System.out.println("No more utilities");
//		}
//		else if (!(this.backpack.isNotFull())) {
//			System.out.println("The backpack is full");
//		}
//		System.out.println(backpack);
//	}
//
	
	public static void main(String [] args) {
		d = new Dialog(...);
		d.BackpackFilling();
	}
	
}
