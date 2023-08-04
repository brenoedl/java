package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int larguraTela = (int) tela.getWidth();
        int alturaTela = (int) tela.getHeight();
        System.out.println("A resoção da tela é " + larguraTela + " x " + alturaTela);
    }
    
}
