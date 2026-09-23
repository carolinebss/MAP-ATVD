public class FreteInternacional implements FreteStrategy {
    private static final double TAXA_IMPORTACAO = 25.0;

    @Override
    public double calcularFrete(double peso) {
        return TAXA_IMPORTACAO + peso * 12;
    }
}
