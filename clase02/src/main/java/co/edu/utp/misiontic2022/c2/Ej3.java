package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        sc.close();

        //int result = increase_value(dato);
        System.out.printf("El doble de %d es %.0f y el triple es %.0f", dato, Math.pow(dato, 2), Math.pow(dato, 3));
    }
}
