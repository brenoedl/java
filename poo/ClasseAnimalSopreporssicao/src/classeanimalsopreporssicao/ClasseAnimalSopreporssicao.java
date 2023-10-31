package classeanimalsopreporssicao;
public class ClasseAnimalSopreporssicao {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setIdade(5);
        m.setMenbros(4);
        m.setPeso(26.3f);
        m.setCorPelo("Catanho");
        System.out.println(m.toString());
        m.locomover();
        m.allimentar();
        m.emitirSom();

        r.setIdade(8);
        r.setMenbros(4);
        r.setPeso(3.61f);
        r.setCorEscama("marron");
        System.out.println(r.toString());
        r.locomover();
        r.allimentar();
        r.emitirSom();

        p.setIdade(5);
        p.setMenbros(3);
        p.setPeso(6.9f);
        p.setCorEscama("Azul");
        System.out.println(p.toString());
        p.locomover();
        p.allimentar();
        p.emitirSom();
        p.fazerBolhas();

        a.setIdade(8);
        a.setMenbros(4);
        a.setPeso(2.98f);
        a.setCotPena("Verde");
        System.out.println(a.toString());
        a.locomover();
        a.allimentar();
        a.emitirSom();
        a.fazerNinho();
    }
}
