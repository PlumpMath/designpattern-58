package cn.frank.dp.m_memnto;

import java.util.HashMap;
import java.util.Map;

public class Originator {

	private String name = "";
	private String phone = "";

	public static void main(String[] args) {
		Originator o = new Originator("Frank","13585948139");
		o.dispaly();
		o.createMemento();
		o.setName("Fan Jun");
		o.setPhone("021-38502020");
		o.dispaly();
		o.retriveMemento();
		o.dispaly();	
	}
	 
	public Originator(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public void dispaly(){
		System.out.println(String.format("name %s || phone %s", this.getName(),this.getPhone()));
		System.out.println("++++++++++++++++++++++++++++");
	}
	
	public void createMemento(){
		MementoCache.storeMemento("HISTORY", toMemento());
	}
	
	public void retriveMemento(){
		Memento memento = MementoCache.retriveMemento("HISTORY");
		fromMemento(memento);
	}

    public Memento toMemento(){
    	Map<String,String> memento = new HashMap<String,String>();
    	memento.put("name", this.getName());
    	memento.put("phone", this.getPhone());
    	return new Memento(memento);
    }
    
    public void fromMemento(Memento memento){
    	this.setName(memento.getMemento().get("name"));
    	this.setPhone(memento.getMemento().get("phone"));
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
