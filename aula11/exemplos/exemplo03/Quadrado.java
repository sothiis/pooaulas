public class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}

// perimetro = soma dos lados