package classeabstrata;
public class ClasseAbstrata {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Vistante v = new Vistante();
        Aluno a = new Aluno();
        Professor p = new Professor();
        Bolsista b =new Bolsista();
        Tecnico t = new Tecnico();

        v.setNome("Bruce");
        v.setIdade(21);
        v.setSexo("M");
        System.out.println(v.toString());

        a.setNome("Elis");
        a.setIdade(14);
        a.setSexo("F");
        a.setCurso("Informatica");
        a.setMatricula(111111);
        System.out.println(a.toString());

        p.setNome("Breno");
        p.setIdade(21);
        p.setSexo("M");
        p.setEspecialidade("Programacao");
        p.setSalario(3014.98f);
        System.out.println(p.toString());

        b.setNome("Renan");
        b.setIdade(12);
        b.setSexo("M");
        b.setCurso("Informatica");
        b.setMatricula(111112);
        b.setBolsa(65.6f);
        System.out.println(b.toString());

        t.setNome("Danielle");
        t.setIdade(20);
        t.setSexo("F");
        t.setCurso("Pedagogia");
        t.setMatricula(111113);
        t.setRegistroProfissonal(985988770);
        System.out.println(t.toString());
    }
}
