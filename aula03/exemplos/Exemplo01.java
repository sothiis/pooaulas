package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Meu programa v 0.1");
        linha(); // chamada de método
                 // executa o "linha" abaixo
        System.out.println("10/03/2021"); // data de hoje
        linha2(10);
        linha2(28);
        linha3(10,'#');
        linha3(20,'*');
    }

    static void linha() {
        System.out.println("---------------");
    }
    static void linha2(int tamanho) { //'tamanho' é um paramentro do método, quantos caracteres por na tela
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");   
        }
        System.out.println(); 
    }

    static void linha3(int tamanho, char tipo) { //2 parametros //char 1 caracter, string "" char ''
        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);   
        }
        System.out.println(); 
    }



}