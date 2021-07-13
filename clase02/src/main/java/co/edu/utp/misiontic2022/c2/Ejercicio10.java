package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio10 {
    /*Programa que lea por teclado tres números enteros H, M, S
    correspondientes a hora, minutos y segundos respectivamente, y
    comprueba si la hora que indican es una hora válida.*/
    public static void main(String[] args) {
        valid_hour();
    }
    static void valid_hour(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números enteros que representen la hora exacta.");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        sc.close();

        if(h >= 0 && h <= 24){
            if(m >= 0 && m <= 60){
                if(s >= 0 && s <= 60){
                    System.out.println("Los números ingresados representan una hora válida");
                }
                else{
                    System.out.println("Los números ingresados no representan una hora válida");
                }
            }else{
                System.out.println("Los números ingresados no representan una hora válida");
            }
        } else{
            System.out.println("Los números ingresados no representan una hora válida");
        }
    }
}
