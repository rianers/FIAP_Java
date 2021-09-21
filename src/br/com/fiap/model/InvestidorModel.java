package br.com.fiap.model;

public class InvestidorModel implements Comparable<InvestidorModel> {

	private int investidorId;
	private String nome;
	private String cpf;
	private double patrimonio;
	private String perfilRisco;

	public InvestidorModel() {
		super();
	}

	public InvestidorModel(int id, String nome) {
		investidorId = id;
		this.nome = nome;
	}

	public InvestidorModel(int investidorId, String nome, String cpf, double patrimonio, String perfilRisco) {
		super();
		this.investidorId = investidorId;
		this.nome = nome;
		this.cpf = cpf;
		this.patrimonio = patrimonio;
		this.perfilRisco = perfilRisco;
	}

	public int getInvestidorId() {
		return investidorId;
	}

	public void setInvestidorId(int investidorId) {
		this.investidorId = investidorId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getPerfilRisco() {
		return perfilRisco;
	}

	public void setPerfilRisco(String perfilRisco) {
		this.perfilRisco = perfilRisco;
	}

	@Override
	public String toString() {
		return "InvestidorModel [investidorId=" + investidorId + ", nome=" + nome + ", cpf=" + cpf + ", patrimonio="
				+ patrimonio + ", perfilRisco=" + perfilRisco + "]";
	}

	@Override
	public int compareTo(InvestidorModel o) {
		
		int retorno = 0;

		if (o.getNome().equals(this.getNome())) {
			retorno = Integer.compare(this.investidorId, o.getInvestidorId());
		}

		else {
			retorno = this.nome.compareTo(o.getNome());
		}

		return retorno;
	}
}
