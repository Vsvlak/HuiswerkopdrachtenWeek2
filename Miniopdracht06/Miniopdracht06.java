package Miniopdracht06;

public class Miniopdracht06 {

	public static void main(String[] args) {
		
		
		double length = 1.96;
		double weight = 15.0;
		double bmi = weight/(length*length);
		

		
		if (bmi<18) {
			System.out.println("Yellow");
		} else if (bmi>=25) {
			System.out.println("Red");
		} else {
			System.out.println("Green");
		}
	}
	
	
}
