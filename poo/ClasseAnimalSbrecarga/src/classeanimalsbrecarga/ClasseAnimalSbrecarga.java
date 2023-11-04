package classeanimalsbrecarga;
public class ClasseAnimalSbrecarga {
    public static void main(String[] args) {
        Cacchorro c1 = new Cacchorro();
        Cacchorro c2 = new Cacchorro();

        c1.setCorPelo("Marrom");
        c1.setIdade(2);
        c1.setPeso(13.59f);
        c1.setMenbros(4);
        c1.setRasa("Dachshund");
        c1.setNome("Davi");

        c2.setCorPelo("Preto");
        c2.setIdade(12);
        c2.setPeso(1.12f);
        c2.setMenbros(4);
        c2.setRasa("Pinscher");
        c2.setNome("Star");

        System.out.println(c1.toString());
        c1.reagir("Ola");
        c1.reagir("Vai deitar");
        c1.reagir(9);
        c1.reagir(13);
        c1.reagir(20);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(c1.getIdade(), c1.getPeso());

        System.out.println(c2.toString());
        c2.reagir("Ola");
        c2.reagir("Vai deitar");
        c2.reagir(9);
        c2.reagir(13);
        c2.reagir(20);
        c2.reagir(true);
        c2.reagir(false);
        c2.reagir(c2.getIdade(), c2.getPeso());
    }
}
