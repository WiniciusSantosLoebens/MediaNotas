import java.util.Scanner;

public class MediaNotas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("---Boletim---");
        System.out.println("Média Final: " + media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }
    }
}