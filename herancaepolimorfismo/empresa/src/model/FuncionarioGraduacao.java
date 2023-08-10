package model;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

	private String universidade;
	
	public FuncionarioGraduacao(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio, String universidade) {
		super(nome, codigoFuncional, comissao, escolaEnsinoBasico, escolaEnsinoMedio);
		setUniversidade(universidade);
		super.setTaxa(100);
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
}
