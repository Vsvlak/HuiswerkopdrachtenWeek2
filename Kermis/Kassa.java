package Kermis;

public class Kassa {

	private int totaleOmzet;
	private int totaalAantalKaartjes;

	
	
	public void omzetVerhogen(double kaartje) {
		totaleOmzet += kaartje;
		totaalAantalKaartjes += 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getTotaleOmzet() {
		return totaleOmzet;
	}

	public void setTotaleOmzet(int omzet) {
		this.totaleOmzet = omzet;
	}

	public int getTotaalAantalKaartjes() {
		return totaalAantalKaartjes;
	}

	public void setTotaalAantalKaartjes(int totaalAantalKaartjes) {
		this.totaalAantalKaartjes = totaalAantalKaartjes;
	}
	
	
	
	
	
}
