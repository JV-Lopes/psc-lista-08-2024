public class Exercicio5 {
    public static void main(String[] args) {
        double custo = 100.0;
        double taxaImposto = 10.0;
        
        double novoCusto = somaImposto(taxaImposto, custo);
        System.out.println("O novo custo com imposto é: " + novoCusto);
    }

    public static double somaImposto(double taxaImposto, double custo) {
        double imposto = custo * (taxaImposto / 100.0);
        return custo + imposto;
    }
}
