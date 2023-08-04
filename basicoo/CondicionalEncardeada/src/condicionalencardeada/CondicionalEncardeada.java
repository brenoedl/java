package condicionalencardeada;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CondicionalEncardeada {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter  formato = DateTimeFormatter.ofPattern("yyyy");
        int anoAtual = Integer.parseInt(formato.format(data));
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.println("A sua idade e " + idade);
        
        if (idade<16){
            System.out.println("Voto proibido");
        }else if ((idade>=16 && idade<18) || idade>70){
            System.out.println("Vootoo opsional");
        }else{
            System.out.println("Voto obrigatorio");
        }
    }
    
}
