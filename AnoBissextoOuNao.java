import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner ref = new Scanner(System.in);

System.out.println("Insira um ano");
    int ano = ref.nextInt();

    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
      System.out.println("O ano é bissexto");
    } else {
      System.out.println("O ano não é bissexto");
    }

  }
}
