import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        int quantidadeValores = 10;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = ref.nextInt();

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("O maior valor lido é: " + maior);
        System.out.println("O menor valor lido é: " + menor);
    }
}
