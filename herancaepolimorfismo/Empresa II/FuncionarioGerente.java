package model;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        super.setComissao(1500);
    }
}