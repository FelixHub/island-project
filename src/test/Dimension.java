package test;

public enum Dimension {
	FOOD, SAFETY, HELP, SIZE, DURABILITY;


	@Override
	public String toString() {
		switch (this) {
		case SAFETY:
			return "sécurité";
		default:
			return "à compléter";
		}
	}
}
