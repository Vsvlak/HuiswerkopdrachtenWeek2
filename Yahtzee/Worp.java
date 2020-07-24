package Yahtzee;

import java.util.ArrayList;

public class Worp {


	int [] resultaatDobbelstenen = new int[5];
	
	
	/* 
	 * De huidige stand van de dobbelstenen wordt weegegeven
	 */
	public void weergeven(ArrayList <Dobbelsteen> dobbelsteen) {
		
		System.out.println("1...2...3...4...5");
		
		for (int i=0; i<resultaatDobbelstenen.length; i++) {
			resultaatDobbelstenen[i] = dobbelsteen.get(i).getBovensteZijde();
			if (i<4) {
				System.out.print(resultaatDobbelstenen[i] + "...");
			} else if (i==4) {
				System.out.println(resultaatDobbelstenen[i]);
			}
		}		
	}
}
