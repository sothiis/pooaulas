public class App {
    public static void main(String[] args) {
      Quadrado q = new Quadrado(5);
      Circulo c =  new Circulo(5);

      System.out.println("Área do quadrado: " + q.getArea());
      System.out.println("Perimetro do quadrado: " + q.getPerimetro());
      System.out.println("Área do circulo: " + c.getArea());
      System.out.println("Perimetro do circulo: " + c.getPerimetro());
    }  
}
