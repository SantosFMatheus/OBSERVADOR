
public interface Sujeito {
    void addObserver(Observador o);
    void removeObserver(Observador o);
    void notifyObservers();
}
