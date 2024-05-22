import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 6; i++){
            System.out.println("\nInsira o " + i + "° número inteiro: ");
            int fat = ref.nextInt();
            soma += fat;
        }

        double media = (double) soma / 6;

        System.out.println("A média de 6 números é: " + media);

    }
}
