package cn.frank.dp.p_command;

public class UpperCommand implements ICommand {

	private String name ;
	
	public UpperCommand(String name) {
		super();
		this.name = name;
	}

	@Override
	public void execute() {
        System.out.println(String.format("UpperCommand: hello %s", name.toUpperCase()));
	}

}
