import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = ref.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("A temperatura em graus Celsius é: " + celsius + "°C");
    }
}
