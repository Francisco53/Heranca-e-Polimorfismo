package model;

public class Funcionario {

	private String nome;
	private String codigoFuncional;
	private double rendaBasica = 1000.00;
	private double rendaTotal = rendaBasica;
	private double taxa;
	private double comissao = 0.0;
	
	@Override
	public String toString() {
	    return "Nome: " + getNome() + "\nComissão: R$" + getComissao() + "\nSalário Total: R$" + getRendaTotal() + "\n";
	}

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

	public void setRendaTotal(double rendaTotal) {
		this.rendaTotal = getRendaBasica() + (getRendaBasica() * getTaxa() / 100) + comissao;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
