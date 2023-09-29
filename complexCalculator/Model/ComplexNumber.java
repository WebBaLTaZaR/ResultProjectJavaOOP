package complexCalculator.Model;

public class ComplexNumber extends AbNumber {
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		super(real);
		this.imaginary = imaginary;
	}
	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	@Override
	public String toString() {
		if (imaginary >= 0) {
			return real + " + " + imaginary + "i";
		} else {
			return real + " - " + (-imaginary) + "i";
		}
	}
//TODO В этом классе проявлен Принцип Единственной ответвственности
}//TODO Принцип подстановки Liskov + Принцип Открытости/закрытости
