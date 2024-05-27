import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é uma potência de 2:");
        int numero = ref.nextInt();

        boolean isPotenciaDeDois = (numero & (numero - 1)) == 0 && numero != 0;

        if (isPotenciaDeDois) {
            System.out.println(numero + " é uma potência de 2.");
        } else {
            System.out.println(numero + " não é uma potência de 2.");
        }
    }
}
