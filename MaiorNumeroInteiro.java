import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numeroUm = ref.nextInt();

        System.out.print("Digite o segundo número: ");
        int numeroDois = ref.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numeroTres = ref.nextInt();

        int maior = numeroUm;
        if (numeroDois > maior) {
            maior = numeroDois;
        }
        if (numeroTres > maior) {
            maior = numeroTres;
        }
        System.out.println("O maior número é: " + maior);
    }
}
