package manipulacaodados;

import java.util.Scanner;

public class ManipulacaoDados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Qual a sua idade? ");
        int idade = teclado.nextInt();
        System.out.printf("Ola %s a sua idade e %d \n", nome,idade);
    }
    
}
