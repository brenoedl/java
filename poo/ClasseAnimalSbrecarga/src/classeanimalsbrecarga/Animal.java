 package classeanimalsbrecarga;
public abstract class Animal {
    private int idade;
    private float peso;
    private int menbros;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMenbros() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }
    
    public abstract void locomover();
    public abstract void allimentar();
    public abstract void emitirSom();
}
