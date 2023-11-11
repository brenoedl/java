package projetoyoutube;
public class Assitir {
    private Gafanhoto gafanhoto;
    private Video video;

    public Assitir(Gafanhoto gafanhoto, Video video) {
        this.gafanhoto = gafanhoto;
        this.video = video;
        this.gafanhoto.setTotAssitido(this.gafanhoto.getTotAssitido() + 1);
        this.video.setViews(this.video.getViews() + 1);
    }

    public Gafanhoto getGafanhoto() {
        return gafanhoto;
    }

    public void setGafanhoto(Gafanhoto gafanhoto) {
        this.gafanhoto = gafanhoto;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void avaliar() {
        this.video.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.video.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int tot = 0;

        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.video.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Assitir { " + "gafanhoto = " + gafanhoto.toString() + ", video = " + video.toString() + " }";
    }
}
