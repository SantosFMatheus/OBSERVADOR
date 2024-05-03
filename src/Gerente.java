// Implementa a interface Observer e define como o Gerente será notificado.
public class Gerente implements Observer {
    @Override
    public void update(double valorEstoque) {
        if (valorEstoque >= 1000) {
            System.out.println("Atenção, o valor do estoque é de: R$" + valorEstoque);
        }
    }
}

