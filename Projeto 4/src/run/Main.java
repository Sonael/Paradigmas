package run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Matriz> matrizes = new ArrayList<Matriz>();
		ArrayList<Matriz> Multmatrizes = new ArrayList<Matriz>();
		int[][] matrizC =new int[2][2];
		Matriz matrizResul = new Matriz();
		
		for (int i = 0; i < 100; i++) {
			Matriz matriz = new Matriz();
			matriz.preencher();
			matrizes.add(matriz);
		}
		
		
				
		//Continuar multiplicação de matrizes
		
		
		for (int a = 0; a < matrizes.size(); a = a+2) {
			for (int i = 0; i < 2; i++) 
			{
				for (int j = 0; j < 2; j++) 
				{
					for (int k = 0; k < 2; k++)
					{
						matrizC[i][j] += (matrizes.get(a).getMatriz()[i][k]) * (matrizes.get(a+1).getMatriz()[k][j]);
						
					}
				}
			}
			matrizResul.setMatriz(matrizC);
			Multmatrizes.add(matrizResul);
		}
		

		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizes.get(0).getMatriz()[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizes.get(1).getMatriz()[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				for (int k = 0; k < 2; k++)
				{
					System.out.println((matrizes.get(0).getMatriz()[i][k]) * (matrizes.get(1).getMatriz()[k][j])+ " ");
					
				}
				
			}
			System.out.println();
		}
	}

}
