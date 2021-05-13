package exercicios.exercicio02;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio (5, 25, 45);



       /*relogio.hora = 21;
        relogio.min = 40;
        relogio.seg = 12;*/
        System.out.println("Hora atual: " + relogio.getHora());
        relogio.setHora(-6);
        relogio.mostrar();
    }

    



}
