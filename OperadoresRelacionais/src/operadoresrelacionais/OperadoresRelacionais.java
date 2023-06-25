package operadoresrelacionais;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 6;
        int n3 = 12;
        boolean e, ou, nao, ou_s;
        e = n2 % 2 == 0 && n1 % 3 == 0;
        System.out.println(e);
        ou = n2 % 2 == 0 || n1 % 3 == 1;
        System.out.println(ou);
        ou_s = n2 % 2 == 0 ^ n1 % 3 == 0;
        System.out.println(ou_s);
        nao = !e;
        System.out.println(nao);
    }
    
}
