package ultraemojicombat;
public class UltraEmojiCombat {
    public static void main(String[] args) {
        
        Lutador ld[] = new Lutador[6];
        
        ld[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        ld[1] = new Lutador("Potscrpt", "Brasll", 29, 1.68f, 57.4f, 14, 2, 3);
        ld[2] = new Lutador("Snapshadow", "EUA", 38, 1.62f, 80.9f, 12, 3, 1);
        ld[3] = new Lutador("Dead Coda", "Australia", 27, 1.93f, 81.3f, 13, 0, 2);
        ld[4] = new Lutador("UFOCobol", "Brasil", 38, 1.75f, 119.3f, 5, 3, 2);
        ld[5] = new Lutador("Nerdaark", "EUA", 26, 1.92f, 105.8f, 12, 2, 4);
        
        Luta uec[] = new Luta[4];
        
        uec[0] = new Luta();
        uec[1] = new Luta();
        uec[2] = new Luta();
        uec[3] = new Luta();
        
        uec[0].marcarLuta(ld[0], ld[1]);
        uec[0].lutar();
        uec[1].marcarLuta(ld[2], ld[3]);
        uec[1].lutar();
        uec[2].marcarLuta(ld[4], ld[5]);
        uec[2].lutar();
        uec[0].marcarLuta(ld[1], ld[3]);
        uec[0].lutar();
    }
}
