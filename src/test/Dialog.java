package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

/** Cette classe permet de simuler un dialogue. Elle est munie d'une liste de participants (Agent),
 * d'une liste d'objets transportables à discuter et d'un sac à dos (Backpack)
 */
public class Dialog {
	
	public static final int NB_TOURS = 10;
	
	
	private Agent[] travelers;
	private ArrayList<ObjetTransportable> utilities;
	private Backpack backpack;
	
	/** Cette méthode permet d'ajouter un objet dans la liste des objets de la négotiation. */
	public void addUtilities(ObjetTransportable obj) {
		utilities.add(obj);
	}
	
	/** Cette méthode permet d'ajouter un objet dans le sac à dos, une fois que les deux
	 * participants sont d'accord pour l'y mettre.
	 * 
	 * Note NS: et peut-on "retirer" un objet dans la négotiation ?
	 * Pour l'instant, je propose qu'on écarte cette possibilité mais il faut être conscient de ses implications.
	 */
	public void addObjectToBackPack(ObjetTransportable obj) {
		backpack.add(obj);
	}
	
	public Dialog(Agent[] t, ArrayList<ObjetTransportable> utilities, Backpack backpack) {
		this.travelers = new Agent[2];
		this.travelers[0] = t[0];
		this.travelers[1] = t[1];
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

	public static void main(String [] args) throws IOException {
		   
		Dialog d = new Dialog(new Agent[2], new ArrayList<ObjetTransportable>(), new Backpack(10));
		d.travelers[0] = new Agent("bruce",d);
		d.travelers[1] = new Agent("Will",d);
		FileReader in = new FileReader("Input.txt");
	    BufferedReader br = new BufferedReader(in);
	 
		String line;
		while ((line = br.readLine()) != null) {
		    d.addUtilities(new ObjetTransportable(line));
		}
	
		d.BackpackFilling();
		
		try {
			PrintWriter writer;
			writer = new PrintWriter("OutputDialog.txt", "UTF-8");
			writer.println(d.backpack);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	
}
