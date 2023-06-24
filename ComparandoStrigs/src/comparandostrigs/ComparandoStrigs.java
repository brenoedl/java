package comparandostrigs;

public class ComparandoStrigs {

    public static void main(String[] args) {
        String nome1 = "Breno";
        String nome2 = "Breno";
        String nome3 = new String("Breno");
        String res1, res2, res3;
        res1 = (nome1==nome3)?"Igual":"Diferente";
        res2 = (nome1==nome2)?"Igual":"Diferente";
        res3 = (nome2.equals(nome3))?"Igual":"Diferente";
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
    
}
