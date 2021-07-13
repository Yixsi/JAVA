package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio11 {
    /*Programa que lea una variable entera "mes" y compruebe si el
    valor corresponde a un mes de 30 días, de 31 o de 28.
    Supondremos que febrero tiene 28 días. Se mostrará además el
    nombre del mes. Se debe comprobar que el valor introducido esté
    comprendido entre 1 y 12*/
    public static void main(String[] args) {
        System.out.println(month());
    }
    static String month(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un mes en notación numérica.");
        int mm = sc.nextInt();
        sc.close();
        switch(mm){
            case 1:
                return "El mes ingresado tiene 31 días y corresponde a enero.";
            case 2:
                return "El mes ingresado tiene 28 días y corresponde a febrero.";
            case 3:
                return "El mes ingresado tiene 31 días y corresponde a marzo.";
            case 4:
                return "El mes ingresado tiene 30 días y corresponde a abril.";
            case 5:
                return "El mes ingresado tiene 31 días y corresponde a mayo.";
            case 6:
                return "El mes ingresado tiene 30 días y corresponde a junio.";
            case 7:
                return "El mes ingresado tiene 31 días y corresponde a julio.";
            case 8:
                return "El mes ingresado tiene 31 días y corresponde a agosto";
            case 9:
                return "El mes ingresado tiene 30 días y corresponde a septiembre";
            case 10:
                return "El mes ingresado tiene 31 días y corresponde a octubre";
            case 11:
                return "El mes ingresado tiene 30 días y corresponde a noviembre";
            case 12:
                return "El mes ingresado tiene 31 días y corresponde a diciembre";
            default:
                return "El mes debe estar comprendido entre 1 y 12.";
        }
    }
}
