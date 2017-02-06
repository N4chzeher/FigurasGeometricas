/**
 * Created by NACHZEHER on 01/02/2017.
 */
public class MainRectangulo {

    public static void main(String[] args) {
        Rectangulo stucom = new Rectangulo(3.5,2.4,"Azul");
        Rectangulo asus = new Rectangulo(4,2.3,"Rojo");

        double diagonalStucom = stucom.calcularDiagonal(false);

        System.out.println(diagonalStucom);
    }
}
