package cn.frank.dp.r_strategy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IStrategy strategy = Main.getStrategy("Linux");
		strategy.replace("/n");

	}
	
	public static IStrategy getStrategy(String osCode){
		IStrategy strategy = null;
		if ("LINUX".equalsIgnoreCase(osCode)) {
			strategy = new LinuxStrategy();
		}else{
			strategy = new WindowStrategy();
		}
		return strategy ; 
	}

}
