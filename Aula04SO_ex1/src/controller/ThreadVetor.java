package controller;

public class ThreadVetor extends Thread {
	
	private int vetor[], numero;

	public ThreadVetor(int vetor[], int numero) {
		this.vetor = vetor;
		this.numero = numero;
	}
	
	@Override
	public void run() {
		percorreVetor();
	}

	private void percorreVetor() {
		double tempoInicial, tempoFinal, tempoTotal;

		if (numero == 2) {
			tempoInicial = System.nanoTime();
			for (int i = 0; i < vetor.length; i ++) {
				vetor[i] = 0;
			}
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			
			System.out.println("Vetor com for ==> "+ tempoTotal + "s.");
		} else {
			tempoInicial = System.nanoTime();
			for (int elemento : vetor){
				elemento = 0;
			}
			tempoFinal = System.nanoTime();
			tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			
			System.out.println("Vetor com foreach ==> "+ tempoTotal + "s.");
		}
	}
}
