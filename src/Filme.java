public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        String fichaTecnica = String.format("""
        Nome: %s
        Ano de Lançamento: %d
        Incluído no Plano: %s
        Avalição: %.2f
        Total de Avaliações: %d
        Duração em Minutos: %d
        """, nome, anoDeLancamento, incluidoNoPlano ? "sim" : "não", avaliacao, totalDeAvaliacoes, duracaoEmMinutos);
        System.out.println(fichaTecnica);
    }
}
