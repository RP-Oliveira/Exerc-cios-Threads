package view;

import java.util.Random;
import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vet[] = new int [1000];
		int x =0;
	
		Thread t = new ThreadVetor(vet, 1);
		t.start();
		Thread t2 = new ThreadVetor(vet, 2);
		t2.start();
		}
}


