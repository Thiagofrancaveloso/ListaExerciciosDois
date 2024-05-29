import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner ref = new  Scanner(System.in);

    System.out.println("Digite um número inteiro: ");
    int num = ref.nextInt();

      if (num == 2){
      System.out.println("Número é primo");
        }else if (num % 2 == 0) {
      System.out.println("Número não é primo");
        } else {
      System.out.println("Número é o número primo");
        }
    }
}
