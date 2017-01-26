package observerpattern.withjavaapi;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by sjchen on 1/25/17.
 */
public abstract class MyObserver implements Observer {
    private List<Observable> observables;

    public MyObserver() {
        observables = new ArrayList<>();
    }

    public MyObserver(Observable observable) {
        this();
        register(observable);
    }

    public void register(Observable observable) {
        observable.addObserver(this);
        observables.add(observable);
    }

    public void remove(Observable observable) {
        observable.deleteObserver(this);
        observables.remove(observable);
    }
}
