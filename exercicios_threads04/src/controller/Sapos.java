package controller;

public class Sapos extends Thread {
	private int sapo[];
	private int pulo;
	private int pista=10;
	private int i;
	private String podium="";
	StringBuilder s = new StringBuilder("Colocação");
	int x=1;
	
	public Sapos (int sapo) {
		this.sapo= new int [5];
		this.i = sapo;
	}

	@Override
	public void run () {
		pulo(i);
	}
	
	public void pulo (int id) {


		while (sapo[i] < pista) {
			
			
			pulo= (int)(Math.random()*5);
			sapo[i]+=pulo;
			System.out.println("Sapo "+i+" pulou "+pulo+
					" metros e percorreu "+sapo[i]+" metros total");
			
	
	
	
		
				
		
		
					
				
		for (int z=0; z<5; z++) {
			System.out.println(s);
		}
	}
}
