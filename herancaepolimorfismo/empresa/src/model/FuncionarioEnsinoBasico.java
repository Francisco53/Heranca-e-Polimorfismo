package model;

public class FuncionarioEnsinoBasico extends Funcionario {

	private String escolaEnsinoBasico;
	
	public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaEnsinoBasico) {
		super(nome, codigoFuncional);
		setEscolaEnsinoBasico(escolaEnsinoBasico);
		super.setTaxa(10);
	}

	public String getEscolaEnsinoBasico() {
		return escolaEnsinoBasico;
	}

	public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
		this.escolaEnsinoBasico = escolaEnsinoBasico;
	}
}
