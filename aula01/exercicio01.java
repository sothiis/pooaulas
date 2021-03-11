import java.util.Scanner;

/**
 * exercicio01
 * class - montar classe
 * main - gerar linha public static
 * sysou - gerar system.out
 */
public class exercicio01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        double custoDeFabrica, imposto, valorDistribuidor, valorDeVenda;

        System.out.println("Digite o custo de fábrica ");
        custoDeFabrica = teclado.nextDouble();
        
        valorDistribuidor = custoDeFabrica * 0.28;
        imposto = custoDeFabrica * 0.45;
        valorDeVenda = custoDeFabrica + valorDistribuidor + imposto;

        System.out.println("Valor final de venda " + valorDeVenda);
        System.out.println("Imposto " + imposto);
        
        teclado.close();
    }
}