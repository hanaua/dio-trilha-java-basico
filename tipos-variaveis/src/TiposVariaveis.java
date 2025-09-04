public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        System.out.println("O valor de numero é: " + numero);

        final double VALOR_DE_PI = 3.14;
        System.out.println("O valor de PI é: " + VALOR_DE_PI);

        
    }
}
