package condicionalcomposta;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CondicionalComposta {

    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter  formato = DateTimeFormatter.ofPattern("yyyy");
        int anoAtual = Integer.parseInt(formato.format(data));
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        int idade = anoAtual - anoNasc;
        System.out.println("A idade e " + idade);
        
        if (idade>=18){
            System.out.println("maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
