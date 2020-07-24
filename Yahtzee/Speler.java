package Yahtzee;

import java.util.ArrayList;

public class Speler {

	
	private ArrayList <int[]> worpGeschiedenis = new ArrayList <>();
	//private int[]arrayChecked= new int[5];


	
	
	
	
	public ArrayList<int[]> getWorpGeschiedenis() {
		return worpGeschiedenis;
	}
	

	public void setWorpGeschiedenis(ArrayList<int[]> worpGeschiedenis) {
		this.worpGeschiedenis = worpGeschiedenis;
	}
	
	public void addWorpGeschiedenis(int[] worpGeschiedenis) {
		this.worpGeschiedenis.add(worpGeschiedenis);
	}
	
	/*void showGeschiedenis() {
		
		for (int j=0; j<worpGeschiedenis.size(); j++) {
			arrayChecked = worpGeschiedenis.get(j);
				for(int i=0; i<arrayChecked.length; i++) {
						if (i+1 <arrayChecked.length) {
							System.out.print(arrayChecked[i] + " ");
						} else {
							System.out.println(arrayChecked[i]);
						} 
				}
		}
	}*/
	
	
	
}
