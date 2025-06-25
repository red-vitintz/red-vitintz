import java.util.Scanner;

public class ParOuImparFOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você quer verificar? ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é PAR.");
            } else {
                System.out.println("O número " + numero + " é ÍMPAR.");
            }
        }

        System.out.println("\nObrigado por usar o programa! Até logo!");
        scanner.close();
    }
}
