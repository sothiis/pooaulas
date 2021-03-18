package exercicios;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    //int retorno;
    //retorno = encontrarMax(28, 3);

    Scanner entrada = new Scanner(System.in);
    int a, b;

    System.out.println("Informe os dois valores: ");
    a = entrada.nextInt();
    b = entrada.nextInt();
    System.out.println("Maior valor é " + encontrarMax(a, b));

    entrada.close();

  }

  static int encontrarMax(int n1, int n2) {
    if (n1 > n2) {
      return n1;
    }
    return n2;
  }
}
