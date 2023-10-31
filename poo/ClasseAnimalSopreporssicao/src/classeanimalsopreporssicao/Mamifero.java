package classeanimalsopreporssicao;
public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void allimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Soom de mamifero");
    }

    @Override
    public String toString() {
        return "Mamifero { " + "idade = " + this.getIdade() + ", peso = " + this.getPeso() + ", menbros = " + this.getMenbros() + ", Cor do pelo = " + this.getCorPelo() + " }";
    }
}
