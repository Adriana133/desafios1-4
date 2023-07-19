import java.util.Scanner;
import java.util.*;

public class OrdenarParesImpares {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // quantidade de valores que devem ser inseridos
            int n;

            do {
                System.out.print("Digite a quantidade de valores que serão ordenados, número deve ser superior a 0 e menor ou igual a 10^5: ");
                n = scanner.nextInt();
            } while (n <= 1 || n > Math.pow(10, 5));

            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            // separa os valores pares e impares e dois arrays distintos
            for (int x = 0; x < n; x++) {
                int valor;

                do {
                    System.out.print("Digite um valor não negativo: ");
                    valor = scanner.nextInt();
                } while (valor < 0);

                if (valor % 2 == 0) {
                    pares.add(valor);
                } else {
                    impares.add(valor);
                }
            }

            // Ordena os valores pares em ordem crescente
            Collections.sort(pares);

            // Ordena os valores ímpares em ordem decrescente
            Collections.sort(impares, Collections.reverseOrder());

            // Impressão dos valores ordenados
            for (int valor : pares) {
                System.out.println(valor);
            }

            for (int valor : impares) {
                System.out.println(valor);
            }
        }
    }
