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
	
	
	
	
	
	
	
	
