package test;

import java.util.Hashtable;

public class ObjetTransportable {
	
	Hashtable<Dimension,Integer> utility;
	String name;

	// une solution = attribuer une utilité à chaque dimension dans une table de hachage (clef = dimension, contenu = utilité), voir comment l'instancier
	public double utilit�(Dimension a) {
		return utility.get(a);
	}
	
	public ObjetTransportable(String name,int food, int safe, int help, int size, int durability) {
		this.name = name;
		Hashtable<Dimension,Integer> utility = new Hashtable<Dimension,Integer>();
		utility.put(Dimension.FOOD,food);
		utility.put(Dimension.SAFETY,safe);
		utility.put(Dimension.HELP,help);
		utility.put(Dimension.SIZE,size);
		utility.put(Dimension.DURABILITY,durability);
		this.utility = utility;
	}
	
	public String toString() {
		return name;
	}
}
