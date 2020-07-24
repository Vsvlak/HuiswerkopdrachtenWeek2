package Miniopdracht14;

import java.util.Scanner;

public class Miniopdracht14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		String lastWord = "";
		
		while (true) {
			input = scanner.nextLine();
			if (lastWord.equals("")) {
				lastWord = input;
			} else if (lastWord.substring(lastWord.length()-1, lastWord.length()).equals(input.substring(0,1))){
				System.out.println("Correct!");
				lastWord = input;
			} else {
				System.out.println("FOUT!");
			}
		}
		
		
		
		
	}
	
	
	
	
	
}
