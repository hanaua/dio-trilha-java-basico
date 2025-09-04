public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.00;
        System.out.println("O valor do salário mínimo é: " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("O valor de numeroCurto2 é: " + numeroCurto2);

        int numero = 10;
        System.out.println("O valor de numero é: " + numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println("O valor de PI é: " + VALOR_DE_PI);  
    }
}
