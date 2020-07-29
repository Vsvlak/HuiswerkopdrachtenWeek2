package Kermis;

public abstract class Attractie {

	private String naam;
	private int prijs;
	private int aantalKerenBezocht;
	private int oppervlakte;
	
	public void draaien(Kassa kassa) {}
	public int getPrijs() {
		return prijs;
	}

	
	
}
