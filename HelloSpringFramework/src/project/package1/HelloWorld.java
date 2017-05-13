package project.package1;

public class HelloWorld {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void printMessage() {
		System.out.println("Message: " + message);
	}
	
	public void init() {
		System.out.println("Bean is going through init.");
	}
	
	public void destroy() {
		System.out.println("Bean is going through destroy.");
	}
}
