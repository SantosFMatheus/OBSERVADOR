import java.util.ArrayList;
import java.util.List;

public class Estoque implements Sujeito {
    private final List<Observador> observers = new ArrayList<>();
    private double valorEstoque;

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
        notifyObservers();
    }

    @Override
    public void addObserver(Observador o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observador o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observador o : observers) {
            o.update(this.valorEstoque);
        }
    }
}

