package Udemy;

import java.util.Scanner;

public class Condicao {
    public static void amin (String[]args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if ( hora < 12) {
            System.out.println("Bom Dia ");
        }

        else {
        System.out.println("Boa Tarde");

        }
    }
    
}
