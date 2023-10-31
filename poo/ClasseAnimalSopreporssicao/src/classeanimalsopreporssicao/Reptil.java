package classeanimalsopreporssicao;
public class Reptil  extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void allimentar() {
        System.out.println("Comendo incetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    @Override
    public String toString() {
        return "Reptil { " + "idade = " + this.getIdade() + ", peso = " + this.getPeso() + ", menbros = " + this.getMenbros() + ", Cor da escama = " + this.getCorEscama() + " }";
    }
}
