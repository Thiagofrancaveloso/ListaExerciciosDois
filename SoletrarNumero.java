import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = ref.nextInt();

        String numeroSoletrado = Integer.toString(numero);
        for (char digito : numeroSoletrado.toCharArray()) {
            System.out.print(digito + " ");
        }
    }
}
