import java.util.*;

public class pares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor alvo: ");
        int v = scanner.nextInt();

        int[] valores = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
        }

        int pares = calcularPares(valores, v);

        System.out.println("O quantidade de pares com diferença igual a " + v + " é: " + pares);
    }

    public static int calcularPares(int[] valores, int v) {

        int pares = 0;

        for (int i = 0; i < valores.length; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                if (Math.abs(valores[i] - valores[j]) == v) {
                    pares++;
                }
            }
        }

        return pares;
    }
}
