package cn.frank.dp.q_state;

public class AdjustState implements IState {

	@Override
	public void switchNext(FireSwitch sw) {
		System.out.println("Adjust begin to off fire");
		sw.setCurrent(new OffState());
	}

}
