import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;

        System.out.print("Quantos alunos serão cadastrados? ");
        quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        String[] nome = new String[quantidade];
        double[] nota1 = new double[quantidade];
        double[] nota2 = new double[quantidade];

        // Entrada de dados
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = scanner.nextLine();

            System.out.print("Digite a primeira nota: ");
            nota1[i] = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2[i] = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
        }

        // Cálculo e saída
        for (int i = 0; i < quantidade; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;

            System.out.printf("Aluno: %s | Média: %.2f - ", nome[i], media);

            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else if (media >= 5.0) {
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }
        }

        scanner.close();
    }
}
