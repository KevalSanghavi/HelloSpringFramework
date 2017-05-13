package project.package1;

public class Messanger {
	
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
	
}
