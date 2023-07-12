package repeticaosoma;

import java.util.Scanner;

public class RepeticaoSoma {
    
    public static void main(String[] args) {
        Scanner teclato = new Scanner(System.in);
        int n, s = 0;
        String res;
        do {
            System.out.print("Digite um numero: ");
            n = teclato.nextInt();
            s += n;
            System.out.print("Quer continoar? [S/N] ");
            res = teclato.next();
        } while (res.equals("s"));
        System.out.println("A soma entre todos os numero e " + s);
    }
    
}
