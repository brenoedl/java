package classeanimalsopreporssicao;
public class Peixe  extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void fazerBolhas() {
        System.out.println("Sotando bolhass");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void allimentar() {
        System.out.println("Comendo augas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    @Override
    public String toString() {
        return "Peixe { " + "idade = " + this.getIdade() + ", peso = " + this.getPeso() + ", menbros = " + this.getMenbros() + ", Cor da escama = " + this.getCorEscama() + " }";
    }
}
