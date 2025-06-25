import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é **par**.");
            } else {
                System.out.println("O número " + numero + " é **ímpar**.");
            }

            System.out.print("Deseja continuar? (s para sim): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }
}
