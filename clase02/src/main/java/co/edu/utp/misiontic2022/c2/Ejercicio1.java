package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ejercicio1 {
    /*Programa que pida por teclado la fecha de nacimiento de una persona
    (día, mes, año) y calcule su número de la suerte.
    El número de la suerte se calcula sumando el día, mes y año de la fecha
    de nacimiento y a continuación sumando las cifras obtenidas en la suma.*/
    public static void main(String[] args){
        int[] birth_date = get_Birth_Date();
        int result = lucky_number(birth_date);
        System.out.println("Número de la suerte: "+ result);
    }
    static int[] get_Birth_Date(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento de forma númerica.");
        
        System.out.println("Ingresa el día:");
        int day = sc.nextInt();

        System.out.println("Ingresa el mes:");
        int month = sc.nextInt();

        System.out.println("Ingresa el año:");
        int year = sc.nextInt();

        int[] birth_date = {day, month, year};
        sc.close();

        return birth_date;
    }
    static int lucky_number(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        int len = Integer.toString(sum).length();
        int lucky_n = 0;
        for(int j=0; j<len; j++){
            String num = String.valueOf(Integer.toString(sum).charAt(j));
            lucky_n += Integer.parseInt(num);
        }
        return lucky_n;
    }
    
}