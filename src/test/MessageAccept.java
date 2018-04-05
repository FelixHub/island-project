package test;

/** Représente un message Accept.
 * Lorsqu'il est choisi, cela ajoute l'objet dans le sac par effet de bord.
 */
public class MessageAccept extends Message {
	private Dialog d;
	private ObjetTransportable objet;
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
		d.addObjectToBackPack(objet);
		return "Ok on le met dans le sac.";
	}
		
}
