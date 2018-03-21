package test;

public abstract class Message {

	public abstract Performatif getPerformatif();
	public abstract String format();
	
	protected Agent speaker;
	
	@Override
	public String toString() {
		return speaker.getName() + " :- " + this.format();
	}
	
	public static void main(String[] z) {
		ObjetTransportable o1 = new ObjetTransportable("couteau suisse");
		Agent a = new Agent("toto");
		Message m = new MessagePropose(a,o1);
		System.out.println(m);
	}
}
	
	
	
	
	
	
	
	
	
//	static Performatif p;
//	static PreviousPerformatif prP;
//	static ObjetTransportable currentObject;
//	static Agent speaker;
//	static Agent nonSpeaker;
//	
//	static {
//		p = new Performatif();
//	}
//	
//	static void display() {
//		
//		if (prP == PreviousPerformatif.ACCEPTER || prP == PreviousPerformatif.REFUSER) {
//			
//		//on a fini de parler d'un objet, on passe donc au suivant en en choissisant un autre	
//			
//			currentObject = speaker.chooseObject();
//			p.proposer(currentObject,speaker);
//			prP = PreviousPerformatif.PROPOSER;
//			swapSpeaker();
//			
//		}
//		else {
//			// pour l'instant on fait tout au hasard mais 4 comportement sont possibles.
//			
//		}
//	}
//	
//	
//	
//	static void swapSpeaker() {
//	    Agent temp = speaker;
//	    speaker = nonSpeaker;
//	    nonSpeaker = temp;
//	}

