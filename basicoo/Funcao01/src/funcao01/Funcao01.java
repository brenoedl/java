package funcao01;

public class Funcao01 {

    public static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        int  s = soma(5, 2);
        System.out.println("A soma entre 5 e 2 vale " + s);
    }    
}
