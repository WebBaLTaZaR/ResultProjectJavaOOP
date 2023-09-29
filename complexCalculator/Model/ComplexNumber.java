package complexCalculator.Model;

public class ComplexNumber {
	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
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
}
