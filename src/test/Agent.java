package test;

import java.util.Hashtable;
import java.util.Random;

public class Agent {
	
	public static final Random rand = new Random();
	
	
	Hashtable<Dimension,Integer> poidsDim;
	String name;
	
	public String getName() {
		return name;
	}
	
	// poids pour les dimensions -> comme un ordre sauf que c'est cardinal
	public double poids(Dimension a) {
		return poidsDim.get(a);
	}

	public Agent(String name) {
		this.name = name;
	} // TODO
	
	@Override
	public String toString() {
		return name;
	}

	public Message[] parler(ObjetTransportable ot) {
		int n = rand.nextInt(3);
		Message[] msgs = new Message[n];
		for(int i = 0;i<n;i++) {
			
			msgs[i] = Message.randomMessage(this, ot); // à choisir Propose, ou autre, aléatoire
			System.out.println(msgs[i]);
		}
		
		return msgs;
	}
	
	
	
	
	
	
	public Agent(String name,int food, int safe, int help, int size, int durability) {
		this.name = name;
		Hashtable<Dimension,Integer> poidsDim = new Hashtable<Dimension,Integer>();
		poidsDim.put(Dimension.FOOD,food);
		poidsDim.put(Dimension.SAFETY,safe);
		poidsDim.put(Dimension.HELP,help);
		poidsDim.put(Dimension.SIZE,size);
		poidsDim.put(Dimension.DURABILITY,durability);
		this.poidsDim = poidsDim;
	}

	public ObjetTransportable chooseObject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// une fonction de décision multiattributs (TODO dans doc: trouver la différence entre multicritère et multiattribut en négo)
	// qu'on fera plus tard
	
	// cas simple = moyenne pondérée utilité*poids
	
	
	
	// Dans un premier temps, les utilités sont propres aux objets et non aux agents. Donc tous les deux sont d'accord pour dire que
	// POIDS(objet1) = pas très utile
	
	// interaction -> chaînes de dialogue
	// A1 : PROPOSER(couteau-suisse)
	// A1 : ARGUMENTER-PRO(securité,0.9)
	// A1 : ARGUMENTER-PRO(food,0.5)
	// A2 : ARGUMENTER-CON(poids,0.1)
	// A2 : REFUSER(couteau-suisse)
	// A2 : ACCEPT(couteau-suisse)

	// -> dialogue aléatoire
	// A1 : je propose qu'on prenne le couteau suisse
	//			toString du performatif, toString de l'objet, etc...
	// A1 : parce que c'est bien pour la sécurité
	//			idem ?
}
