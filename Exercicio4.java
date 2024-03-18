import java.util.Scanner;

public class Exercicio4 {
  public static void main (String[]args) {
        
       Scanner input = new Scanner(System.in);

        double numero1, numero2, numero3, numero4, total; 

        System.out.println("screva o primeiro número: ");
        numero1 = input.nextDouble();

        System.out.println("Escreva o segundo número: ");
        numero2 = input.nextDouble();
       
        System.out.println("Escreva o terceiro número: ");
        numero3 = input.nextDouble();
        
        System.out.println("Escreva o quarto número: ");
        numero4 = input.nextDouble();
        
        total = (numero1 + numero2 + numero3 + numero4);

        System.out.println("o valor da regra de três é: " + total);

        input.close();

    }
}