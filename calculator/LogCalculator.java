package calculator;

public class LogCalculator implements Calculable {
	private ConsoleLoger consoleLoger;
	private Calculable calculable;

	public LogCalculator(ConsoleLoger consoleLoger, Calculable calculable) {
		this.consoleLoger = consoleLoger;
		this.calculable = calculable;
	}

	@Override
	public Calculable sum(int arg) {
		consoleLoger.loger("Мы в методе сумм с аргументом: " + arg);
		return calculable.sum(arg);
	}

	@Override
	public Calculable multi(int arg) {
		consoleLoger.loger("Мы в методе умножения с аргументом: " + arg);
		return calculable.multi(arg);
	}

	@Override
	public int getResult() {
		consoleLoger.loger("Мы в методе результата: ");
		return calculable.getResult();
	}

}
