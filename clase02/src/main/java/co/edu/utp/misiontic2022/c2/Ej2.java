package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class Ej2 {
    public static void main (String[] args){
        System.out.println("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        int dato = sc.nextInt();
        sc.close();
        int digits = ndigits(dato);
        System.out.println("El número tiene " + digits + " cifras.");
    }
    public static int ndigits(int dato){
        
        int x = 0;
        while(dato != 0){
            dato /= 10;
            x++;
        }
        return x;
    }
}
