package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class reprovado {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Primeiro Semestre: ");
        double primeiro = sc.nextDouble();

        System.out.println("Segundo Semestre: ");
        double segundo = sc.nextDouble();

        double anual = primeiro + segundo;
        System.out.printf("Nota final: %.1f%n", anual);

        if (anual < 5.0){
            System.out.println("reprovado");
        }
        else {
            if (anual > 7.0) {
                System.out.println("Aprovado");     
            }
             sc.close();
     }
    }
}

    

