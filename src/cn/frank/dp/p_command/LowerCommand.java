package cn.frank.dp.p_command;

public class LowerCommand implements ICommand {

	private String name;
	
	public LowerCommand(String name) {
		super();
		this.name = name;
	}

	@Override
	public void execute() {
		System.out.println(String.format("LowerCommand: hello %s", name.toLowerCase()));
	}

}
