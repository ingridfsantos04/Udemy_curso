package Udemy;

import java.util.Scanner;

public class Hora {
    public static void amin (String[]args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if ( hora < 12) {
            System.out.println("Bom Dia ");
        }

        else {
            if (hora < 18 ) {
                System.out.println("Boa Tarde ");
            }
            else {
                System.out.println("Boa Noite ");
            }
            

        }
    }
    
}
