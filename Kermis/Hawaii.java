package Kermis;

public class Hawaii extends Attractie implements RisicoRijkeAttractie {

	
	
	private String naam = "Spin";
	private int prijs = 290;
	private int aantalKerenBezocht = 0;
	private int omzet = 0;
	private int oppervlakte;
	private int draaiLimiet = 10;

	
	public void draaien(Kassa kassa) {
		System.out.println("De " + naam + " is aan het draaien.");
		aantalKerenBezocht++;
		omzet += prijs;
		kassa.omzetVerhogen(prijs);
		opstellingsKeuring();
	}
	
	public void opstellingsKeuring() {
		if (aantalKerenBezocht%draaiLimiet == 0) {
			onderhoudsbeurt();
		}
	}
	
	public void onderhoudsbeurt() {
		System.out.println("Er wordt een onderhoudsbeurt uitgevoerd.");
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
