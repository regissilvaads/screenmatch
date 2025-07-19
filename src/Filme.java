public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

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
