public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        double nota = 8.1;
        System.out.println("Nota:" + nota);

        double media = (9.1 + 8.0 + 6.1 )/ 3;
        System.out.println("Nota média: " + media);

        String sinopse = """
                    Um filme de aventura muito bom, que tem aviões.
                    Um relançamento muito top.
                """;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao + " estrelas");
    }
}