package Udemy;

public class preco {
    public static void main(String[] args) {
        
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;

        System.out.println(desconto);
    }
}

