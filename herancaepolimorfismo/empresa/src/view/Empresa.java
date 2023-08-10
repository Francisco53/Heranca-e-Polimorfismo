package view;

import model.Funcionario;
import model.FuncionarioEnsinoBasico;
import model.FuncionarioEnsinoMedio;
import model.FuncionarioGraduacao;

public class Empresa {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[10];

        int ensinoBasicoCount = 4;
        int ensinoMedioCount = 4;
        int graduacaoCount = 2;

        for (int i = 0; i < 10; i++) {
            if (ensinoBasicoCount > 0) {
                funcionarios[i] = new FuncionarioEnsinoBasico("Funcionario " + (i + 1), "" + (i + 1), "Escola " + (i + 1));
                ensinoBasicoCount--;
            } else if (ensinoMedioCount > 0) {
                funcionarios[i] = new FuncionarioEnsinoMedio("Funcionario " + (i + 1), "" + (i + 1), "Escola " + (i + 1), "Escola " + (i + 2));
                ensinoMedioCount--;
            } else if (graduacaoCount > 0) {
                funcionarios[i] = new FuncionarioGraduacao("Funcionario " + (i + 1), "" + (i + 1),  "Escola " + (i + 1), "Escola " + (i + 2), "Universidade " + (i + 3));
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
                System.out.println(funcionario.toString());
                salarioTotalGraduacao += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
            	System.out.println(funcionario.toString());
                salarioTotalMedio += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
            	System.out.println(funcionario.toString());
                salarioTotalBasico += funcionario.getRendaTotal();
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Custos totais da empresa com salários: R$" + salarioTotal);
        System.out.println("Custos totais da empresa com salários de Ensino Básico: R$" + salarioTotalBasico);
        System.out.println("Custos totais da empresa com salários de Ensino Médio: R$" + salarioTotalMedio);
        System.out.println("Custos totais da empresa com salários de Graduação: R$" + salarioTotalGraduacao); 
	}
}
