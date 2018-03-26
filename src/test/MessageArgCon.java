package test;

public class MessageArgCon extends Message {
	
	private ObjetTransportable content;
	private Dimension dim;
	public ObjetTransportable getContent() {
		return content;
	}
	
	public MessageArgCon(Agent s, ObjetTransportable o) {
		super.speaker = s;
		this.content = o;
		this.dim = Dimension.HELP;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.ARGCON;
	}
	
	@Override
	public String format() {
		return format(this.content,this.dim);
	}
	public String format(ObjetTransportable o,Dimension d) {
		return "Ne prenons pas cet objet, parceque le "+o.toString()+"ne nous apporteras pas"+d.toString();
	}
}
