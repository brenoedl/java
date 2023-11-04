package classeanimalsbrecarga;
public class Cacchorro extends Mamifero {
    private String rasa;
    private String nome;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    public void rosnar() {
        System.out.println("Rosnando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au auuuuu!");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Ola")) {
            this.abanarRabo();
            this.emitirSom();
        } else {
            this.rosnar();
        }
    }

    public void reagir(int hora) {
        if (hora < 12) {
            this.abanarRabo();
        } else if (hora >= 18) {
            System.out.println("Iguinorar");
        } else {
            this.abanarRabo();
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            this.abanarRabo();
        } else {
            this.rosnar();
            this.emitirSom();
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                this.abanarRabo();
            } else {
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                this.rosnar();
            } else {
                System.out.println("Iguinorar");
            }
        }
    }

    @Override
    public String toString() {
        return "Cacchorro {" + "rasa = " + this.getRasa() + ", nome = " + this.getNome() + "idade = " + this.getIdade() + ", peso = " + this.getPeso() + ", menbros = " + this.getMenbros() + ", Cor do pelo = " + this.getCorPelo() + " }";
    }
}
