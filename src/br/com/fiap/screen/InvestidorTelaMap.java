package br.com.fiap.screen;

import java.util.*;
import br.com.fiap.model.InvestidorModel;

public class InvestidorTelaMap {

	public static void main(String[] args) {

		Map<String, InvestidorModel> mapInvestidor = new TreeMap<>();
		
		mapInvestidor.put("Riane", new InvestidorModel(1, "Riane"));
		mapInvestidor.put("Rubi", new InvestidorModel(2, "Rubi"));
		mapInvestidor.put("Sant", new InvestidorModel(3, "Sant"));
		
		//SE contém: (true or false)
		System.out.println(mapInvestidor.containsKey("Riane"));
		
		//printa o valor encontrado de acordo com a pesquisa realizada:
		InvestidorModel model = mapInvestidor.get("Riane");
		System.out.println(model);
		
		for(String chaves : mapInvestidor.keySet()) {
			System.out.println(chaves);
		}
	}

}
