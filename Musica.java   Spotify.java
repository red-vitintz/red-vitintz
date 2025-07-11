public class Musica {
    private String nomeFaixa;
    private int anoLancamento;
    private String artista;
    private String genero;
    private int duracaoSegundos;

    public Musica(String nomeFaixa, int anoLancamento, String artista, String genero, int duracaoSegundos) {
        this.nomeFaixa = nomeFaixa;
        this.anoLancamento = anoLancamento;
        this.artista = artista;
        this.genero = genero;
        this.duracaoSegundos = duracaoSegundos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome da faixa: " + nomeFaixa);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracaoSegundos + " segundos");
        System.out.println("-----------------------------");
    }
}







-----------------------------------------------------------------------





  public class Spotify {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Blinding Lights", 2019, "The Weeknd", "Pop", 200);
        Musica musica2 = new Musica("Bohemian Rhapsody", 1975, "Queen", "Rock", 354);
        Musica musica3 = new Musica("Shape of You", 2017, "Ed Sheeran", "Pop", 233);
        Musica musica4 = new Musica("Smells Like Teen Spirit", 1991, "Nirvana", "Grunge", 301);
        Musica musica5 = new Musica("Despacito", 2017, "Luis Fonsi", "Reggaeton", 229);

        musica1.exibirInformacoes();
        musica2.exibirInformacoes();
        musica3.exibirInformacoes();
        musica4.exibirInformacoes();
        musica5.exibirInformacoes();
    }
}
