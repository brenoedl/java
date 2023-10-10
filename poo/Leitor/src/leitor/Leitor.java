package leitor;
public class Leitor {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Breno", 21, "M");
        p[1] = new Pessoa("Daniele", 20, "F");

        l[0] = new Livro("Apremdendo Java", "Jose ddaSilva", 630, p[0]);
        l[1] = new Livro("Demon Slayer", "Koyoharu Gotouge", 150, p[1]);
        l[2] = new Livro("Fullmetal Alchemist", "Hiromu Arakawa", 160, p[0]);

        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
