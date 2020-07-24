package Miniopdracht12;

public class Miniopdracht12 {

	public static void main(String[] args) {

		String org = "regenen";
		int count = 0;

		for (int i = 0; i < org.length(); i++) {
			if (org.substring(i, i + 1).equals("e")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
