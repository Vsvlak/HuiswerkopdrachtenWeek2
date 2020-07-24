package Miniopdracht05;

import java.util.Scanner;

public class Miniopdracht05 {

	
	public static void main(String[] args) {
		
		String wachtwoord = "java";
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if (input.equals(wachtwoord)) {
			System.out.println("Wachtwoord is OK: " + input);
		} else {
			System.out.println("Wachtwoord is fout: " + input);
		}
		
		
		
	}
}
