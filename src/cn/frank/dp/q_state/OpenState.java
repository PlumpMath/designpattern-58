package cn.frank.dp.q_state;

public class OpenState implements IState {

	@Override
	public void switchNext(FireSwitch sw) {
        System.out.println("start to adjust fire");
        sw.setCurrent(new AdjustState());
	}

}
