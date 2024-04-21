public class Exercicio3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int soma = calcularSoma(num1, num2, num3);
        System.out.println("A soma dos três números é: " + soma);
    }

    public static int calcularSoma(int a, int b, int c) {
        return a + b + c;
    }
}
