package situation;

import java.util.ArrayList;

public class Negociation {
	
	Traveler traveler1;
	Traveler traveler2;
	ArrayList<Utility> Utilities;
	Backpack backpack;
	Utility currentUtility;
	int flag;
	
	public void FillBackpack() {
		
		while ( backpack.isNotFull() && ( Utilities.size() > 0 ) ) {
			action();
		}
		if (Utilities.size() == 0) System.out.println("No more utilities");
		System.out.println("The backpack is full with" + backpack);
	}
	
	public Negociation(Traveler traveler1, Traveler traveler2, ArrayList<Utility> utilities, Backpack backpack,
			Utility currentUtility) {
		super();
		this.traveler1 = traveler1;
		this.traveler2 = traveler2;
		Utilities = utilities;
		this.backpack = backpack;
		this.currentUtility = currentUtility;
		this.flag = 1;
	}
	
	public void action() {
		if (flag == 1) {
			currentUtility = traveler1.suggestUtility(Utilities);
			if (traveler2.evalUtility(currentUtility)) {
				backpack.add(currentUtility);
			}
			flag = 2;
		}
		else {
			currentUtility = traveler2.suggestUtility(Utilities);
			if (traveler1.evalUtility(currentUtility)) {
				backpack.add(currentUtility);
			}
			flag = 1;
		}
	}

	public static void main(String[] args) {
		Traveler t1 = new Traveler("Dave");
		Traveler t2 = new Traveler("Bruce");
		Utility u0 = new Utility("fork");
		Utility u1 = new Utility("knife");
		Utility u2 = new Utility("spoon");
		Utility u3 = new Utility("towel");
		Utility u4 = new Utility("sunbeam");
		ArrayList<Utility> U = new  ArrayList<Utility>();
		U.add(u0);
		U.add(u1);
		U.add(u2);
		U.add(u3);
		U.add(u4);
		Backpack BP = new Backpack(3);
		Negociation nego1 = new Negociation(t1,t2,U,BP,null);
		nego1.FillBackpack();
	}
	
}
