package model;

public class Funcionario {

	private String nome;
	private String codigoFuncional;
	private double rendaBasica = 1000.00;
	private double rendaTotal = rendaBasica;
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

	public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public void setRendaTotal() {
		this.rendaTotal = getRendaBasica() + comissao;
	}
	

}
