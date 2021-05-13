package exercicios.calculadora;

public class AppCalculadora {
    public static void main(String[] args) {
        
        calculadora calc = new calculadora();

        int s = calc.somar(10,35);
        System.out.println(s);

        System.out.println(calc.exibir());
    }
}
