package condicionalmutipla;

import java.util.Scanner;

public class CondicionalMutipla {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;
        System.out.print("Quantas patas? ");
        int patas = teclado.nextInt();
        switch (patas) {
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6:
                tipo = "Inseto";
                break;
            case 8:
                tipo = "Aracnídeo";
                break;
            default:
                tipo ="ET";
        }
        System.out.println("O tipo do animal e " + tipo);
    }
    
}
