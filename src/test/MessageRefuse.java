package test;

public class MessageRefuse extends Message {
	
	public MessageRefuse(Agent s) {
		super.speaker = s;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.REFUSE;
	}
	
	@Override
	public String format() {
		return "On peut s'en passer.";
	}
}
