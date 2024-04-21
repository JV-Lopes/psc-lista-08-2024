public class Exercicio4 {
    public static void main(String[] args) {
        int numero = 10;
        char resultado = verificarPositivoNegativo(numero);
        System.out.println("O resultado é: " + resultado);
    }

    public static char verificarPositivoNegativo(int num) {
        if (num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
