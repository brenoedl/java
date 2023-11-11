package projetoyoutube;
public final class Gafanhoto extends Pessoa {
    private String login;
    private int totAssitido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
;
    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    public void assistiMaisUm() {
        this.setTotAssitido(this.getTotAssitido() + 1);
    }

    @Override
    public String toString() {
        return "Gafanhoto { "+ super.toString() + "login = " + login + ", totAssitido = " + totAssitido + " }";
    }

    
}