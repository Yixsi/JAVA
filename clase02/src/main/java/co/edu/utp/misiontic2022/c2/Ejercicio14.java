package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio14 {
    //Mostrar los N primeros términos de la serie de Fibonacci
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuántos números de Fibonacci desea visualizar:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("======== Solución recursiva ========");
        System.out.println(display(n));
        System.out.println("======== Solución no recursiva ========");
        System.out.println(fibonacci2(n));
    }
    static int fibonacci(int n){
        if(n<2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    static String display(int n){
        String acum = "";
        for(int i=0; i<n; i++){
            acum = acum + fibonacci(i) + " ";
        }
        return acum;
    }
    static String fibonacci2(int n){
        int a=0, b=1, c=0;
        String acum = "";
        for(int i=0; i<n; i++){
            acum = acum + b + " ";
            c = a + b;
            a = b;
            b = c;
        }
        return acum;
    }
}
