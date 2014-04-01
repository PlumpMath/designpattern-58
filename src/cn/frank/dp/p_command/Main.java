package cn.frank.dp.p_command;

public class Main {

	public static void main(String[] args) {
 
		Invoker invoker = new Invoker();
		invoker.addCommand("Upper", new UpperCommand("Frank"));
		invoker.addCommand("Lower", new LowerCommand("Frank"));
		
		invoker.requestCommand("Upper");
		invoker.requestCommand("Lower");
	}

}
