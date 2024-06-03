import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double metros = ref.nextDouble();

        double decimetros = metros * 10;
        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("O valor em decímetros é: " + decimetros + " dm");
        System.out.println("O valor em centímetros é: " + centimetros + " cm");
        System.out.println("O valor em milímetros é: " + milimetros + " mm");
    }
}
