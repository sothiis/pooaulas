package exemplo01;
//REGRAS DO QUE FAZ O APP

import java.util.ArrayList;

public class GerenciaFuncionarios {
    // CLASSE QUE CUIDA DO ARRAY LIST
    private ArrayList<Funcionario> listaDeFuncionarios;

    // CONSTRUTOR
    public GerenciaFuncionarios() {
        listaDeFuncionarios = new ArrayList<>();
    }

    public void novoMotorista(String nome, double salario, String carteiraDeMotorista) {
        listaDeFuncionarios.add(new Motorista(nome, salario, carteiraDeMotorista));
    }

    public void novoGerente(String nome, double salario, int numeroFuncionarios) {
        listaDeFuncionarios.add(new Gerente(nome, salario, numeroFuncionarios));
    }

    public void novoEstoquista(String nome, double salario, int numeroHorasTrabalhada) {
        listaDeFuncionarios.add(new Estoquista(nome, salario, numeroHorasTrabalhada));
    }

    public String listarFuncionarios() {
        String saida = "";
        for (Funcionario funcionario : listaDeFuncionarios) {
            saida += funcionario.getDados() + "\n";
        }
        return saida;
    }


    public String buscarNome(String nome) {
        for (Funcionario funcionario : listaDeFuncionarios) {
            if(funcionario.getNome().equals(nome)) {
                return funcionario.getDados();
            }
        }
        return "Não encontrado.";
    }
        
    }

