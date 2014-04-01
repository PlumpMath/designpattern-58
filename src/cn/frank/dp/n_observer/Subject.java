package cn.frank.dp.n_observer;

import java.util.Observable;
import java.util.Observer;

public class Subject extends Observable {
	
	public void activateChange() {
		this.setChanged();
		this.notifyObservers("Changed");
	}

	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

	@Override
	public synchronized void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object parameter) {
		super.notifyObservers(parameter);
	}

}
