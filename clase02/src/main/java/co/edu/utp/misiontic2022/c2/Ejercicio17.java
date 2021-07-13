package co.edu.utp.misiontic2022.c2;

public class Ejercicio17 {
    //Mostrar un contador de 5 dígitos. En lugar del dígito 3 se debe mostrar E.
    public static void main(String[] args) {
        contador();
    }
    static void contador(){
        String acum = ""; String i2 = ""; String j2 = ""; String k2 = ""; String l2 = ""; String m2 = ""; 
        for(int i=0; i<=1; i++){
            for(int j=0; j<=1; j++){
                for(int k=0; k<=1; k++){
                    for(int l=0; l<=9;l++){
                        for(int m=0; m<=9; m++){
                            if(i==3){
                                i2 = "E";
                            } else{
                               i2 = String.valueOf(i);
                            }
                            if(j == 3){
                                j2 = "E";
                            } else{
                                j2 = String.valueOf(j);
                            }
                            if(k == 3){
                                k2 = "E";
                            } else{
                                k2 = String.valueOf(k);
                            }
                            if(l == 3){
                                l2 = "E";
                            } else{
                                l2 =String.valueOf(l);
                            }
                            if(m == 3){
                                m2 = "E";
                            }
                            else{
                                m2 = String.valueOf(m);
                            }
                            acum = i2 + j2 + k2 +l2 + m2;
                            System.out.println(acum);
                            }
                        }
                    } 
                } 
            }
        }
    }
