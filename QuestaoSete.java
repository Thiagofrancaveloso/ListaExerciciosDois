import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numeroDois = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int numeroTres = scanner.nextInt();

        int maiorNumero = numeroUm;
        
        if (numeroDois > maiorNumero) {
            maiorNumero = numeroDois;
        }

        if (numeroTres > maiorNumero) {
            maiorNumero = numeroTres;
        }
        
        System.out.println("O maior número digitado é: " + maiorNumero);

    }
}
