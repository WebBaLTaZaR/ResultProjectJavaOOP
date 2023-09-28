package calculator;

public class LogerCalculatorFactory implements ICalculableFactory {
	private ConsoleLoger consoleLoger;
	public LogerCalculatorFactory(ConsoleLoger consoleLoger) {
		this.consoleLoger = consoleLoger;
	}
	@Override
	public Calculable create(int primaryArg) {
		return new LogCalculator(consoleLoger,new Calculator(primaryArg));
	}
	
}
