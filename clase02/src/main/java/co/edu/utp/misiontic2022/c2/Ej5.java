package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args){
        System.out.println("Ingrese un número entero: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        String type = (num % 2 == 0 ? " es par." : " es impar.");
        System.out.println(num + type);
    }
}
