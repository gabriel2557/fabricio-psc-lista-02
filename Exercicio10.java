import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Quantidade Recomendada de Água");
        System.out.println("--------------------------------------------");

        // Solicitar o peso da pessoa
        System.out.print("Informe o peso da pessoa (em quilogramas): ");
        double peso = scanner.nextDouble();

        // Calcular a quantidade recomendada de água em litros
        double quantidadeAguaLitros = calcularQuantidadeAgua(peso);

        // Exibir o resultado
        System.out.println("\nQuantidade recomendada de água por dia: " + quantidadeAguaLitros + " litros");

        scanner.close();
    }

    // Método para calcular a quantidade recomendada de água em litros
    public static double calcularQuantidadeAgua(double peso) {
        return peso * 35 / 1000; // Convertendo mililitros para litros
    }
}