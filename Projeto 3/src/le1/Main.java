package le1;

import le1.plp.expressions1.Programa;
import le1.plp.expressions1.expression.ExpDiv;
import le1.plp.expressions1.expression.ExpMult;
import le1.plp.expressions1.expression.ValorInteiro;

public class Main {

	public static void main(String[] args) {
		
		//Testes usando as classes criadas. 
		
		
		ValorInteiro valor1 = new ValorInteiro(30);
		ValorInteiro valor2 = new ValorInteiro(10);

	
		//Expressão Mult
		ExpMult expmult = new ExpMult(valor1, valor2);
		Programa programa1 = new Programa(expmult);
		programa1.executar();

		
		//expressão Div
		ExpDiv expdiv = new ExpDiv(valor1, valor2);
		Programa programa2 = new Programa(expdiv);
		programa2.executar();
				
	}

}
