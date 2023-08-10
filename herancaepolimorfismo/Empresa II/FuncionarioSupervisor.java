package model;

public class FuncionarioSupervisor extends Funcionario {

    public FuncionarioSupervisor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        super.setComissao(600);
    }
}