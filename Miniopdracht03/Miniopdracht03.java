package Miniopdracht03;

import java.util.Scanner;

public class Miniopdracht03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int input = scanner.nextInt();
		
		
		if (input < 6) {
			System.out.println("Lager");
		} else if (input > 6) {
			System.out.println("Hoger");
		} else {
			System.out.println("Gelijk");
		}
		
		
		
	}
}
