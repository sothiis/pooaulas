package exercicios.calculadora;
//Classe calculadora
//Atributo operadores e resultado
// Metodos as operações

public class calculadora {
   private int n1, n2;
   private char operador;

public calculadora() {
    operador = ' ';

}

public int somar(int valor1, int valor2){
    n1 = valor1;
    n2 = valor2;
    operador = '+';
    return n1 + n2;
}

public String exibir(){
   int resultado;
   switch (operador) {
       case '+':
           resultado = n1 + n2;
           break;
   
       default:
         resultado = 0;
           break;
   }

    return n1 + operador + n2 + "=";
    }

}