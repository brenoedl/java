package condicionalsimples;

import java.util.Scanner;

public class CondicionalSimples {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("nota 1 ");
        float n1 = teclado.nextFloat();
        System.out.print("nota 2 ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("A media e " + m);
        if (m>=7){
            System.out.println("Parabens");
        }
    }
}
