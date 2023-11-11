package projetoyoutube;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiancia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiancia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiancia() {
        return experiancia;
    }

    public void setExperiancia(int experiancia) {
        this.experiancia = experiancia;
    }

    protected void ganharExp() {
        this.setExperiancia(this.getExperiancia() + 1);
    }

    @Override
    public String toString() {
        return "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + ", experiancia = " + experiancia;
    }
}
