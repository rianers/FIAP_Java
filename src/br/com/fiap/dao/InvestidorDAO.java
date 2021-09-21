package br.com.fiap.dao;

import br.com.fiap.model.InvestidorModel;
import java.util.*;

public class InvestidorDAO {

	public List<InvestidorModel> listAll() {
		
		List<InvestidorModel> listaInvestidor = new ArrayList<>();
		listaInvestidor.add(new InvestidorModel(1, "Riane"));
		listaInvestidor.add(new InvestidorModel(2, "Rubio"));
		listaInvestidor.add(new InvestidorModel(3, "Santo"));
		
		return listaInvestidor;
	}
}
