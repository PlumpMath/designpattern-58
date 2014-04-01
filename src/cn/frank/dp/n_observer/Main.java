package cn.frank.dp.n_observer;

import java.util.Observer;

public class Main {

	public static void main(String[] args) {

		Subject s = new Subject();
		Observer o = new MyObserver();
		s.addObserver(o);
        s.activateChange();
	}

}
