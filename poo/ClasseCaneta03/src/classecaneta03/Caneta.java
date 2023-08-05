package classecaneta03;
public final class Caneta {
    private String modelo;
    private String cor;
    private int carga;
    private float ponta;
    private boolean tampada;
    
    public Caneta(String modelo, String cor, int carga, float ponta){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setCarga(carga);
        this.setPonta(ponta);
        this.setDestampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int c){
        this.carga = c;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public boolean getTampada(){
        return this.tampada;
    }

    public void rabiscar(){
        if(this.tampada == false){
            System.out.println("Rabiscando");
        }else{
            System.out.println("ERRO! a caneta esta tampada");
        }
    }
    public void status(){
        System.out.println("modelo: " + getModelo());
        System.out.println("cor: " + getCor());
        System.out.println("carga: " + getCarga());
        System.out.println("ponta: " + getPonta());
        System.out.println("tampada: " + getTampada());
    }
    public void setTampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada");
    }
    public void setDestampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada");
    }
}
