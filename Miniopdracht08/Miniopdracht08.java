package Miniopdracht08;

public class Miniopdracht08 {

	public static void main(String[] args) {

		String regel = "Bruine bloemen!".toLowerCase();

		for (int i = 0; i < regel.length(); i++) {
			if (regel.substring(i, i + 1).equals("a") || regel.substring(i, i + 1).equals("e")
					|| regel.substring(i, i + 1).equals("i") || regel.substring(i, i + 1).equals("o")) {
				System.out.println(regel.substring(i, i + 1) + "*");
			} else {
				System.out.println(regel.substring(i, i + 1));
			}

		}
	}
}
