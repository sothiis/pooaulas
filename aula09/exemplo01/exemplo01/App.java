package exemplo01;

public class App {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Metodos metodos2 = new Metodos();
        
      /*   int resposta = metodos.soma(10,5);
        metodos1.getX();
        System.out.println(resposta); */

        System.out.println(Metodos.getComum());
        Metodos.setComum(12);
        System.out.println(Metodos.getComum());
    }
}
