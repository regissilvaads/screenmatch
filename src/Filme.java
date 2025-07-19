public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }


    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }

    void avalia(double nota) {
        this.somaAvaliacao += nota;
        this.totalDeAvaliacoes++;
    }

    double calculaMedia() {
        return this.somaAvaliacao / this.totalDeAvaliacoes;
    }
}
