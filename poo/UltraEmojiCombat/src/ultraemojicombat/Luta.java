package ultraemojicombat;

import java.util.Random;

public class Luta implements InterfaceLuta{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    @Override
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random ale = new Random();
            int v = ale.nextInt(3);
            switch (v) {
                case 0 -> {
                    System.out.println("Empatou!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                }
                case 1 -> {
                    System.out.println("Venceu " + this.getDesafiado().getNome());
                    this.getDesafiado().genharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                }
                case 2 -> {
                    System.out.println("Venceu " + this.getDesafiante().getNome());
                    this.getDesafiante().genharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                }
            }
            this.getDesafiado().status();
            this.getDesafiante().status();
        }else{
            System.out.println("Luta nao pode acomtecer!");
        }
    }
}
