package cn.frank.dp.p_command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private Map<String, ICommand> commands = new HashMap<String, ICommand>();

	public Invoker() {
		super();
	}
    
	public void addCommand(String name, ICommand command){
		commands.put(name, command);
	}
	
	public void requestCommand(String commandName){
		ICommand command =commands.get(commandName);
		command.execute();
	}
    
    
    
}
