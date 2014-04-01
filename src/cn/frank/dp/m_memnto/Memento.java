package cn.frank.dp.m_memnto;

import java.util.Map;

public class Memento {
	
	private Map<String,String> memento = null;

	public Memento(Map<String, String> memento) {
		super();
		this.memento = memento;
	}

	public Map<String, String> getMemento() {
		return memento;
	}

}
