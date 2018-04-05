package test;

import java.util.ArrayList;

/** Cette classe représente le sac à dos contenant les objets qui ont été acceptés.
 * Les objets peuvent y être ajoutés mais pas retirés.
 * 
 * Question NS : pourquoi ne pas faire simplement un extends ArrayList<OT> ?
 * Réponse (NS) : parce qu'on ne veut pas retirer, par exemple.
 * (pour l'instant, c'est la seule raison que je vois)
 *
 */
public class Backpack {
	
	int capacity;
	ArrayList<ObjetTransportable> contents;
	
	public boolean isNotFull() {
		
		if (capacity == contents.size()) {
			return false;
		}
		else {
			return true;
		}
	}

	public Backpack(int capacity) {
		super();
		this.capacity = capacity;
		this.contents = new ArrayList<ObjetTransportable>();
	}
	
	public void add(ObjetTransportable u) {
		contents.add(u);
	}

	@Override
	public String toString() {
		String s = "Le sac contient les objets : ";
		
		for(ObjetTransportable u : contents) {
			if (u == null) {
				continue; // NS : remplacer par throw new RuntimeException("C'est n'importe quoi ce sac à dos!");
			}
			else{
				s = s + u.getName() + " and ";
			}
		}
		return (s+" et c'est tout.");
		
	}

	

}
