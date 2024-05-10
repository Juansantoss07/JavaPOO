import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;
        int nota = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Digite sua nota para o filme:");
            nota += leitura.nextInt();
        }
        media = (double) nota / 3;
        System.out.println("A média é: " + media);
    }
}
