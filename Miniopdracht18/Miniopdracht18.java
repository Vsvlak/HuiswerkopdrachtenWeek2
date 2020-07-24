package Miniopdracht18;

import java.util.Random;
import java.util.Scanner;


public class Miniopdracht18 {

	public static void main(String[] args) {
		
	
		int winOrLose = 0;
		int guessesLeft = 9;
		String [] possibleWords = {"programmeren", "leerling", "studeren", "winnaar", "poppetjes", "quote", "miljoen", "nihil", "succes", "quinoa", "liquidatie"};
		String wordToGuess = "";
		String wordGuessedSoFar = "";
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		wordToGuess = possibleWords[random.nextInt(possibleWords.length)];


		for(int i=0; i<wordToGuess.length(); i++) {
			wordGuessedSoFar = wordGuessedSoFar + "*";
		}
		
		
		while (winOrLose == 0) {
			System.out.println(wordGuessedSoFar);
			System.out.println("Type a letter to guess the word. You have " + guessesLeft + " guesses wrong left.");
			String input = scanner.nextLine();
			if (input.length()>1) {
				System.out.println("Please enter a valid letter.");
				continue;
			}
			if (wordToGuess.contains(input)) {
				for (int i=0; i<wordToGuess.length(); i++) {
					if (wordToGuess.substring(i,i+1).equals(input)) {
						wordGuessedSoFar = wordGuessedSoFar.substring(0,i) + input + wordGuessedSoFar.substring(i+1);
						
						}
					}
				if (wordToGuess.equals(wordGuessedSoFar)) {
					System.out.println("Correct: " + wordToGuess);
					System.out.println("YOU WON!! CONGRATULATIONS!");
					winOrLose++;
				}
			} else {
				System.out.println("You guessed wrong!");
				guessesLeft--;
				if (guessesLeft == 0) {
					System.out.println("You lost :(");
					winOrLose++;
				}
			}			
		}	
	}	
}
