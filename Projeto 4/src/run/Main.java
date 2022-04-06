package run;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList<Matriz> matrizes = new ArrayList<Matriz>();
		
		for (int i = 0; i < 100; i++) {
			Matriz matriz = new Matriz();
			matriz.preencher();
			matrizes.add(matriz);
		}
		
		for (int i = 0; i < 5; i++) {
			matrizes.get(i).printar();
			System.out.println();
		}
		
		System.out.println(matrizes.size());
				
		//Continuar multiplicação de matrizes
	}

}
