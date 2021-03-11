import java.util.Scanner;

/**
 * exercicio02
 */
public class exercicio02 {
 public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    double massaInicial, massaFinal;
    int tempo;

    System.out.println("Digita a massa inicial");
    massaInicial = entrada.nextDouble();

    
    massaFinal = massaInicial; //incialização
    tempo = 0;
    while(massaFinal >= 0.5) {  //condição
        massaFinal /= 2; //passo
        tempo += 50;
    }

    System.out.println("A massa incial  é  "+  massaInicial);
    System.out.println("A massa final  é  " +  massaFinal);
    System.out.println("Tempo gasto  " + tempo);

    entrada.close();

 }
    
}