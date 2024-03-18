import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe a hora no formato HH:MM:");
        String entrada = Scanner.nextLine();

        // Separando as horas e os minutos da entrada
        String[] partes = entrada.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        // Validando se a entrada está dentro do intervalo válido
        if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Entrada inválida. Por favor, insira uma hora válida no formato HH:MM.");
            return;
        }

        // Calculando os minutos desde o início do dia
        int minutosDesdeInicioDoDia = horas * 60 + minutos;

        System.out.println("Minutos desde o início do dia: " + minutosDesdeInicioDoDia);

        Scanner.close();
    }
}

    

