package test;

import java.util.Hashtable;
 
/** Les utilite sont entre 0 et 1
 * 
 */
 
public class ObjetTransportable {
	  
	private Hashtable<Dimension,Double> utility;
	private String name;

	// une solution = attribuer une utilite à chaque dimension 
	//dans une table de hachage (clef = dimension, contenu = utilite), voir comment l'instancier
	public double utilite(Dimension a) {
		return utility.get(a);
	}
	
	public void setUtility(Dimension d, double val) {
		utility.put(d, val);
	}
	
	public ObjetTransportable(String name) {
		this.name = name;
		this.utility = new Hashtable<Dimension,Double>();
	}
	
	public String toString() {
		return name;
	}
/**
	public static void main(String[] z) {
		ObjetTransportable o1 = new ObjetTransportable("couteau suisse");
		o1.setUtility(Dimension.FOOD,0.5);
		o1.setUtility(Dimension.SAFETY,0.8);
		o1.setUtility(Dimension.HELP,0);
		o1.setUtility(Dimension.SIZE,1);
		o1.setUtility(Dimension.DURABILITY,0.2);
		
		System.out.println(o1); // ne teste pas les valeurs de dimension
	}
*/
	public String getName() {
		return name;
	}
}
