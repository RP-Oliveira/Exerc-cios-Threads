package view;

import controller.ThreadMatriz;

public class MainSoma {

	public static void main (String [] args) {

		for(int i = 0; i<3 ; i++) {
			ThreadMatriz m = new ThreadMatriz(i);
			m.loadArr(i);
			m.start();	
		}
	}
}
