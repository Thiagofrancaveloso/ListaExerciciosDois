import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite 'SIM' ou 'NAO': ");
        String entrada = ref.nextLine();

        int resultado = verificaResposta(entrada);

        if (resultado == 1) {
            System.out.println("Retorno: 1");
        } else if (resultado == 0) {
            System.out.println("Retorno: 0");
        }
    }

    public static int verificaResposta(String str) {
        if (str.equalsIgnoreCase("SIM")) {
            return 1;
        } else if (str.equalsIgnoreCase("NAO")) {
            return 0;
        } else {
            return -1;
        }
    }
}
