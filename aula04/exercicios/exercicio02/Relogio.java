package exercicios.exercicio02;

import javax.swing.text.Segment;

public class Relogio {
    //atributos 
    //hora
    //minutos
    //segundos 
   private int hora, min, seg;

    public Relogio(int hora, int min, int seg){
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }
    
    public void setHora(int hora){//set = o objetivo é alterar o valor do atributo, é uma convenção
        if (hora>=0 && hora <=24) {
            this.hora =  hora;
           }
    }

    public void setMin(int min){//set = o objetivo é alterar o valor do atributo, é uma convenção
        if (min>=0 && min <=60) {
            this.min =  min;
           }
    }

    public void setSeg(int seg){//set = o objetivo é alterar o valor do atributo, é uma convenção
        if (seg>=0 && seg <=60) {
            this.seg = seg;
           }
    }

    public Relogio(int i, double d) {
    }



    public int getHora(){// = obter o valor = get
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void mostrar() {
        System.out.printf("%d:%d:%d\n",  hora ,  min,  seg);
        //printf (FORMATO, VARIAVEIS)
        // %d inteiro, %f casa decimal 
        // %2d = 2 casas 
    }
}
