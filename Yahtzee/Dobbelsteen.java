package Yahtzee;

import java.util.Random;

public class Dobbelsteen {
	
	private final int totaalAantalZijde = 6;
	private int bovensteZijde;
	Random random = new Random();
	
	
	public Dobbelsteen(int gedobbeld) {
		bovensteZijde = gedobbeld;
	}
	
	
	public int getBovensteZijde() {
		return bovensteZijde;
	}
	public void setBovensteZijde(int bovensteZijde) {
		this.bovensteZijde = bovensteZijde;
	}
	public int getTotaalAantalZijde() {
		return totaalAantalZijde;
	}

	
	
	
	
	
	
}
