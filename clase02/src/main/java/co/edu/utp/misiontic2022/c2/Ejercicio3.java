package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio3 {
    //Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
    public static void main(String[] args) {
        String res = get_New_Number();
        System.out.println(res);
    }
    static String get_New_Number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa dos números enteros.");
        
        System.out.println("Ingresa el numero N:");
        int N = sc.nextInt();
        int N_len = Integer.toString(N).length();
        String N_str = String.valueOf(N);

        System.out.println("Ingresa el numero m:");
        int m = sc.nextInt();

        sc.close();

        if(!(N_len > m)){
            return "El número N debe tener más cifras que el número m.";
        }
        else{
            String n_number = N_str.substring(0, N_len-m);
            return "El nuevo número es: " + n_number;
        }
    }
}