package vetores01;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores01 {

    public static void main(String[] args) {
        int n[] = new int[4];
        Scanner t = new Scanner(System.in);
        for (int c = 0; c < 4; c++) {
            System.out.print("Digite um numero: ");
            n[c] = t.nextInt();
        }
        System.out.println(Arrays.toString(n));
    }
    
}
