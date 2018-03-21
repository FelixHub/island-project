package test;

public class Agent {

	// poids pour les dimensions -> comme un ordre sauf que c'est cardinal
	public double poids(Dimension a) {
		return 0;
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
