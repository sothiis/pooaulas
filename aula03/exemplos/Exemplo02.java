package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int retorno;

        retorno = soma(5,15);

        System.out.println("Soma = " + retorno);
    }
 
    static int soma(int a, int b) { //deve retornar um número inteiro
        int resultado; //só existe dentro do método //variavel local
      
        resultado = a + b;
        return resultado;
    }

}
