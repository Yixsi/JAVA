package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio9 {
    /*El programa lee por teclado tres números enteros y calcula y
    muestra el mayor de los tres.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();
        System.out.println(mayor(n1, n2, n3));
    }
    static String mayor(int a, int b, int c){
        if((a==b)&&(b==c)){
            return "Los números son iguales.";
        } else{
        if (a>b && a>c){
            return "El mayor es " + a;
        } else if(b>a && b>c){
            return "El mayor es " + b;
        }else{
        return "El mayor es " + c;
        }}
    }
}
