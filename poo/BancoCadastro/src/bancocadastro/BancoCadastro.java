package bancocadastro;
public class BancoCadastro {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("cc", "Breno", 111111);
        p1.statusConta();
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("cp", "Daniele", 1111112);
        p2.statusConta();
    }
}
