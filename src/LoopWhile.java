import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int contador = 0;

        while (nota != -1){
            System.out.println("Digite sua nota ou digite -1 para finalizar:");
            nota = leitura.nextDouble();
            if(nota != -1) {
                media += nota;
                contador++;
            }
        }
        media /=  contador;
        System.out.println("A média é: " + media);
    }
}
