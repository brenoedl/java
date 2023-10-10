package leitor;
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void foliar(int pag);
    public abstract void avansarPag();
    public abstract void voltarPag();
}
