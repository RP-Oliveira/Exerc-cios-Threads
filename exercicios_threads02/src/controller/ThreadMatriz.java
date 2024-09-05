package controller;

import java.util.Arrays;

public class ThreadMatriz extends Thread {
	
	private int [][] dados;
	private int i;
	
	public ThreadMatriz (int i) {				
		this.i = i;
		this.dados = new int [3][5];
		}
	
	public void loadArr(int i){	
			for (int x = 0; x <5; x++) {
				dados[i][x]=(int)(Math.random() * 10);
			}
		}

	public void run () {
		int soma=0;
	
		for (int x = 0; x <5; x++) {
			soma+=dados[i][x];
			
		}
			int tid = (int) threadId();
			System.out.println("Thread# "+tid+"; linha "+i+"; resultado "+soma);
			System.out.println(Arrays.toString(dados[i]));
	}
	
}
