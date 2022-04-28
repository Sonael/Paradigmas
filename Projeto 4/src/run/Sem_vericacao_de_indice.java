package run;

import java.util.ArrayList;
import java.util.Random;

public class Sem_vericacao_de_indice {

	public static void main(String[] args) {
		
		long tempoInicial = System.currentTimeMillis();
		
		Random r = new Random();
		int cont = 0;
		
		int[][] matrizA = new int[50][50];
		int[][] matrizB = new int[matrizA.length][matrizA.length];
		ArrayList<int[][]> matrizes = new ArrayList<int[][]>();
		ArrayList<int[][]> Multmatrizes = new ArrayList<int[][]>();

		
		preencher(matrizA, matrizes, r);
		
		while(cont < 100) {
		mult(matrizA, matrizB, Multmatrizes, matrizes, cont);
		cont+=2;
		}
		
		System.out.println("Tamanho do vetor das matrizes: "+ matrizes.size());
		System.out.println("Tamanho do vetor das matrizes resultantes: "+ Multmatrizes.size());
		long tempoFinal = System.currentTimeMillis() - tempoInicial;
		System.out.println("o metodo executou em " + tempoFinal+ "ms");
		
	}
	
	//Faz a multiplicação das matrizes e adiciona dentro do array Multmatrizes
	public static void mult(int[][] matrizA, int[][]matrizB, ArrayList<int[][]> Multmatrizes,ArrayList<int[][]> matrizes,int cont) {
		matrizB = new int[matrizB.length][matrizB.length];
		for (int i = 0; i < matrizB.length; i++) 
		{
			for (int j = 0; j < matrizB.length; j++) 
			{
				for (int k = 0; k < matrizB.length; k++) 
				{
					matrizB[i][j] += matrizes.get(cont)[i][k] * matrizes.get(cont+1)[k][j];
				}
			}	
		}
		Multmatrizes.add(matrizB);
	}
	
	//Preenche a matriz com numeros aleatorios e adiciona no array Matrizes.
	public static void preencher(int[][] matrizA,ArrayList<int[][]> matrizes, Random r) {
		for (int a = 0; a < 100; a++) {
			matrizA = new int[matrizA.length][matrizA.length];
			for (int i = 0; i < matrizA.length; i++) 
			{
				for (int j = 0; j < matrizA.length; j++) 
				{
					
					matrizA[i][j] = r.nextInt(10);
				}
				
			}
			matrizes.add(matrizA);
		}

	}

}
