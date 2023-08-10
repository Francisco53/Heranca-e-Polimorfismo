package model;

public class FuncionarioVendedor extends Funcionario {

    public FuncionarioVendedor(String nome, String codigoFuncional) {
        super(nome, codigoFuncional);
        super.setComissao(250);
    }
}