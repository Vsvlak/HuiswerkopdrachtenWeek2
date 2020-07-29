package Kermis;

public class Ladderklimmen extends Attractie implements GokAttractie {

	private String naam = "Ladderklimmen";
	private int prijs = 500;
	private int aantalKerenBezocht = 0;
	private int omzet = 0;
	private double omzetBelasting = 0.7;
	private int oppervlakte;

	public void draaien(Kassa kassa) {
		System.out.println("Het " + naam + " is aan het draaien.");
		aantalKerenBezocht++;
		omzet += prijs;
		kassa.omzetVerhogen(prijs*omzetBelasting);
	}

	public void kansSpelBelastingBetalen() {
		omzet *= omzetBelasting;
	}
	
	
	
	
	
	
	

	public int getPrijs() {
		return prijs;
	}

	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getOppervlakte() {
		return oppervlakte;
	}

	public void setOppervlakte(int oppervlakte) {
		this.oppervlakte = oppervlakte;
	}

	public int getAantalKerenBezocht() {
		return aantalKerenBezocht;
	}

	public void setAantalKerenBezocht(int aantalKerenBezocht) {
		this.aantalKerenBezocht = aantalKerenBezocht;
	}

	public int getOmzet() {
		return omzet;
	}

	public void setOmzet(int omzet) {
		this.omzet = omzet;
	}

}
