package meyerCipher2;

public class ExceptionsMeyer extends Exception{
	public ExceptionsMeyer() {
		super("Something is wrong");
	}
	
	public ExceptionsMeyer(String m) {
		super(m);
	}
}
