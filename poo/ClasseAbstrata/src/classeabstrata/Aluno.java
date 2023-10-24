package classeabstrata;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
        this.setMatricula(0);
    }

    public void pagarMatricula(){
        System.out.println("Matricula paga");
    }

    @Override
    public String toString() {
        return "nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + "matricula = " + this.getMatricula() + ", curso = " + this.getCurso();
    }
}
