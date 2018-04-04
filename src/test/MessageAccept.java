package test;

public class MessageAccept extends Message {
	public Dialog d;
	public ObjetTransportable objet;
	public MessageAccept(Dialog d, Agent s,ObjetTransportable objetBidon) {
		super.speaker = s;
		this.d = d;
	}
	
	@Override
	public Performatif getPerformatif() {
		return Performatif.ACCEPT;
	}
	
	@Override
	public String format() {
		d.backpack.add(objet);
		return "Ok on le met dans le sac.";
		
	}
		
}
