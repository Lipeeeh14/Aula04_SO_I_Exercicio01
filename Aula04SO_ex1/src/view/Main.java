package view;

import java.util.Random;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		vetor = vetorPreenchido(vetor);
		
		for (int op = 1; op < 3; op++) {
			ThreadVetor tPercorre = new ThreadVetor(vetor, op);
			tPercorre.start();
		}
	}

	private static int[] vetorPreenchido(int[] vetor) {
		Random numero = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = numero.nextInt(100) + 1;
		}
		
		return vetor;
	}

}
