package Miniopdracht17;

import java.util.Arrays;
import java.util.Scanner;

public class Miniopdracht17 {

	public static void main(String[] args) {
		
		
		int [][]boardRoster = new int[][]{
				   //0 1 2 3 4 5 6 7 8 9	
			/*A*/	{0,0,1,1,1,0,0,1,0,0},
			/*B*/	{0,0,0,0,0,0,0,1,0,0},
			/*C*/	{0,1,1,1,0,0,0,1,0,0},
			/*D*/	{0,0,0,0,0,0,0,1,0,0},
			/*E*/	{0,0,1,1,0,0,0,0,0,0}};
			
			int amountOfShotsLeft = 5;
			int rowShot = -1;
			int columnShot = -1;
			int wonOrLost = 0;
			int shotsHit = 0;

			Scanner scanner = new Scanner (System.in);
			
			while (wonOrLost == 0) {
			System.out.println("Waar wilt u schieten? (bijvoorbeeld B3)");
			String input = scanner.nextLine().toLowerCase();
			
			for(int i = 0; i<input.length(); i++) {
				if(i==0) {
					if(input.substring(i,i+1).equals("a")){
						rowShot=0;
					} else if (input.substring(i,i+1).equals("b")) {
						rowShot=1;
					} else if (input.substring(i,i+1).equals("c")) {
						rowShot=2;
					} else if (input.substring(i,i+1).equals("d")) {
						rowShot=3;
					} else if (input.substring(i,i+1).equals("e")) {
						rowShot=4;
					} else {
						System.out.println("Please enter a valid amount");
					}
				}
				if (i==1) {
					columnShot = Integer.parseInt(input.substring(i,i+1));
				}
			}
			if (boardRoster[rowShot][columnShot] == 1) {
				System.out.println("That is a confirmed hit! " + (11-shotsHit) + " left!");
				boardRoster[rowShot][columnShot]=0;
				shotsHit++;
			} else {
				System.out.println("That is a miss! " + (amountOfShotsLeft-1) + " misses left!");
				amountOfShotsLeft--;
			}
			
			if (shotsHit == 12) {
				System.out.println("You shot down all boats. Congratulations! (although you probably cheated...)");
				wonOrLost++;
			}
			if (amountOfShotsLeft == 0) {
				System.out.println("You have no more shots left. Try again!");
				wonOrLost++;
			}
		}
	}

}
