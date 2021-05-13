package exemplo01;

public class Estoquista extends Funcionario {
    //FUNCIONARIO
    //GANHA POR HORA
    //CALCULAR QUANTAS HORAS TRABALHOU NO MES
    //NUMERO INTEIRO
    //OPÇÃO NOVO ESTOQUISTA
    private int numeroHorasTrabalhada;
    
    public Estoquista(String nome, double salario, int numeroHorasTrabalhada){
        super(nome, salario);
        this.numeroHorasTrabalhada = numeroHorasTrabalhada;
    }

    @Override
    public String getDados() {
        return "Estoquista:" + getNome() + " - " + getSalario() + numeroHorasTrabalhada;
    }


}
