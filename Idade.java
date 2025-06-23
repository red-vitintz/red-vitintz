import java.util.Scanner;

public class Idade {
String nome;
int idade;

void apresentar(){
System.out.print("Ola meu nome é " + nome + " tenho " + idade + " anos. ");

 if (idade < 12) {
        System.out.println("Voce é uma criança");
    } else if(idade <18) {
        System.out.println("Voce é um adolescente.");
    } else if (idade < 60) {
        System.out.println("Voce é um adulto");
    } else {
        System.out.println("Voce é um idoso");
    }
}
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Idade i = new Idade();
    System.out.print("digite seu nome:");
    i.nome= scanner.nextLine();
    System.out.print("digite sua idade:");
    i.idade= scanner.nextInt();
    scanner.nextLine();
    i.apresentar();

    scanner.close();
}
}
