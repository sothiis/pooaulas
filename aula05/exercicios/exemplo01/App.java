package exercicios.exemplo01;

public class App {
    
    public static void main(String[] args) {
        Placar p1 = new Placar ();
        Placar p2 = new Placar("Palmeiras", "São Paulo");
        Placar p3 = new Placar ("Palmeiras", "São Paulo", 1, 2);


        System.out.println( p1.toString() );
        System.out.println( p2.toString() );
        System.out.println( p3.toString() );


        //jeito 1
        //System.out.println( p1.exibir() );
        //System.out.println( p2.exibir() );
        //System.out.println( p3.exibir() );


        //jeito2
        // p1.exibir();
        // p2.exibir();
        //p3.exibir();
      

    }

}
