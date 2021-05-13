package exercicios.exemplo01;

public class Placar {
    String time1;
    String time2;
    int gol1, gol2;


//public Placar (String time, int resultado) { //construtor1 
  //  time1 = "Time da Casa";
   // time2 = "Visitante";
 
//}
//OU

public Placar () { //chamando construtor 
    this("Time da casa", "Visitante",0,0)
; 
}

public Placar (String time1, String time2, int gol1, int gol2){ //construtor2
    this.time1 = time1;
    this.time2 = time2;
    this.gol1 = gol1;
    this.gol2 = gol2;
}

public Placar(String time1, String time2) { //construtor3
   // this.time1 = time1;
   // this.time2 = time2;
    this (time1, time2, 0,0);
}

//jeito1
//public String exibir() {
   //   return (time1 +  gol1 + "x" +  gol2 +  time2);
//}

//jeito2
//public void exibir()
    //System.out.println( time1 +  gol1 + "x" +  gol2 +  time2);


public String toString() { //é um método
    return (time1 +  gol1 + "x" +  gol2 +  time2);
    }
}