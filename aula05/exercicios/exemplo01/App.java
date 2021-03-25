package exercicios.exemplo01;

public class App {
    
    public static void main(String[] args) {
        Placar p1 = new Placar(null, 0);
        Placar p2 = new Placar("Palmeiras", "São Paulo");
        Placar p3 = new Placar ("Palmeiras", "São Paulo", 1, 2);

        
        p1.exibir();
        p2.exibir();
        p3.exibir();
      

    }

}
