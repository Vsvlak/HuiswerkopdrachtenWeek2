package Kermis;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Kermis {

	Scanner scanner = new Scanner(System.in);
	private String input = "";

	Attractie botsautos = new Botsautos();
	Attractie spin = new Spin();
	Attractie spiegelpaleis = new Spiegelpaleis();
	Attractie spookhuis = new Spookhuis();
	Attractie hawaii = new Hawaii();
	Attractie ladderklimmen = new Ladderklimmen();
	Kassa kassa = new Kassa();
	Attractie[] attractieArray = { botsautos, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen};

	public void openen() {

		while (true) {
			System.out.println("Voor welke attractie wilt u een kaartje?");
			String input = scanner.nextLine();
			if (input.equals("q")) {
				break;
			}
			if (input.equals("o")) {
				System.out.println("De omzet is " + kassa.getTotaleOmzet() + " cent.");
			}
			if (input.equals("k")) {
				System.out.println("Het totaal aantal verkocht kaartjes is " + kassa.getTotaalAantalKaartjes() + ".");
			}
			boolean isNummer = Pattern.matches("[1-6]+", input);
			if (isNummer) {
				int inputNum = Integer.parseInt(input);
				attractieArray[inputNum - 1].draaien(kassa);
			} else {
				System.out.println("Vul alstublieft het getal (1 t/m 6) in van de attractie.");
			}
		}

	}

}
