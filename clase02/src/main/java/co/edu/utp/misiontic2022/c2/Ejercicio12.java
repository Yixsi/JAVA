package co.edu.utp.misiontic2022.c2;

public class Ejercicio12 {
    /*Realizar programa que muestre los números del 1 al 100 que no
    sean múltiplos de 3, utilizando cada una las instrucciones
    repetitivas (while, do while, for)*/
    public static void main(String[] args) {
        System.out.println("====== Ciclo while ======");
        System.out.println(while_cycle());
        System.out.println("====== Ciclo for ======");
        System.out.println(for_cycle());
        System.out.println("====== Ciclo do_while ======");
        System.out.println(Do_while_cycle());
    }
    static String while_cycle(){
        int i = 1;
        String acum = "";
        while(i<=100){
            if(i%3 == 0){
                i++;
                continue;
            } else{
            acum = acum + i + " ";
            }
            i++;
        }
        return acum;
    }
    static String for_cycle(){
        String acum = "";
        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                continue;
            } else{
            acum = acum + i + " ";
            }
        }
        return acum;
    }
    static String Do_while_cycle(){
        String acum = "";
        int i = 1;
        do {
            if(i%3 == 0){
                i++;
                continue;
            } else{
            acum = acum + i + " ";
            }
            i++;
        } while(i<=100);
        return acum;
    }
}
