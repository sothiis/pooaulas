package exemplo01;

import java.util.Scanner;

public class AppFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, numeroFunc, horas;
        String nome, tipoCarta;
        double salario;

        GerenciaFuncionarios funcionarios = new GerenciaFuncionarios();

        do {
            System.out.println("1-Novo motorista");
            System.out.println("2-Novo gerente");
            System.out.println("3-Novo estoquista");
            System.out.println("4-Listar funcionários");
            System.out.println("5-Buscar por nome");
            System.out.println("6-Terminar programa");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o salário:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.println("Informe o tipo de carta");
                    tipoCarta = sc.nextLine();
                    funcionarios.novoMotorista(nome, salario, tipoCarta);
                    // INTEGER PARA NÃO DAR ERRO E CONVERTER PARA STRING
                    break;

                case 2:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o salário:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.println("Numero de funcionarios:");
                    numeroFunc = Integer.parseInt(sc.nextLine());
                    funcionarios.novoGerente(nome, salario, numeroFunc);
                    break;

                case 3:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o salário:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.println("horas trabalhadas:");
                    horas = Integer.parseInt(sc.nextLine());
                    funcionarios.novoEstoquista(nome, salario, horas);
                    break;

                case 4:
                    System.out.println(funcionarios.listarFuncionarios());
                    break;

                case 5:
                    System.out.println("Infome o nome");
                    nome = sc.nextLine();
                    System.out.println(funcionarios.buscarNome(nome));
                    break;

                default:
                    System.err.println("Opção inválida");
                    break;
            }
        } while (menu != 6);
        sc.close();

        // GUARDA GERENTES E TODOS FUNCIONARIOS

        /*
         * // METODO ARRAYLIST listaDeFuncionarios.add(new Motorista("Paxx", 1000,
         * "C5")); listaDeFuncionarios.add(new Gerente("Bellinha", 1000, 15));
         * listaDeFuncionarios.add(new Motorista("Roselia", 1000, "B5"));
         * listaDeFuncionarios.add(new Gerente("Nini", 1000, 2));
         * listaDeFuncionarios.add(new Motorista("Célia", 1000, "A2"));
         * 
         * // POLIMORFISMO // MAIS FÁCIL MANUTENÇÃO ASSIM // SÓ CRIAR CLASSE COM NOVOS
         * FUNCIONARIOS for (Funcionario f : listaDeFuncionarios) {
         * f.reajustaSalario(10); }
         * 
         * for (Funcionario f : listaDeFuncionarios) { System.out.println(f.getDados());
         * }
         */

    }
}
