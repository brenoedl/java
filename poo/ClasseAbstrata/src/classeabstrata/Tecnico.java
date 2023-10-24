package classeabstrata;
public class Tecnico extends Aluno {
    private int registroProfissonal;

    public int getRegistroProfissonal() {
        return registroProfissonal;
    }

    public void setRegistroProfissonal(int registroProfissonal) {
        this.registroProfissonal = registroProfissonal;
    }

    public void praticar() {
        System.out.println("Praticando...");
    }

    @Override
    public String toString() {
        return "nome = " + this.getNome() + ", idade = " + this.getIdade() + ", sexo = " + this.getSexo() + "matricula = " + this.getMatricula() + ", curso = " + this.getCurso() + "registro profissional = " + this.getRegistroProfissonal();
    }
}
