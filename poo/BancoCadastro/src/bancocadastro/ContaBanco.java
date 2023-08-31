package bancocadastro;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void ContaBanco(){
        saldo = 0;
        status = false;
    }

    public void statusConta(){
        System.out.println("Nueero da conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    public void abrirConta(String t, String d, int n){
        if (t.equals("cc") || t.equals("cp")){
            this.setTipo(t);
            this.setDono(d);
            this.setNumConta(n);
            this.setStatus(true);
            if (t.equals("cc")){
                this.setSaldo(50.0f);
                System.out.println("Sua conta crrente foi aberta");
            }else{
                this.setSaldo(150.0f);
                System.out.println("Sua conta poubanca foi aberta");
            }
        }else{
            System.out.println("ERRO! nao existe este tipo de conta");
        }
    }
    public void fechaConta(){
        if (this.getSaldo() != 0){
            System.out.println("ERRO! voce nao pode fechar sua conta visto que voce tem saldo positivo ou negativo");
        }else{
            this.setStatus(false);
            System.out.println("Sua conta foi fechada");
        }
    }
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("valor depositado");
        }else{
            System.out.println("Nao e posivel depositar");
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Valor sacado");
        }else{
            System.out.println("Nao e posivel sacar");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo().equals("cc")){
            v = 12;
        }else{
            v = 20;
        }
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mesalidade paga");
        }else{
            System.out.println("ERRO nao posso pagar mesalidade");
        }
    }
}
