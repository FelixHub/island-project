package test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class Dialog {
	
	public static final int NB_TOURS = 10;
	
	
	Agent[] travelers;
	ArrayList<ObjetTransportable> utilities;
	Backpack backpack;
	
	public Dialog(Agent traveler1, Agent traveler2, ArrayList<ObjetTransportable> utilities, Backpack backpack) {
		this.travelers = new Agent[2];
		this.travelers[0] = traveler1;
		this.travelers[1] = traveler2;
		this.utilities = utilities;
		this.backpack = backpack;
	}
	
	public void BackpackFilling() {
		int current_speaker = 0;
		//while (à décider)
		for(int i=0;i<NB_TOURS;i++) {
			ObjetTransportable objet = utilities.get((new Random()).nextInt(utilities.size()));
			Message[] lmes = travelers[current_speaker].parler(objet);
			current_speaker = (current_speaker+1)%2;
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
	
	private void afficher(Message[] lmes) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String [] args) {
		Dialog d = new Dialog(new Agent("Bruce"),new Agent("Will"),
				new ArrayList<ObjetTransportable>() {{add(new ObjetTransportable("couteau suisse"));
				add(new ObjetTransportable("mirroir"));add(new ObjetTransportable("creme solaire"));}},
				new Backpack(10));
		d.BackpackFilling();
		PrintWriter writer;
		try {
			writer = new PrintWriter("watwat.txt", "UTF-8");
			writer.println("The first line");
			writer.println("The second line");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
