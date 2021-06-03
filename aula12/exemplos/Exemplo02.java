package exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número:");
        try {
            numero = Integer.parseInt(entrada.nextLine());
            System.out.println("Você digitou: " + numero);
        } catch (InputMismatchException excecao) {
            System.out.println("Entrada de dados inválida.");
        } catch (NumberFormatException excecao) {
            System.out.println("Erro de digitação.");
        } catch (Exception exececao) { // exececao variavel local
            // exececao generica
            System.out.println("Erro:  " + exececao.getMessage());
        } finally {
            System.out.println("Fechando as conexões...");
            entrada.close(); // executa dando certo ou errado
        }

        System.out.println("Final do programa.");

    }
}
