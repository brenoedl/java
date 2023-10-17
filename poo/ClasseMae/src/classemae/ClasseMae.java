package classemae;
public class ClasseMae {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 =new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Roberto");
        p2.setNome("Elis");
        p3.setNome("Breno");
        p4.setNome("Renan");

        p1.setIdade(68);
        p2.setIdade(4);
        p3.setIdade(21);
        p4.setIdade(25);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("M");

        p2.setMatricula(1);
        p2.setCurso("Imformatica");
        p3.setSalario(3499.99f);
        p3.setEspecialidade("Programacao");
        p4.setTrabalhando(true);
        p4.setSetor("seguuranca");

        //p2.mudaTrabalho();
        //p3.cancelarMatricula();
        //p4.aumento(697.53f)

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
