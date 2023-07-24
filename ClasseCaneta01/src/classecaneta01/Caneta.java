package classecaneta01;
public class Caneta {
    String modelo;
    String cor;
    int carga;
    float ponta;
    boolean tampada;

    void escreva(){
        if(this.tampada == false){
            System.out.println("Ola, mundo!");
        }else{
            System.out.println("ERRO! a caneta esta tampada");
        }
    }
    void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("carga: " + this.carga);
        System.out.println("ponta: " + this.ponta);
        System.out.println("tampada: " + this.tampada);
    }
    void tampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada");
    }
    void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada");
    }
}
