package classecaneta01;
public class ClasseCaneta01 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "Bic cristal";
       c1.cor = "Azul";
       c1.carga = 100;
       c1.ponta = 0.5f;
       c1.tampada = false;

       c1.escreva();
       c1.tampar();
       c1.status();
    }
    
}
