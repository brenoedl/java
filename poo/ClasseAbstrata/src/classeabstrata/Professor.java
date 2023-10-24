package classeabstrata;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumento(float aum) {
        this.setSalario(getSalario() + aum);
    }

    @Override
    public String toString() {
        return "nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + ",especialidade = " + this.getEspecialidade() + ", salario = "+ this.getSalario();
    }
}
