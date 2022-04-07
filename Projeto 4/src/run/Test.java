package run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Test {

	public static void main(String[] args) {

		Random r = new Random();
		int cont = 0;
		
		int[][] matrizA = new int[2][2];
		int[][] matrizB = new int[2][2];
		ArrayList<int[][]> matrizes = new ArrayList<int[][]>();
		ArrayList<int[][]> Multmatrizes = new ArrayList<int[][]>();

		
		preencher(matrizA, matrizes, r);
		
		while(cont < 100) {
		mult(matrizA, matrizB, Multmatrizes, matrizes, cont);
		cont+=2;
		}
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizes.get(0)[i][j]+ " ");;
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizes.get(1)[i][j]+ " ");;
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(Multmatrizes.get(0)[i][j]+ " ");;
			}
			System.out.println();
		}
		
	}
	
	public static void mult(int[][] matrizA, int[][]matrizB, ArrayList<int[][]> Multmatrizes,ArrayList<int[][]> matrizes,int cont) {
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				for (int k = 0; k < 2; k++) 
				{
					matrizB[i][j] += matrizes.get(cont)[i][k] * matrizes.get(cont+1)[k][j];
				}
			}	
		}
		Multmatrizes.add(matrizB);
	}
	
	public static void preencher(int[][] matrizA,ArrayList<int[][]> matrizes, Random r) {
		for (int a = 0; a < 100; a++) {
			matrizA = new int[2][2];
			for (int i = 0; i < 2; i++) 
			{
				for (int j = 0; j < 2; j++) 
				{
					
					matrizA[i][j] = r.nextInt(10);
				}
				
			}
			matrizes.add(matrizA);
		}

	}

}
