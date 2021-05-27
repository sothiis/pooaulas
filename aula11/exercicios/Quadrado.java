public class Quadrado implements FiguraGeomerica {
    private double lado;

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }
}
