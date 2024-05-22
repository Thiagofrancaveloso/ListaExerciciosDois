import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  Scanner ref = new Scanner(System.in);
  
    System.out.println("Insira um número inteiro: ");
    int numUm = ref.nextInt();

    System.out.println("Insira outro número inteiro: ");
    int numDois = ref.nextInt();

    int soma = numUm + numDois;
 
    System.out.println("A soma dos números inteiros é " + soma);
}
}
