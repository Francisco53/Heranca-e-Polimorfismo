package view;

import model.Funcionario;
import model.Comissao;
import model.GerenteComissao;
import model.SupervisorComissao;
import model.VendedorComissao;
import model.FuncionarioGerente;
import model.FuncionarioVendedor;
import model.FuncionarioSupervisor;

public class Empresa {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[10];

		Comissao gerenteComissao = new GerenteComissao();
		Comissao supervisorComissao = new SupervisorComissao();
		Comissao vendedorComissao = new VendedorComissao();

		for (int i = 0; i < 10; i++) {
		    if (i < 1) { // 10% dos funcionários são gerentes
		        funcionarios[i] = new FuncionarioGerente("Gerente " + (i + 1), "GF" + (i + 1));
		        funcionarios[i].setComissao(gerenteComissao.getAdicional());
		    } else if (i < 3) { // 20% dos funcionários são supervisores
		        funcionarios[i] = new FuncionarioSupervisor("Supervisor " + (i - 1), "SF" + (i - 1));
		        funcionarios[i].setComissao(supervisorComissao.getAdicional());
		    } else { // 70% dos funcionários são vendedores
		        funcionarios[i] = new FuncionarioVendedor("Vendedor " + (i - 5), "VF" + (i - 5));
		        funcionarios[i].setComissao(vendedorComissao.getAdicional());
		    }
		}


		for (Funcionario funcionario : funcionarios) {
			funcionario.setRendaTotal();
		}

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario);
		}

        double salarioTotal = 0.0;
        double salarioGerentes = 0.0;
        double salarioSupervisores = 0.0;
        double salarioVendedor = 0.0;

        for (Funcionario funcionario : funcionarios) {
            salarioTotal += funcionario.getRendaTotal();
            if (funcionario instanceof FuncionarioGerente) {
                salarioGerentes += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioSupervisor) {
                salarioSupervisores += funcionario.getRendaTotal();
            } else if (funcionario instanceof FuncionarioVendedor) {
                salarioVendedor += funcionario.getRendaTotal();
            }
        }

        System.out.println("Custos totais da empresa com salários: R$" + salarioTotal);
        System.out.println("Custos totais da empresa com salários dos Gerentes: R$" + salarioGerentes);
        System.out.println("Custos totais da empresa com salários dos Supervisores: R$" + salarioSupervisores);
        System.out.println("Custos totais da empresa com salários dos Vendedores: R$" + salarioVendedor); 
	}
}
