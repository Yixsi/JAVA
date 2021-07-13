package co.edu.utp.misiontic2022.c2;
import  java.util.Scanner;
public class Ejercicio15 {
    //Leer un número N y calcular la suma de los factoriales de los números desde 0 hasta N.
    public static void main(String[] args) {
        output();
    }
    static void output(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número n.");
        int n = sc.nextInt();
        sc.close();

        int acum = 0;
        for(int i=0; i<=n; i++){
            System.out.printf("factorial de %d = %d \n", i, factorial(i));
            acum += factorial(i);
        }
        System.out.printf("Total = %d ", acum);
    }
    static int factorial(int n){
        if(n >= 0 && n < 2){
            return 1;
        }
        return n*factorial(n-1);
    }
}
