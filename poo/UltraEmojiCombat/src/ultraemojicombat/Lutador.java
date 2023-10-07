package ultraemojicombat;
public final class Lutador implements InterfaceLutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derota;
    private int empate;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitoria = vi;
        this.derota = de;
        this.empate = em;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";
        }else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria ="medio";
        }else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerota() {
        return derota;
    }

    public void setDerota(int derota) {
        this.derota = derota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    @Override
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " Anos.");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getAltura() + " m de altura.");
        System.out.println("Vitorias: " + this.getVitoria());
        System.out.println("Derotas: " + this.getDerota());
        System.out.println("Empates: " + this.getEmpate());
    }

    @Override
    public void status() {
        System.out.print(this.getNome() + " ");
        System.out.print("e um peso " + this.getCategoria());
        System.out.print(this.getVitoria() + " vitorias ");
        System.out.print(this.getDerota() + " derotas ");
        System.out.print(this.getEmpate() + " empates.");
        System.out.println();
    }

    @Override
    public void genharLuta() {
        this.setVitoria(this.getVitoria() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerota(this.getDerota() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpate(this.getEmpate() + 1);
    }
}
