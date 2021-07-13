package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ej1_unit_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 números.");
        float m = sc.nextFloat();
        float n = sc.nextFloat();
        sc.close();
        operations(m, n);
    }
    static void operations(float a, float b){
        float add = a + b;
        float subs = a - b;
        float mult = a * b;
        float div;
        
        System.out.printf("La suma de %.1f y %.1f es %.1f \n", a, b, add);
        System.out.printf("La resta de %.1f y %.1f es %.1f\n", a, b, subs);
        System.out.printf("La multiplicación de %.1f y %.1f es %.1f\n", a, b, mult);
        
        if(b!=0){
            div = a / b;
            System.out.printf("La división de %.1f y %.1f es %.1f", a, b, div);
        } else{
            System.out.printf("La división de %.1f y %.1f es indeterminada", a, b);
        }
    }
}
