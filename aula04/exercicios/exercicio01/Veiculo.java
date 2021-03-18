package exercicios.exercicio01;

public class Veiculo {

    String marca;
    String modelo;
    double consumo;
    
    void apresentar() {
        System.out.println ("O carro é " + marca + modelo);
    }

    double obterConsumo() {
        return consumo;
    }

    
}
