package controller;

import java.util.Random;

public class ThreadVetor extends Thread {
	private int vet [];
	private int x;
	
	public ThreadVetor(int[]vet, int x) {
		this.vet = new int[1000];
		this.x = x;
	}
	
	@Override 
	public void run () {
		threadVetor();
	}
	public void vetorLoop () {
		Random ran = new Random();
		
		long millis_inicio= System.nanoTime();
		
		for(int i=0; i < vet.length;i++) {

			vet[i] = ran.nextInt((100 - 1) + 1) + 1;
				
		}
		
		long millis_fim= System.nanoTime();
		
		long millis_total= millis_fim - millis_inicio;
		double seconds = millis_total/Math.pow(10, 9);
		
		System.out.println("Número par, loop For, tempo total: "+seconds+"s");
	}
	
	public void vetorForEach () {
		
		Random ran = new Random();
		long millis_inicio= System.nanoTime();
		
		for(int i:vet) {
			
			vet[i] = ran.nextInt((100 - 1) + 1) + 1;
			
		}
		
		long millis_fim = System.nanoTime();
		long millis_total= millis_fim - millis_inicio;
		double seconds = millis_total/Math.pow(10, 9);
		
		System.out.println("Número ímpar, ForEach, tempo total: "+seconds+"s");
	}

	public void threadVetor() {
		
		if (x%2==0) 
			vetorLoop();
		else
		 	vetorForEach();
	}
	
}
