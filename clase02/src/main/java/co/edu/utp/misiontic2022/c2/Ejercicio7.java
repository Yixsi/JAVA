package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio7 {
    //Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
    public static void main(String[] args) {
        System.out.println(letter_case());
    }
    static String letter_case(){
        System.out.println("Ingrese una letra:");
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        sc.close();

        if(letter.length() == 1){
            return (letter == letter.toUpperCase() ? "La letra es mayúscula." : "La letra es minúscula.");
        } else{
            return "Debe ingresar solo una letra.";
        }
    }
}
