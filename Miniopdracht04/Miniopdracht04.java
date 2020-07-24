package Miniopdracht04;

public class Miniopdracht04 {

	public static void main(String[] args) {
		
		String org = "Deze regel heeft best wel veel eees.";
		int count = 0;
		
		for (int i=0; i<org.length(); i++) {
			if (org.substring(i,i+1).equals("e")){
				count++;
			}
		}
		System.out.println(count);		
	}
	
}
