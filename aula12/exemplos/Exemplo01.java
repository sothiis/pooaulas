package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exeções
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean valida = false;

        do {
            System.out.println("Digite um número:");
            try {
                numero = entrada.nextInt();
                // numero = Integer.parseInt(entrada.nextLine()); 
                //transformar de String para numero
                System.out.println("Você digitou: " + numero);
                valida = true;
            } catch (InputMismatchException excecao) {
                System.out.println("Entrada de dados inválida.");
                entrada.nextLine(); // para não ir a
            } // quando a pessoa digita 4,5 e não 4
        } while (!valida); // not true

        System.out.println("Final do programa.");

        entrada.close();
    }
}
