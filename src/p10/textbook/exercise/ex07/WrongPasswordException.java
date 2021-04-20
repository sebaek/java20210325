package p10.textbook.exercise.ex07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
		
	}
	
	public WrongPasswordException(String message) {
		super(message);
	}
}
