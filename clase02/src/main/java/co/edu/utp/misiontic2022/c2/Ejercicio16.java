package co.edu.utp.misiontic2022.c2;

public class Ejercicio16 {
    /*Programa que muestre en líneas separadas lo siguiente:
        XVUTSRQPONMLKJIHGFEDCBA
        VUTSRQPONMLKJIHGFEDCBA
        ....
        BA
        A*/

     public static void main(String[] args) {
         alphabet();
     }
     static void alphabet(){
        for(int j = 90; j >= 65; j--){
            String acum = "";
            for(int i = j; i >= 65; i--){
                acum = acum + Character.toString((char)i);
            }
            System.out.println(acum);
        }
     }
}
