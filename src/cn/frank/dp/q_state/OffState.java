package cn.frank.dp.q_state;

public class OffState implements IState{

	@Override
	public void switchNext(FireSwitch sw) {
		System.out.println("prepare switch from off to open");
		sw.setCurrent(new OpenState());
	}

}
