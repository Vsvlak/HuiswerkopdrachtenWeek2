package Miniopdracht07;

public class Miniopdracht07 {

	
	public static void main(String[] args) {
		
		String str = "Ik programmeer Java!";
		String reverse = "";
		
		for (int i=str.length(); i>0; i--) {
			reverse = reverse + str.substring(i-1,i);
		}
		
		System.out.println(reverse);
		
		
		
	}
}
