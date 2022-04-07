package run;

import java.util.Random;

public class Matriz {
	Random r = new Random();
	int[][] matriz;

	public Matriz() {
		super();
		this.matriz = new int[2][2];
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	
	public void preencher()
	{
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
	}
	
	public void preenchercomverificacao()
	{
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				try {
					matriz[i][j] = r.nextInt(10);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Fora do index");
				}
			}
		}
	}
	
	
	public void printar()
	{
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
