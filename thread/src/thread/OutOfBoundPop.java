package thread;

public class OutOfBoundPop extends Exception {
	
	private String errorMessage;

	public OutOfBoundPop(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	

}
