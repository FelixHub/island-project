package test;

import java.util.Random;

public abstract class Message {

	public abstract Performatif getPerformatif();
	public abstract String format();
	
	protected Agent speaker;
	
	@Override
	public String toString() {
		return speaker.getName() + " :- " + this.format();
	}
/**
	public static void main(String[] z) {
		ObjetTransportable o1 = new ObjetTransportable("couteau suisse");
		Agent a = new Agent("toto");
		Message m = new MessagePropose(a,o1);
		System.out.println(m);
	}
*/	
	public static Message randomMessage(Agent speaker, ObjetTransportable objetBidon) {
		Random rn = new Random();
		int randomNum = rn.nextInt(5);
		if (randomNum == 0) {
			return new MessageArgPro(speaker,objetBidon);
		}
		else if(randomNum == 1) {
			return new MessageArgCon(speaker,objetBidon);
		}
		else if(randomNum == 2){
			return new MessagePropose(speaker,objetBidon);
		}
		else if(randomNum == 3) {
			return new MessageRefuse(speaker);
		}
		else {
			return new MessageAccept(speaker);
		}
	}
}
	
	
	
	
	
	
	
	
	

