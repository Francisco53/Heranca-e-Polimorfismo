package view;

import model.Comissao;
import model.Funcionario;
import model.FuncionarioEnsinoBasico;
import model.FuncionarioEnsinoMedio;
import model.FuncionarioGraduacao;
import model.Gerente;
import model.Supervisor;
import model.Vendedor;

public class Empresa {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[10];

        int ensinoBasicoCount = 4;
        int ensinoMedioCount = 4;
        int graduacaoCount = 2;
        
        int gerenteCount = 1;
        int supervisorCount = 2;
        int vendedorCount = 7;
        
        Comissao[] comissoes = new Comissao[10];
        
        for (int i = 0; i < 10; i++) {
            if (gerenteCount > 0) {
            	comissoes[i] = new Gerente();
                gerenteCount--;
            } else if (supervisorCount > 0) {
            	comissoes[i] = new Supervisor();
                supervisorCount--;
            } else if (vendedorCount > 0) {
            	comissoes[i] = new Vendedor();
                vendedorCount--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (ensinoBasicoCount > 0) {
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "" + (i + 1), comissoes[i], "Escola " + (i + 1));
                ensinoBasicoCount--;
            } else if (ensinoMedioCount > 0) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "" + (i + 1), comissoes[i], "Escola " + (i + 1), "Escola " + (i + 2));
                ensinoMedioCount--;
            } else if (graduacaoCount > 0) {
                funcionarios[i] = new FuncionarioGraduacao("Funcionario " + (i + 1), "" + (i + 1),  comissoes[i], "Escola " + (i + 1), "Escola " + (i + 2), "Universidade " + (i + 3));
                graduacaoCount--;
            }
        }

        double salarioTotal = 0.0;
        double salarioTotalBasico = 0.0;
        double salarioTotalMedio = 0.0;
        double salarioTotalGraduacao = 0.0;

        for (Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.getRendaTotal();

            if (funcionario instanceof FuncionarioGraduacao) {
            	System.out.println("** Funcionario com Graduacao **");
            	System.out.println("Salário base: " + funcionario.getRendaBasica());
                System.out.println(funcionario.toString());
                System.out.println("--------------------------------------");
                salarioTotalGraduacao += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
            	System.out.println("** Funcionario com Ensino Medio **");
            	System.out.println("Salário base: " + funcionario.getRendaBasica());
                System.out.println(funcionario.toString());
                System.out.println("--------------------------------------");
                salarioTotalMedio += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
            	System.out.println("** Funcionario com Ensino Basico **");
            	System.out.println("Salário base: " + funcionario.getRendaBasica());
                System.out.println(funcionario.toString());
                System.out.println("--------------------------------------");
                salarioTotalBasico += funcionario.getRendaTotal();
            }
        }

        System.out.println("Custos totais da empresa com salários: R$" + salarioTotal);
        System.out.println("Custos totais da empresa com salários de Ensino Básico: R$" + salarioTotalBasico);
        System.out.println("Custos totais da empresa com salários de Ensino Médio: R$" + salarioTotalMedio);
        System.out.println("Custos totais da empresa com salários de Graduação: R$" + salarioTotalGraduacao); 
	}
}
