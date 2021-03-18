package exercicios.exercicio01;

public class AppVeiculo {

    public static void main(String[] args) {
        Veiculo p = new Veiculo();
        Veiculo p2 = new Veiculo();
        String consumo;
    
        p.marca = "Chevrolet";
        p.modelo = "Agile";
        p.consumo = 7.4;
        p.apresentar();
        System.out.println("Consumo = " +p.consumo);

        
    }
    
}
