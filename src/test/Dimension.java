package test;

public enum Dimension {
	FOOD, SAFETY, HELP, SIZE, DURABILITY;
	@Override
	public String toString() {
		switch (this) {
		case SAFETY:
			return " de la securite.";
		case FOOD:
			return " de la nourriture.";
		case HELP:
			return " de l'aide.";
		case SIZE:
			return " de la place dans le sac.";
		default:
			return " de la durabilite.";
		}
	}
}
