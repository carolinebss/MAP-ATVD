public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10, new Sedex());
        System.out.println("SEDEX: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new Pac());
        System.out.println("PAC: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new RetiradaNaLoja());
        System.out.println("Retirada: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new TransportadoraExpressa());
        System.out.println("Transportadora: R$ " + pedido.calcularFrete());

        pedido.setEstrategiaFrete(new FreteInternacional());
        System.out.println("Internacional: R$ " + pedido.calcularFrete());
    }
}
