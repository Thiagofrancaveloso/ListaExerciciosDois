import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite o número máximo para a sequência de Fibonacci: ");
        int numMax = ref.nextInt();

        System.out.println("Sequência de Fibonacci até o número " + numMax + ":");
        for (int i = 0; fib(i) <= numMax; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
