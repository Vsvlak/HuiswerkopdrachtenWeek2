package Miniopdracht16;

import java.util.Scanner;

public class Miniopdracht16 {

	public static void main(String[] args) {

		// De opdracht kan op meerdere manieren worden geinterpreteerd. Ik maak er van
		// wat ik denk dat ok is. (schikkeljaren zijn niet meegerekend in het resultaat)

		String dayOfWeek;
		int dayNumber=0;
		int yearNumber;
		String[] daysInWeek = { "", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		String[] monthsInYear = { "", "january", "february", "march", "april", "may", "june", "july", "august",
				"september", "october", "november", "december" };

		Scanner scanner = new Scanner(System.in);

		while (dayNumber == 0) {
			System.out.println("Which day of the week is it on january 1st?");
			dayOfWeek = scanner.nextLine();
			for (int i = 0; i < daysInWeek.length; i++) {
				if (daysInWeek[i].equals(dayOfWeek)) {
					dayNumber = i;
				} 
			}
		}
		

		System.out.println("Which year is it?");
		yearNumber = scanner.nextInt();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 31; j++) {
				if (i == 1 && j == 29 || i == 3 && j == 30 || i == 5 && j == 30 || i == 8 && j == 30
						|| i == 10 && j == 30) {
					i++;
					j = 0;
				}
				if (dayNumber <= 6) {
					System.out.print(daysInWeek[dayNumber] + " " + monthsInYear[i + 1] + " " + (j + 1) + " " + yearNumber + ", ");
				} else if (dayNumber == 7) {
					System.out.println(daysInWeek[dayNumber] + " " + monthsInYear[i + 1] + " " + (j + 1) + ", " + yearNumber);
				}
			
				dayNumber++;
				if (dayNumber == 8) {
					dayNumber = 1;
				}
				if (dayNumber ==1) {
					System.out.println();
				}

			}
		}
	}

}
