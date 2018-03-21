package test;

public class MessagePropose extends Message {

	private ObjetTransportable content;
	
	public ObjetTransportable getContent() {
		return content;
	}
	
	public MessagePropose(Agent s, ObjetTransportable o) {
		super.speaker = s;
		this.content = o;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.PROPOSE;
	}
	
	@Override
	public String format() {
		return format(this.content);
	}
	
	public String format(ObjetTransportable o) {
		return "Je propose qu'on prenne le " + o.toString();	
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

