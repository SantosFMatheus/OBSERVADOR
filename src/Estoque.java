import java.util.ArrayList;
import java.util.List;
// Implementa a interface Subject e gerencia a lista de Observers e o valor do estoque.
public class Estoque implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private double valorEstoque;

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.valorEstoque);
        }
    }
}

