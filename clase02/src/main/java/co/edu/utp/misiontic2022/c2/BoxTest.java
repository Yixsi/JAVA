package co.edu.utp.misiontic2022.c2;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.width = 3;
        box1.height = 2;
        box1.depth = 6;
        Box box2 = new Box(4, 4, 4);

        System.out.println("El volúmen de la caja 1 es: "+ box1.volumeBox());
        System.out.println("El volúmen de la caja 2 es: "+ box2.volumeBox());
    }
}
