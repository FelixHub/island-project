package test;

public class MessageArgPro extends Message {
	
	private ObjetTransportable content;
	private Dimension dim;
	public ObjetTransportable getContent() {
		return content;
	}
	
	public MessageArgPro(Agent s, ObjetTransportable o) {
		super.speaker = s;
		this.content = o;
		this.dim = Dimension.HELP;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.ARGPRO;
	}
	
	@Override
	public String format() {
		return format(this.content,this.dim);
	}
	public String format(ObjetTransportable o,Dimension d) {
		return "Prenons cet objet, parceque le "+ o.toString() +"nous apportera" + d.toString();	
	}

}
