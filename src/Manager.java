
public class Manager implements Observador {
    @Override
    public void update(double valorEstoque) {
        if (valorEstoque >= 1000) {
            System.out.println("Atenção, o valor do estoque é de: R$" + valorEstoque);
        }
    }
}

