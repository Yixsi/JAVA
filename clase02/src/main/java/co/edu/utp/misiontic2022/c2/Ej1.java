package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
    // 1. Pedir cantidad de h trabajadas
        System.out.println("Ingrese # de horas trabajadas: ");
        Scanner sc = new Scanner(System.in);
        int horas = sc.nextInt();
    
    // 2. Calcular el costo de hora
        System.out.println("Ingrese el costo por hora: ");
        double costo_horas = sc.nextDouble();
        
        sc.close();
    // 3. Multiplicar el costo por la cantidad de horas
        double pago = horas*costo_horas;
    
    // 4. Mostrar resultado
        System.out.println("El salario del empleado es:  " + pago);
    }
}
