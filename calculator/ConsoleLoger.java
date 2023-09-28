package calculator;

public class ConsoleLoger implements Logable {

	@Override
	public void loger(String message) {
		System.out.println(message);
	}
	
}
