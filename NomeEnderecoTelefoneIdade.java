import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = ref.nextLine();

        System.out.print("Quantos anos você tem? ");
        int idade = ref.nextInt();
        ref.nextLine();

        System.out.print("Qual é o seu endereço? ");
        String endereco = ref.nextLine();

        System.out.print("Qual é o seu telefone? ");
        String telefone = ref.nextLine();

        String frase = "Seu nome é " + nome + ", você tem " + idade + " anos, mora na rua " + endereco + " e seu telefone é " + telefone + ".";

        System.out.println(frase);
    }
}
