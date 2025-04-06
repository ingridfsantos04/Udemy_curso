package Udemy;

import java.util.Locale;
import java.util.Scanner;

public class nota {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Primeiro Semestre: ");
        double primeiro = sc.nextDouble();

        System.out.println("Segundo Semestre: ");
        double segundo = sc.nextDouble();

        double anual = primeiro + segundo;
        System.out.println("Nota final: %.1f%n" + anual);


        sc.close();

    }
}
