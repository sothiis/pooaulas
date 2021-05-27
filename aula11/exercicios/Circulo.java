public class Circulo implements FiguraGeomerica {
    private double raio;
    private final double PI = 3.1415;

    @Override
    public String getNomeFigura() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * PI * raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

}
