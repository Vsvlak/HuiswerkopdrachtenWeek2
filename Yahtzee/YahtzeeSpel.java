package Yahtzee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class YahtzeeSpel {

	Scanner scanner = new Scanner(System.in);
	private String input = "";
	private int worpenOver = 2;
	private int speler = 1;
	int[] blokkeerArray = { 0, 0, 0, 0, 0 };
	Worp worp = new Worp();
	Speler speler1 = new Speler();
	Speler speler2 = new Speler();

	ArrayList<Dobbelsteen> dobbelstenen = new ArrayList<>();
	Dobbelsteen dobbelsteen1 = new Dobbelsteen(werpen());
	Dobbelsteen dobbelsteen2 = new Dobbelsteen(werpen());
	Dobbelsteen dobbelsteen3 = new Dobbelsteen(werpen());
	Dobbelsteen dobbelsteen4 = new Dobbelsteen(werpen());
	Dobbelsteen dobbelsteen5 = new Dobbelsteen(werpen());

	YahtzeeSpel() {
		dobbelstenen.add(dobbelsteen1);
		dobbelstenen.add(dobbelsteen2);
		dobbelstenen.add(dobbelsteen3);
		dobbelstenen.add(dobbelsteen4);
		dobbelstenen.add(dobbelsteen5);
	}

	public void spelen() {

		//System.out.println("Druk 'help' voor menu");
		while (!input.equals("q")) {
			worp.weergeven(dobbelstenen);
			vasthouden();
			gooiWorp();
			if (worpenOver == 0) {
				System.out.println("Maak uw laatste beslissing en type 'klaar' als u klaar bent");
				worp.weergeven(dobbelstenen);
				if (speler == 1) {
					speler++;
				} else {
					speler--;
				}
				if (speler == 1) {
					speler1.addWorpGeschiedenis(worp.resultaatDobbelstenen);
				} else if (speler == 2) {
					speler2.addWorpGeschiedenis(worp.resultaatDobbelstenen);
				}
				input = scanner.nextLine();
				while (!input.equals("klaar")) {
					break;
				}
				gooiWorp();
				worpenOver=2;
			}

		}
	}

	/*
	 * Er wordt een nummer gegenereerd en teruggegeven die kan worden toegewezen aan
	 * een dobbelsteen
	 */
	public int werpen() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	/*
	 * Er wordt gevraagd welke dobbelstenen vastgehouden moeten worden en dit wordt
	 * opgeslagen in de blokkeerArray.
	 */
	public void vasthouden() {
		System.out.println(
				"Speler " + speler + " Welke dobbelstenen wilt u vasthouden? Nog " + worpenOver + " worpen over.");
		for (int i = 0; i < blokkeerArray.length; i++) {
			blokkeerArray[i] = 0;
		}
		input = scanner.nextLine();
		boolean isNummer = Pattern.matches("[0-9]+", input);
		if (isNummer) {
			for (int i = 0; i < input.length(); i++) {
				if (Integer.parseInt(input) == 0) {
					continue;
				}
				blokkeerArray[Integer.parseInt(input.substring(i, i + 1)) - 1] = 1;
			}
		}
		// hulpGevraagd();
	}

	/*public void hulpGevraagd() {
		if (input.equals("help")) {
			System.out.println("doorgaan - u gaat door met het spel");
			System.out.println(
					"geschied<spelernummer> - laat de geschiedenis van de vermelde speler zien (bijv. geschied1)");
		}
		String inputHelp = scanner.nextLine();
		if (inputHelp.equals("doorgaan")) {
			spelen();
		} else if (inputHelp.startsWith("geschied")) {
			String geschiedSplit[] = inputHelp.split("d");
			boolean isNummer = Pattern.matches("[0-9]+", geschiedSplit[1]);
			if (isNummer) {
				int spelersNummer = Integer.parseInt(geschiedSplit[1]);
				if (spelersNummer > 0 && spelersNummer < 3) {
					if (spelersNummer == 1) {
						speler1.showGeschiedenis();
						spelen();
					} else if (spelersNummer == 2) {
						speler2.showGeschiedenis();
						spelen();
					}
				} else {
					System.out.println("Vul een geldige waarde in");
					hulpGevraagd();
				}
			} else {
				System.out.println("Vul een geldige waarde in");
				hulpGevraagd();
			}
		} else {
			System.out.println("Vul een geldige waarde in");
			hulpGevraagd();
		}
	}*/

	/*
	 * De dobbelstenen die niet vastgehouden worden, worden opnieuw geworpen
	 */
	public void gooiWorp() {
		for (int i = 0; i < dobbelstenen.size(); i++) {
			if (blokkeerArray[i] == 0) {
				dobbelstenen.get(i).setBovensteZijde(werpen());
			}
		}
		worpenOver--;
		boolean isNummer = Pattern.matches("[0-9]+", input);
		if (isNummer) {
			if (Integer.parseInt(input) == 0) {
				worpenOver = 0;
			}
		}

	}
}
