package model;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

	private String escolaEnsinoMedio;
	
	public FuncionarioEnsinoMedio(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio) {
		super(nome, codigoFuncional, comissao, escolaEnsinoBasico);
		setEscolaEnsinoMedio(escolaEnsinoMedio);
		super.setTaxa(50);
	}

	public String getEscolaEnsinoMedio() {
		return escolaEnsinoMedio;
	}

	public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
		this.escolaEnsinoMedio = escolaEnsinoMedio;
	}
}
