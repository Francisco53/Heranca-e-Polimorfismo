package model;

public class Funcionario {

	private String nome;
	private String codigoFuncional;
	private double rendaBasica = 1000.00;
	private double rendaTotal = rendaBasica;
	private double taxa;
	private Comissoes comissao;
	
	public Funcionario(String nome, String codigoFuncional) {
		setNome(nome);
		setCodigoFuncional(codigoFuncional);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(String codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public double getRendaBasica() {
		return rendaBasica;
	}

	public void setRendaBasica(double rendaBasica) {
		this.rendaBasica = rendaBasica;
	}

	public double getRendaTotal() {
		return rendaTotal;
	}

	public void calculaRendaTotal() {
		if (comissao == null) {
			this.rendaTotal = getRendaTotal() + (getRendaTotal() * getTaxa() / 100);
		} else {
			this.rendaTotal = getRendaTotal() + (getRendaTotal() * getTaxa() / 100) + getComissao().getValorComissao();
		}
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
	    this.taxa = taxa;
	    calculaRendaTotal();
	}

	public Comissoes getComissao() {
		return comissao;
	}

	public void setComissao(Comissoes comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Funcionário: " + getNome() + "\nComissão: " + getComissao().getValorComissao() + "\nSalário total: " + getRendaTotal();
	}
}
