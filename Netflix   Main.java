public class Main {
    String nome;
    int ano;
    String classificacao;
    String sinopse;
    String[] elenco;

    public Main(String nome, int ano, String classificacao, String sinopse, String[] elenco) {
        this.nome = nome;
        this.ano = ano;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.elenco = elenco;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + nome);
        System.out.println("Ano: " + ano);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Sinopse: " + sinopse);
        System.out.print("Elenco: ");
        for (String ator : elenco) {
            System.out.print(ator + ", ");
        }
        System.out.println("\n------------------------");
    }

    public static void main(String[] args) {
        Main somNaFaixa = new Main(
            "Som na Faixa",
            2022,
            "14 anos",
            "Esta aclamada série sobre a origem do Spotify rendeu um prêmio Kristallen para Christian Hillborg, que interpreta o cofundador da plataforma.",
            new String[] { "Edvin Endre", "Christian Hillborg", "Ulf Stenberg" }
        );

        Main round6 = new Main(
            "Round 6",
            2025,
            "18 anos",
            "Enquanto Jun-ho corre para encontrar a ilha, a tensão aumenta na rodada decisiva. Os últimos jogadores enfrentam uma situação impossível nos minutos finais do jogo.",
            new String[] { "Lee Jung-jae", "Lee Byung-hun", "Yim Si-wan" }
        );

        Main oppenheimer = new Main(
            "Oppenheimer",
            2023,
            "16 anos",
            "Oppenheimer constrói a bomba atômica neste 'monumento à ciência e à arrogância da genialidade', que levou o Oscar de Melhor Filme e vários Globos de Ouro.",
            new String[] { "Cillian Murphy", "Robert Downey Jr.", "Emily Blunt" }
        );

        Main teoriaDeTudo = new Main(
            "A Teoria de Tudo",
            2014,
            "10 anos",
            "Neste filme biográfico inspirador, um físico brilhante enfrenta uma doença inesperada e faz descobertas revolucionárias.",
            new String[] { "Eddie Redmayne", "Felicity Jones", "Charlie Cox" }
        );

        somNaFaixa.exibirInformacoes();
        round6.exibirInformacoes();
        oppenheimer.exibirInformacoes();
        teoriaDeTudo.exibirInformacoes();
    }
}
