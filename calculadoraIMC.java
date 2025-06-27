import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
         String nome[] = new String[quantidade];
         double peso[] = new double[quantidade];
         double altura[] = new double[quantidade];


for (int i = 0;i < quantidade; i++) {
            System.out.print("Digite o seu nome ");
            nome[i] = scanner.nextLine();
           
             System.out.print("Digite o seu peso");
            peso[i] = scanner.nextDouble();

             System.out.print("Digite a sua altura");
            altura[i] = scanner.nextDouble();
            scanner.nextLine();

    }

    for (int i = 0; i < quantidade; i++) {
        double imc = peso[i] / (altura[i] * altura[i]);
      System.out.printf("% tem IMC = %.2f-", nome[i], imc);
    if (imc < 30){
        System.out.print("abaixo do peso");
    } else if (imc < 65){
        System.out.print("peso normal");
    } else if (imc < 90){
        System.ou.print("acima do peso");
    } else (imc < 140){
        System.out.print("obesidade");
    }



    }



    scanner.close();
}
}
