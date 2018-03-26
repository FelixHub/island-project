package test;

public class MessageAccept extends Message {

	
	public MessageAccept(Agent s) {
		super.speaker = s;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.ACCEPT;
	}
	
	@Override
	public String format() {
		return "Ok on le met dans le sac.";
	}
		
}
