package complexCalculator.Model;

public abstract class AbNumber {
	protected double real;

	public AbNumber(double real) {
		this.real = real;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}
	

}//TODO Принцип подстановки Liskov + Принцип Открытости/закрытости
