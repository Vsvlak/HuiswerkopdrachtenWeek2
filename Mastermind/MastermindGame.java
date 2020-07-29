package Mastermind;

public class MastermindGame {

	PlayerMaster pm = new PlayerMaster();
	PlayerGuesser pg = new PlayerGuesser();
	HistoryTracker ht = new HistoryTracker();
	private final String[] colors = { "Y", "R", "B", "G", "P", "O" };
	private String[] codeToGuess = new String[4];
	private String[] playersGuess = new String[4];
	private int guessesLeft = 12;

	public void play() {

		giveExplanation();
		pm.createCode(colors, codeToGuess);
		while (!pm.winOrLose(guessesLeft)) {
			pg.guessCode(guessesLeft);
			guessesLeft--;
			pm.checkForWhite(codeToGuess, pg.getGuesserInput());
			pm.checkForRed(pg.getGuesserInput());
			ht.fillHistoryArray(pg.getGuesserInput(), pm.getResultColors());
			pm.showResult(guessesLeft);
		}

	}

	public void giveExplanation() {
		System.out.println("Welcome to Mastermind!");
		System.out.println("It is your task to crack my unsolvable code.");
		System.out.println("There are 6 colors: Yellow, Red, Blue, Green, Purple, Orange.");
		System.out.println("When guessing, type the first letter of the color you want to guess.");
		System.out.println("For example: YYPB");
		System.out.println("You will be given a 4 letter result. R is red and means correct color AND location.");
		System.out.println("W is white and means right color BUT wrong location.");
		System.out.println("You have 12 attempts.");
		System.out.println("Good luck!");
		System.out.println();
	}

	public String[] getColors() {
		return colors;
	}

	public String[] getCodeToGuess() {
		return codeToGuess;
	}

	public void setCodeToGuess(String[] codeToGuess) {
		this.codeToGuess = codeToGuess;
	}

	public String[] getPlayersGuess() {
		return playersGuess;
	}

	public void setPlayersGuess(String[] playersGuess) {
		this.playersGuess = playersGuess;
	}
}