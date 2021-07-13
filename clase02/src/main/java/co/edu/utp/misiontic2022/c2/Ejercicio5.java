package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio5 {
    /*Programa que lea la longitud de los catetos de un triángulo rectángulo y
    calcule la longitud de la hipotenusa según el teorema de Pitágoras.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del cateto opuesto en cm: ");
        double c_op = sc.nextDouble();
        
        System.out.println("Ingrese el valor del cateto adyacente en cm:");
        double c_ad = sc.nextDouble();
        sc.close();

        System.out.printf("El valor de la hipotenusa es de %.3f cm.", hypotenuse(c_op, c_ad));
    }
    static double hypotenuse(double a, double b){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }
}
