package complexCalculator.Model;

import complexCalculator.Controller.Calculable;
import complexCalculator.Controller.ComplexAdapter;

public class Calculator implements Calculable {
	private ComplexNumber number1;
	private ComplexNumber number2;
	private ComplexNumber resultNumber;

	public Calculator(ComplexNumber number1) {
		this.number1 = number1;

	}

	public void setSecondNumber(ComplexNumber number2) {
		this.number2 = number2;
	}

	@Override
	public Calculable sum(ComplexNumber number2) {
		if (number1 == null || number2 == null) {
			throw new IllegalStateException("Оба числа должны быть инициализированы перед выполнением операции");
		}
		double newReal = number1.getReal() + number2.getReal();
		double newImaginary = number1.getImaginary() + number2.getImaginary();
		this.resultNumber = new ComplexNumber(newReal, newImaginary);
		return new ComplexAdapter(this.resultNumber);
	}

	@Override
	public Calculable multi(ComplexNumber number2) {
		if (number1 == null || number2 == null) {
			throw new IllegalStateException("Оба числа должны быть инициализированы перед выполнением операции");
		}
		double newReal = number1.getReal() * number2.getReal() - number1.getImaginary() * number2.getImaginary();
		double newImaginary = number1.getReal() * number2.getImaginary() + number1.getImaginary() * number2.getReal();
		this.resultNumber = new ComplexNumber(newReal, newImaginary);
		return new ComplexAdapter(this.resultNumber);
	}

	@Override
	public Calculable division(ComplexNumber number2) {
		if (number1 == null || number2 == null) {
			throw new IllegalStateException("Оба числа должны быть инициализированы перед выполнением операции");
		}

		if (number2.getReal() == 0 && number2.getImaginary() == 0) {
			throw new ArithmeticException("Делить на 0 нельзя!");
		}

		double denominator = number2.getReal() * number2.getReal() + number2.getImaginary() * number2.getImaginary();

		double newReal = (number1.getReal() * number2.getReal() + number1.getImaginary() * number2.getImaginary())
				/ denominator;
		double newImaginary = (number1.getImaginary() * number2.getReal() - number1.getReal() * number2.getImaginary())
				/ denominator;

		this.resultNumber = new ComplexNumber(newReal, newImaginary);
		return new ComplexAdapter(this.resultNumber);
	}



	@Override
	public String toString() {
		return "Calculator [Первое число = " + number1 +
				", Второе число = " + number2 +
				", Результат = " + (resultNumber != null ? resultNumber : "результат еще не был вычислен") + "]";
	}

}//TODO Применил принцип разделения интерфейсов

