import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe o preço do etanol:");
        double precoEtanol = Scanner.nextDouble();

        System.out.println("Informe o preço da gasolina:");
        double precoGasolina = Scanner.nextDouble();

        // Calculando o limite de preço do etanol para ser mais vantajoso
        double limiteEtanol = precoGasolina * 0.7;

        // Verificando se o preço do etanol é mais vantajoso que o limite
        if (precoEtanol < limiteEtanol) {
            System.out.println("É mais vantajoso abastecer com etanol.");
        } else {
            System.out.println("É mais vantajoso abastecer com gasolina.");

            Scanner.close();
        }
    }
}


