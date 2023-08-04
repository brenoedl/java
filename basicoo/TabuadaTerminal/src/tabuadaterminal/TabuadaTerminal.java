package tabuadaterminal;

import java.util.Scanner;

public class TabuadaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = teclado.nextInt();
        int r = 0;
        for (int c = 0; c <= 10; c++) {
            r = n * c;
            System.out.printf("%d x %d = %d\n", n, c, r);
        }
    }
    
}
