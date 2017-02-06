/**
 * Created by NACHZEHER on 01/02/2017.
 */
public class MainTrangulo {


    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3.2,4);
        Triangulo t2 = new Triangulo(3,4);
        Triangulo t3 = new Triangulo(5,4);

        System.out.println("Perimetro: "+ t1.calcularPerimetro()+" Altura: "+ t1.calcularAltura() +" Area: "+ t1.calcularArea());
        System.out.println("Perimetro: "+ t2.calcularPerimetro()+" Altura: "+ t2.calcularAltura() +" Area: "+ t2.calcularArea());
        System.out.println("Perimetro: "+ t3.calcularPerimetro()+" Altura: "+ t3.calcularAltura() +" Area: "+ t3.calcularArea());
    }
}

