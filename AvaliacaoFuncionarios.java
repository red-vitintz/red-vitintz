import java.util.Scanner;

public class AvaliacaoFuncionarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja avaliar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        String[] nomes = new String[quantidade];
        double[] notaTecnica = new double[quantidade];
        double[] notaComportamental = new double[quantidade];
        double[] medias = new double[quantidade];
        String[] desempenho = new String[quantidade];
        int[] tarefas = new int[quantidade];
        String[] produtividade = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\n Funcionário #" + (i + 1));

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Nota Técnica (0 a 10): ");
            notaTecnica[i] = scanner.nextDouble();

            System.out.print("Nota Comportamental (0 a 10): ");
            notaComportamental[i] = scanner.nextDouble();

            System.out.print("Quantidade de tarefas realizadas: ");
            tarefas[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            // Cálculo da média
            medias[i] = (notaTecnica[i] + notaComportamental[i]) / 2;

            // Classificação de desempenho
            if (medias[i] >= 8.0) {
                desempenho[i] = "Excelente";
            } else if (medias[i] >= 6.0) {
                desempenho[i] = "Bom";
            } else {
                desempenho[i] = "Necessita de melhoria";
            }

            // Classificação da produtividade
            if (tarefas[i] >= 20) {
                produtividade[i] = "Alta";
            } else if (tarefas[i] >= 10) {
                produtividade[i] = "Média";
            } else {
                produtividade[i] = "Baixa";
            }
        }

        // Exibição dos resultados
        System.out.println("\n=== RESULTADO FINAL ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nFuncionário: " + nomes[i]);
            System.out.println("Nota Técnica: " + notaTecnica[i]);
            System.out.println("Nota Comportamental: " + notaComportamental[i]);
            System.out.printf("Média: %.2f\n", medias[i]);
            System.out.println("Desempenho: " + desempenho[i]);
            System.out.println("Produtividade: " + produtividade[i]);
        }

        scanner.close();
    }
}
