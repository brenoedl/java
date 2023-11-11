package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g[] = new Gafanhoto[2];
        Assitir a[] = new Assitir[6];

        v[0] = new Video("Dachshund ou Basset: tudo sobre a raça \"SALSICHA\"");
        v[1] = new Video("TRETA COM XANDÃO, ODEIO RELIGIÕES, SOU NIILISTA?");
        v[2] = new Video("DE ONDE VIERAM ESSAS IMAGENS ASSUSTADORAS? (Parte 2)");

        g[0] = new Gafanhoto("Ingrid Nicoly", 20, "F", "ingridnicoly");
        g[1] = new Gafanhoto("Breno Emanuel", 21, "M", "brenoedl");

        a[0] = new Assitir(g[0], v[0]);
        a[1] = new Assitir(g[0], v[1]);
        a[2] = new Assitir(g[0], v[2]);
        a[3] = new Assitir(g[1], v[0]);
        a[4] = new Assitir(g[1], v[1]);
        a[5] = new Assitir(g[1], v[2]);

        a[0].avaliar();
        a[0].avaliar(25.3f);
        a[0].avaliar(63);
        a[1].avaliar();
        a[1].avaliar(2.3f);
        a[1].avaliar(63);
        a[2].avaliar();
        a[2].avaliar(30);
        a[2].avaliar(63);
        a[3].avaliar();
        a[3].avaliar(45.3f);
        a[3].avaliar(63);
        a[4].avaliar();
        a[4].avaliar(68.3f);
        a[4].avaliar(63);
        a[5].avaliar();
        a[5].avaliar(98.3f);
        a[5].avaliar(63);

        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println(a[2].toString());
        System.out.println(a[3].toString());
        System.out.println(a[4].toString());
        System.out.println(a[5].toString());
    }
}
