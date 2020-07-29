package Mastermind;

import java.util.Random;

public class PlayerMaster {

	Random random = new Random();
	private int[] result = new int[4];
	private String codeToGuessWord = "";
	private String resultColors = "";

	public void createCode(String[] colors, String[] codeToGuess) {
		for (int i = 0; i < 4; i++) {
			codeToGuess[i] = colors[random.nextInt(6)];
		}
		System.out.println("I made a tricky code for you to guess!");
		System.out.println();
	}
	
	
	

	public void checkForWhite(String[] codeToGuess, String guesserInput) {

		
		/*
		 * Deze hele method gaat nergens over.......
		 * Maar hij werkt :)
		 */
		
		
		
		int countY = 0;
		int countR = 0;
		int countB = 0;
		int countG = 0;
		int countP = 0;
		int countO = 0;
		for (int i=0;i<guesserInput.length();i++) {
			if (codeToGuess[i].equals("Y")) {
				countY++;
			} else if (codeToGuess[i].equals("R")) {
				countR++;
			} else if (codeToGuess[i].equals("B")) {
				countB++;
			} else if (codeToGuess[i].equals("G")) {
				countG++;
			} else if (codeToGuess[i].equals("P")) {
				countP++;
			} else {
				countO++;
			}
		}

		
		
		
		for (int i=0; i< codeToGuess.length; i++) {
			codeToGuessWord = codeToGuessWord + codeToGuess[i];
		}
		int count = 0;
		for (int i = 0; i < guesserInput.length(); i++) {
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("Y") && countY > 0) {
				result[count] = 1;
				countY--;
				count++;
				continue;
			}
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("R") && countR > 0) {
				result[count] = 1;
				countR--;
				count++;
				continue;
			}
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("B") && countB > 0) {
				result[count] = 1;
				countB--;
				count++;
				continue;
			}
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("G") && countG > 0) {
				result[count] = 1;
				countG--;
				count++;
				continue;
			}
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("P") && countP > 0) {
				result[count] = 1;
				countP--;
				count++;
				continue;
			}
			if (codeToGuessWord.contains(guesserInput.substring(i,i+1)) && guesserInput.substring(i,i+1).equals("O") && countO > 0) {
				result[count] = 1;
				countO--;
				count++;
				continue;
			}

		}
	}
	
	
	
	
	
	public void checkForRed(String guesserInput) {
		int count=0;
		for (int i=0; i<guesserInput.length(); i++) {
			if (guesserInput.substring(i,i+1).equals(codeToGuessWord.substring(i,i+1))) {
				result[count]=2;
				count++;
			}
		}
	}
	
	
	public void showResult(int guessesLeft) {
		
		for(int i=0; i<result.length; i++) {
			if (result[i] == 2) {
				System.out.print("Red   ");
				resultColors = resultColors + "Red   ";
			}
			if (result[i] == 1) {
				System.out.print("White   ");
				resultColors = resultColors + "White   ";
			}
		}
		guessesLeft--;
		for(int i=0; i<result.length;i++) {
			result[i]=0;
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	
	public boolean winOrLose(int guessesLeft) {
		int count = 0;
		boolean winLose = false;
		for(int i=0; i<result.length; i++) {
			if (result[i]==2) {
				count++;
			}
		}
		if (count==4) {
			System.out.println("YOU WON! CONGRATULATIONS!!!");
			winLose = true;
		}
		if (guessesLeft == 0) {
			System.out.println("YOU LOST :( TRY AGAIN...");
			winLose = true;
		}
		resultColors = "";
		return winLose;
	}




	public int[] getResult() {
		return result;
	}




	public void setResult(int[] result) {
		this.result = result;
	}




	public String getResultColors() {
		return resultColors;
	}




	public void setResultColors(String resultColors) {
		this.resultColors = resultColors;
	}
	
	
	
}
