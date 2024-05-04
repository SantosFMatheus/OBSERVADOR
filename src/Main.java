// Classe principal que configura o sistema e testa as notificações.
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Manager manager = new Manager();

        estoque.addObserver(manager);

        estoque.setValorEstoque(999);

        estoque.setValorEstoque(1001);
    }
}
