import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ref = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numUm = ref.nextInt();

        System.out.println("Insira um número inteiro: ");
        int numDois = ref.nextInt();

        System.out.println("Insira um número inteiro: ");
        int numTres = ref.nextInt();

        System.out.println("Insira um número inteiro: ");
        int numQuatro = ref.nextInt();

        System.out.println("Insira um número inteiro: ");
        int numCinco = ref.nextInt();

        System.out.println("Insira um número inteiro: ");
        int numSeis = ref.nextInt();

        double soma = numUm + numDois + numTres + numQuatro + numCinco + numSeis;
        
        double media = soma / 6;
        
        System.out.println("A média de 6 números é: " + media);

    }
}
