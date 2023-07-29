package classecaneta02;
public class ClasseCaneta02 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.modelo = "Bic cristal";
       c1.cor = "Azul";
       c1.carga = 100;
       c1.tampada = false;

       c1.rabiscar();
       c1.status();
       c1.tampar();
    }
    
}
