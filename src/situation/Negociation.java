package situation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import test.Backpack;

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
					
		currentUtility = traveler1.suggestUtility(Utilities);
		System.out.println(traveler1.name + " : we should put "+ currentUtility + " in our bag.");
			
		if (traveler2.evalUtility(currentUtility)) {
			
			System.out.println(traveler2.name + " : yes, good idea ! let's put the "
			                   + currentUtility +" in the backpack.");
		//backpack.add(currentUtility);
		} 
		else {
			System.out.println(traveler2.name+" : no, it's a bad idea.");
		}	
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br;
		try {
			br = new BufferedReader(
			    new InputStreamReader(new FileInputStream("C:\\Users\\fphub\\eclipse-workspace\\limsi.Argumentation.0.1\\situation.txt")));
		    String line;
		    Traveler t1 = new Traveler(br.readLine());
			Traveler t2 = new Traveler(br.readLine());
			ArrayList<Utility> U = new  ArrayList<Utility>();
		    while ((line = br.readLine()) != null) {
		    	String n = line;
		    	int c1 = Integer.parseInt(br.readLine());
		    	int c2 = Integer.parseInt(br.readLine());
		    	int c3 = Integer.parseInt(br.readLine());
		    	int c4 = Integer.parseInt(br.readLine());
		    	//Utility u = new Utility(n,c1,c2,c3,c4);
		    	//U.add(u);
		    Backpack BP = new Backpack(3);
			Negociation nego1 = new Negociation(t1,t2,U,BP,null);
			nego1.FillBackpack();
		    }
		    br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	}
	
}
