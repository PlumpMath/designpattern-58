package cn.frank.dp.m_memnto;

import java.util.HashMap;
import java.util.Map;

public class MementoCache {
	
	private static Map<String, Memento> cache = new HashMap<String,Memento>();
	public static void storeMemento(String key, Memento memento)
	{
		if (cache.containsKey(key)) {
			throw new RuntimeException("memento key already exists");
		}
		cache.put(key, memento);
	}
	
	public static Memento retriveMemento(String key)
	{
		return cache.get(key);
	}

}
