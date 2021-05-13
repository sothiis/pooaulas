package exemplo01;

public class Gerente extends Funcionario {
    // CLASSE BASEADA NO FUNCIONARIO

    private int numeroFuncionarios;


    // GERENTE PRECISA CHAMAR CONSTRUTOR DA CLASSE FUNCIONARIO

    public Gerente(String nome, double salario, int numeroFuncionarios) {
        super(nome, salario);
        this.numeroFuncionarios = numeroFuncionarios;
        // CLASSE SUPER É A CLASSE FUNCIONARIO
    }

    public Gerente(String nome) {
        super(nome, 0);
    }

    @Override //SOBREESCREVENDO O METODO DA CLASSE FUNCIONARIO
    public String getDados() {
      return "Gerente:" + getNome() + " - " + getSalario() +  numeroFuncionarios;
    }

    @Override
    public void reajustaSalario(double taxa) {
        super.reajustaSalario(taxa + 5);
        //GERENTE RECEBE REAJUSTE 5% QUANDO FUNCIONARIO TEM REAJUSTE
        //O SALARIO ESTÁ DEFINIDO NA CLASSE FUNCIONARIO
    }
}