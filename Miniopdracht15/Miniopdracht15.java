package Miniopdracht15;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Miniopdracht15 {

	
	public static void main(String[] args) {
		
		
		String [] kaartspel = {"1","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		List <String> kaartspelList = Arrays.asList(kaartspel);
		Collections.shuffle(kaartspelList);
		kaartspel = kaartspelList.toArray(new String [kaartspelList.size()]);
		for (int i=0;i<kaartspel.length;i++) {
			System.out.println(kaartspel[i]);
		}
		
		
		
	}
}
