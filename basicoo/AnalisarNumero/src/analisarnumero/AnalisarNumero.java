package analisarnumero;

import javax.swing.JOptionPane;

public class AnalisarNumero {

    public static void main(String[] args) {
     int n, s = 0, mc = 0, t = 0, p = 0, i = 0;
     float m = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Imforme um número<br>(0 enterrompe)<hr></html>"));
            s += n;
            t++;
            if (n % 2 == 0) {
                p++;
            }else{
                i++;
            }
            if (n > 100){
                mc++;
            }
        } while (n != 0);
         m = s / t;
         JOptionPane.showMessageDialog(null, String.format("<html>Resultado:<hr>Total de valores: %d<br>Total de pares: %d<br>Toal de impares: %d<br>Maior de 100: %d<br>Média dos valores: %.1f</html>", t, p, i, mc, m));
    }
    
}
