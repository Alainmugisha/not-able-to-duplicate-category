package pages;

import java.util.Random;

public class Base_page {

	
	public int  randomvaluegenerated () {
		
		Random rand = new Random();
		int randomvaluegenerated = rand.nextInt(100);
		return randomvaluegenerated;
		
	}
}
