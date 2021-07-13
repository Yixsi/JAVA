package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio6 {
    //Programa que lea un número entero y muestre si el número es múltiplo de 10
    public static void main(String[] args) {
        System.out.println("Ingresa un número entero:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("El número ingresado " + multiple(n));
    }
    static String multiple(int n){
        if(n%10 == 0){
            return "es múltiplo de 10.";
        }
        else{
            return "no es múltiplo de 10.";
        }
    }
}
