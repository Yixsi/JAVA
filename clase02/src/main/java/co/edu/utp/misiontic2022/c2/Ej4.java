package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args){
        System.out.println("Ingrese la temperatura en centígrados: ");
        Scanner sc = new Scanner(System.in);
        float temp_c = sc.nextFloat();
        sc.close();

        float result = temp_f(temp_c);
        System.out.println(result);

    }
    public static float temp_f(float temp_c){
        float temp_f = 32 + 9*temp_c/5;
        return temp_f;
    }
}
