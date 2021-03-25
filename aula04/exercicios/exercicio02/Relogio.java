package exercicios.exercicio02;

public class Relogio {
    //atributos 
    //hora
    //minutos
    //segundos 
    int hora, min, seg;


    void mostrar() {
        System.out.printf("%d:%d:%d\n",  hora ,  min,  seg);
        //printf (FORMATO, VARIAVEIS)
        // %d inteiro, %f casa decimal 
        // %2d = 2 casas 
    }
}
