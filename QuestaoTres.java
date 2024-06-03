import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
  
        Scanner ref = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = ref.nextInt();

        int fat = 1; 

        for(int i = 1; i <= num; i++){
            fat *= i; 
        }

        System.out.println("O fatorial é: " + fat);
    
    }
}
