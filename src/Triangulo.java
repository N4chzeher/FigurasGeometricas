/**
 * Created by NACHZEHER on 01/02/2017.
 */
public class Triangulo {

    private double ladoAB;
    private double base;

    public Triangulo(double ladoAB, double base) {
        this.ladoAB = ladoAB;
        this.base = base;
    }

    public double getLadoAB() {
        return ladoAB;
    }

    public void setLadoAB(double ladoAB) {
        this.ladoAB = ladoAB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calcularPerimetro(){
        return 2*ladoAB+base;
    }

    public double calcularAltura(){
        double a = Math.pow(ladoAB,2);
        double b = Math.pow((base/2),2);
        double h = Math.sqrt(a-(b/4));
        return h;
    }

    public double calcularArea(){
        double area = (base * calcularAltura()  )/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "ladoAB=" + ladoAB +
                ", base=" + base +
                '}';
    }
}
