package cn.frank.dp.q_state;

public class FireSwitch {

	private IState current = null;

	public FireSwitch() {
		super();
		current = new OffState();
	}
	
	public void switchFire(){
		current.switchNext(this);
	}

	public IState getCurrent() {
		return current;
	}

	public void setCurrent(IState current) {
		this.current = current;
	}
	
}
