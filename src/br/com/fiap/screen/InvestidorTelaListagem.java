package br.com.fiap.screen;

import br.com.fiap.dao.InvestidorDAO;
import br.com.fiap.model.InvestidorModel;
import java.util.*;

public class InvestidorTelaListagem {

	public static void main(String[] args) {
		
		System.out.println("Tela de investidor");
		
		List<InvestidorModel> listaInvestidor = new InvestidorDAO().listAll();
		
		for(InvestidorModel investidorModel : listaInvestidor) {
			System.out.println(investidorModel.toString());
		}
		
		System.out.println("Listando os investidores");
	}
}
