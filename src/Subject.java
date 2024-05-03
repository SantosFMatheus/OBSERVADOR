// Define a interface Subject que será implementada pela classe Estoque.
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
