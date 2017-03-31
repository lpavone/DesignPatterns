package Observer;

/**
 * Created by leonardo on 07/02/17.
 */
public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
