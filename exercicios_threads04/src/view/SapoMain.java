package view;

import controller.Sapos;

public class SapoMain {
	
	public static void main (String [] args) {
		
	
		for (int i=0; i<5; i++) {
			Sapos sapo = new Sapos(i);
			sapo.start();
		}
		
		
	}

}
