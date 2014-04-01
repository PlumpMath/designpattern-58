package cn.frank.dp.o_chain;


public class UrgentHandler implements IHandler {

	@Override
	public void handle(Main.Request request) {
		System.out.println("Urgent case coming and handled");
	}

}
