// Classe principal que configura o sistema e testa as notificações.
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Gerente gerente = new Gerente();

        estoque.addObserver(gerente);

        // Exemplo com valor menor que 1 mil reais
        estoque.setValorEstoque(999);

        // Exemplo com valor maior que 1 mil reais
        estoque.setValorEstoque(1001);
    }
}
