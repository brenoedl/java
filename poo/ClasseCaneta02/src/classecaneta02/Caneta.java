package classecaneta02;
public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
    private float ponta = 0.5f;
    protected boolean tampada;

    public void rabiscar(){
        if(this.tampada == false){
            System.out.println("Rabiscando");
        }else{
            System.out.println("ERRO! a caneta esta tampada");
        }
    }
    public void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("carga: " + this.carga);
        System.out.println("ponta: " + this.ponta);
        System.out.println("tampada: " + this.tampada);
    }
    protected void tampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada");
    }
    protected void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada");
    }
}
