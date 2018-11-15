package observerpattern.subject;

import observerpattern.observer.Observer;

public interface Subject
{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();
}
