package fatorialfuncao;

public class Fatorial {
    private int num = 0;
    private String formola = "";
    private int fatorial = 1;
    
    public void getValor(int n){
        num = n;
        for (int c = num; c > 1; c--) {
            fatorial *= c;
            formola += c + " x ";
        }
        formola += "1 = ";
    }
    
    public String setFormola(){
        return formola;
    }
    public int setFatorial(){
        return fatorial;
    }
}
