package Mastermind;

import java.util.Scanner;

public class PlayerGuesser {

	
	Scanner scanner = new Scanner(System.in);
	private String validLetters = "YRBGPO";
	private String guesserInput;
	
	
	
	
	
	public void guessCode (int guessesLeft) {
		System.out.println("What do you guess? (Colors: Y,R,B,G,P,O)");
		System.out.println("You have " + guessesLeft + " guesses left!");
		guesserInput = scanner.nextLine().toUpperCase();
		boolean validGuess = true;
		for (int i=0; i<guesserInput.length();i++) {
			if (!validLetters.contains(guesserInput.substring(i,i+1))) {
				validGuess = false;
			}
		}
		if (validGuess == false || guesserInput.length() != 4) {
			System.out.println("Please enter a valid guess");
			guessCode(guessesLeft);
		}
	}



	
	
	
	
	
	
	

	public String getGuesserInput() {
		return guesserInput;
	}

	public void setGuesserInput(String guesserInput) {
		this.guesserInput = guesserInput;
	}


	
}
