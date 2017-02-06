/**
 * Created by NACHZEHER on 01/02/2017.
 */
public class Rectangulo {

    private double base;
    private double altura;
    private String color;

    public Rectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public double calcularDiagonal(boolean decimales) {
        double a = Math.pow(altura, 2);
        double b = Math.pow(base, 2);
        double diagonal = Math.sqrt(a + b);
        double diagonalSinDecimales = (int) diagonal;
        if (decimales) {
            return diagonal;
        } else {
            return diagonalSinDecimales;
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
