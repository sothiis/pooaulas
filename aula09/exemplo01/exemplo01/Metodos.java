package exemplo01;

public class Metodos {

    private int x;
    private static int comum = 0;
    public int soma(int a, int b) {
        return a + b;
    }

    public int getX(){
        return x;
    }

    public static void setComum(int valor){
        comum = valor;
    }

    public static int getComum(){
        return comum;
    }
    
}
