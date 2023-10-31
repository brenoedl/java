package classeanimalsopreporssicao;
public class Ave  extends Animal{
    private String cotPena;

    public String getCotPena() {
        return cotPena;
    }

    public void setCotPena(String cotPena) {
        this.cotPena = cotPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void allimentar() {
        System.out.println("Comendo sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public String toString() {
        return "Ave { " + "idade = " + this.getIdade() + ", peso = " + this.getPeso() + ", menbros = " + this.getMenbros() + "Cor da pena = " + this.getCotPena() + " }";
    }
}
