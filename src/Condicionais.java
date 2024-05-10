public class Condicionais {
    public static void main(String[] args) {

        int anoLancamento = 2022;
        String plano = "basic";
        boolean incluidoNoPlano = true;

        if (anoLancamento <= 2000) {
            System.out.println("O filme em questão é retro.");
        } else {
            System.out.println("O filme é lançamento");
        }

        if (plano.equals("plus") && incluidoNoPlano){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme não está incluso no seu plano");
        }
    }
}
