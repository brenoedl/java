package leitor;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPagias;
    private int pagAtual;
    private boolean aberto;
    private Pessoa dono;

    public Livro(String titulo, String autor, int totPagias, Pessoa dono) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagias = totPagias;
        this.dono = dono;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagias() {
        return totPagias;
    }

    public void setTotPagias(int totPagias) {
        this.totPagias = totPagias;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public String detalhes() {
        return  "titulo = " + titulo + ", autor = " + autor + ", total pagias = " + totPagias + ", pagina atual = " + pagAtual + ", aberto = " + aberto + ", nome do dono = " + dono.getNome() + ", idade do dono = " + dono.getIdade();
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void foliar(int pag) {
        if (pag > this.getTotPagias()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(pag);
        }
    }

    @Override
    public void avansarPag() {
        if (this.getPagAtual() > this.getTotPagias()) {
            this.setPagAtual(0);
        }else{
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() < 0) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
