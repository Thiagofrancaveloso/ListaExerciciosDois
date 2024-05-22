import java.util.Scanner;

public class Main {

public static void main(String[] args) {
  Scanner ref = new Scanner(System.in);

    System.out.println("Insira um número inteiro: ");
    int numUm = ref.nextInt();

    if(numUm % 2 == 0){
      System.out.println("O número é par");
    }
    else{
      System.out.println("O número é ímpar");
    }
  }
}
