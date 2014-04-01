package cn.frank.dp.o_chain;


public class Main {

	public static void main(String[] args) {
		Main.Request request = new Main.Request("URGENT Task", "Response at once");
		IHandler handler = new HelpdeskHandler();
		handler.handle(request);
		request = new Main.Request("Normal", "Normal");
        handler.handle(request);
	}
	
	static class Request{
		private String taskName = "";
		private String taskContent = "";
		
		public Request(String taskName, String taskContent){
			this.taskName = taskName;
			this.taskContent = taskContent;
		}

		public String getTaskName() {
			return taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskContent() {
			return taskContent;
		}

		public void setTaskContent(String taskContent) {
			this.taskContent = taskContent;
		}
		
	}

}
