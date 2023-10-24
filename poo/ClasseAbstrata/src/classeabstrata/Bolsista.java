package classeabstrata;
public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBoolsa(){
        System.out.println("Bolsa renovada");
    }

    @Override
    public void pagarMatricula(){
        System.out.println("Matricula paga do bolsista " + this.getNome());
    }

    @Override
    public String toString() {
        return "nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + "matricula = " + this.getMatricula() + ", curso = " + this.getCurso() + "bolsa = " + this.getBolsa();
    }
}
