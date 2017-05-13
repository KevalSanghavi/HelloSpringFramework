package project.package13;

public class Logging {
	
	/**
	 * This is the method which I would like to execute before a selected method execution.
	 */
	public void beforeAdvice() {
		System.out.println("Inside beforeAdvice.");
	}

	/**
	 * This is the method which I would like to execute after a selected method execution.
	 */
	public void afterAdvice() {
		System.out.println("Inside afterAdvice.");
	}

	/**
	 * This is the method which I would like to execute when any method returns.
	 */
	public void afterReturningAdvice(Object retVal) {
		System.out.println("afterReturningAdvice: Returning: " + retVal.toString());
	}

	/**
	 * This is the method which I would like to execute if there is an exception raised.
	 */
	public void AfterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("AfterThrowingAdvice: Exception: " + ex.toString());
	}
	
}
