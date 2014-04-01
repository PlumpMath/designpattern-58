package cn.frank.dp.o_chain;


public class HelpdeskHandler implements IHandler{

	@Override
	public void handle(Main.Request request) {
		System.out.println("HelpDesk start work");
		if (request.getTaskName().startsWith("URGENT")) {
			System.out.println("Urgent case escalated");
			getSuccessor().handle(request);
		    return;
		}
		System.out.println("Normal case handled");
				
	}
	
	public IHandler getSuccessor(){
		return new UrgentHandler();
	}

}
