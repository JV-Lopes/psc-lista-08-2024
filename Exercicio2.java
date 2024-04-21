import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        scanner.close();

        imprimirPadrao(n);
    }

    public static void imprimirPadrao(int n) {
        ArrayList<Integer> linha = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            linha.clear();
            for (int j = 1; j <= i; j++) {
                linha.add(j);
            }
            System.out.println(linha);
        }
    }
}
