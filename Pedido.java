public class Pedido {
    private double peso;
    private FreteStrategy estrategiaFrete;

    public Pedido(double peso, FreteStrategy estrategiaFrete) {
        this.peso = peso;
        this.estrategiaFrete = estrategiaFrete;
    }

    public void setEstrategiaFrete(FreteStrategy estrategiaFrete) {   //responsável por permitir a troca de estratégia em tempo de execução
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        if (estrategiaFrete == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete definida");
        }
        return estrategiaFrete.calcularFrete(peso);
    }
}
