package Projeto;

import java.util.Scanner;

public class FuncoesBasicas {

    //Função para somar dois números
    public static int somar(int a, int b){
        return a+b;
    }

    //Função para verificar se um número é par ou impar
    public static String parOuImpar(int numero){
        return(numero % 2 == 0)? "Par" : "Ímpar";
    }

    //Função para exibir uma mensagem personalizada
    public static void exibirMensagem(String nome){
        System.out.println("Olá, " + nome + " !Bem-vindo ao programa de Funções Básicas");
    }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("\n=====MENU=====");
            System.out.println("1 Somar dois números");
            System.out.println("2 Verificar se um número é par ou ímpar");
            System.out.println("3 Exibir uma mensagem personalizada");
            System.out.println("4 Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
                System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();
                System.out.println("Resultado da soma: " + somar(num1, num2));
                break;

            case 2:
                System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
                System.out.println("O número " + numero + " é " + parOuImpar(numero));
                break;

            case 3:
                scanner.nextLine(); //consumir a quebra de linha pendente
                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();
                exibirMensagem(nome);
                break;

            case 4:
                System.out.println(" Saindo do programa. Até mais! ");
                break;

            default:
                System.out.println(" Opção inválida! Tente novamente ");

            }
        } while (opcao !=4); 
        scanner.close();  
    }
}
