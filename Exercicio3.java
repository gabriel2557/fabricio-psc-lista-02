import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo do Teorema de Pitágoras");
        System.out.println("--------------------------------");

        // Entrada dos comprimentos dos catetos
        System.out.print("Informe o comprimento do primeiro cateto (a): ");
        double a = scanner.nextDouble();

        System.out.print("Informe o comprimento do segundo cateto (b): ");
        double b = scanner.nextDouble();

        // Calcular a hipotenusa usando o teorema de Pitágoras
        double c = calcularHipotenusa(a, b);

        // Exibir o resultado
        System.out.println("\nO comprimento da hipotenusa (c) é: " + c);

        scanner.close();
    }

    // Método para calcular a hipotenusa usando o teorema de Pitágoras
    public static double calcularHipotenusa(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}