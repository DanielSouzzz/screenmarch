public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.incluidoNoPlano = true;
        meuFilme.avaliacao = 4.7;
        meuFilme.totalDeAvaliacoes = 5008;
        meuFilme.duracaoEmMinutos = 177;

        meuFilme.exibeFichaTecnica();
    }
}