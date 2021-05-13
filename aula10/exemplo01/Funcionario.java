package exemplo01;

public abstract class Funcionario {
   //BASE PARA TODAS CLASSES
    private String nome;
    private double salario;
    // ATRIBUTOS DA CLASSE

    // METODO INICIALIZA A CLASSE
    // CONSTRUTOR MESMO NOME DA CLASSE

    public Funcionario(){}
    public Funcionario(String nome, double salario) { // PARAMETROS
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String getDados();
    //TORNA O MÉTODO OBRIGATÓRIO EM CLASSES TIPO FUNCIONARIO (EXTENDS)
    //NÃO PODE SER IMPLEMENTADO


    public String getNome() {
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public void reajustaSalario(double taxa){
        salario = salario + salario *  taxa / 100; //10% DO SALARIO

    }

}
