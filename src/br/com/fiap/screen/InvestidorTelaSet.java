package br.com.fiap.screen;

import java.util.*;

import br.com.fiap.model.InvestidorModel;

public class InvestidorTelaSet {

	public static void main(String[] args) {

		// TreeSet: ordena de forma alfabética
		// HashSet: mais rápido, não se importa com a ordem 
		// List: Devolve a lista na ordem que foi informada a ele

		/* Set<String> listaStrings = new TreeSet<>();
		listaStrings.add("Riane");
		listaStrings.add("Rubi");
		listaStrings.add("Abi"); 
		*/
		
		Set<InvestidorModel> listaInvestidor = new TreeSet<>();
		listaInvestidor.add(new InvestidorModel(1, "Riane"));
		listaInvestidor.add(new InvestidorModel(2, "Rubio"));
		listaInvestidor.add(new InvestidorModel(3, "Santo"));

		for (InvestidorModel investidorModel : listaInvestidor) {
			System.out.println(investidorModel);
		}
	}
}
