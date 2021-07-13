package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio8 {
    /*Programa que lea dos números por teclado y muestre el
    resultado de la división del primer número por el segundo. Se
    debe comprobar que el divisor no puede ser cero.*/
    public static void main(String[] args) {
        division();
    }
    static void division(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa un número:");
        double n1 = sc.nextDouble();
        
        System.out.println("Ingresa otro número:");
        double n2 = sc.nextDouble();
        sc.close();

        if(n2 != 0){
            System.out.printf("%.1f/%.1f = %.1f", n1, n2, n1/n2);
        } else{
            System.out.println("El divisor debe ser diferente de cero.");
        }
    }
}
