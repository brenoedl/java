package comtrole;
public class ComtroleRemoto implements Comtrolador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public void ComtroleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int v) {
        this.volume = v;
    }
    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean l) {
        this.ligado = l;
    }
    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Esta tocanndo? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("{}");
        }
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fecfando menu... ");
    }
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }   
}
