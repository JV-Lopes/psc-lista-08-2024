import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char continuar;
        
        do {
            System.out.print("Digite a hora (formato 24 horas): ");
            int hora = scanner.nextInt();
            System.out.print("Digite os minutos: ");
            int minutos = scanner.nextInt();

            String resultado = converterPara12Horas(hora, minutos);
            System.out.println("Hora convertida: " + resultado);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        scanner.close();
    }

    public static String converterPara12Horas(int hora, int minutos) {
        String periodo;
        
        if (hora >= 0 && hora < 12) {
            periodo = "A.M.";
        } else {
            periodo = "P.M.";
        }

        if (hora == 0) {
            hora = 12; // Se for meia-noite, exiba como 12 A.M.
        } else if (hora > 12) {
            hora -= 12; // Converte horas maiores que 12 para o formato de 12 horas
        }

        return hora + ":" + minutos + " " + periodo;
    }
}
