package Miniopdracht10;

import java.util.Scanner;

public class Miniopdracht10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		int count = 0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		while (count < 26) {
			String input = scanner.nextLine();
			if (alphabet.substring(count, count + 1).equals(input)) {
				System.out.println("OK");
				count++;
			} else {
				System.out.println("FOUT");
			}
		}
		scanner.close();

	}

}
