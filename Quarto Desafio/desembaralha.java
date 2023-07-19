import java.util.Scanner;

public class desembaralha {

    public static void main(String[] args) {

        System.out.print("Digite o número de casos de teste: ");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

            System.out.println("Digite uma frase embaralhada:");

            String linha = scanner.nextLine();

            String resultado = processaLinha(linha);

            System.out.println(resultado);
        }
    }

    public static String processaLinha(String linha) {
        int posMeio = linha.length() / 2;

        StringBuilder resultado = new StringBuilder();

        // Desembaralha a metade esquerda da linha
        for (int x = posMeio - 1; x >= 0; x--) {
            resultado.append(linha.charAt(x));
        }

        // Desembaralha a metade direita da linha
        for (int x = linha.length() - 1; x >= posMeio; x--) {
            resultado.append(linha.charAt(x));
        }

        return resultado.toString();
    }
}
