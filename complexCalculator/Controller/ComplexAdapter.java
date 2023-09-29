package complexCalculator.Controller;

import complexCalculator.Model.ComplexNumber;

public class ComplexAdapter implements Calculable {
    private ComplexNumber complexNumber;

    public ComplexAdapter(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }

    @Override
    public Calculable sum(ComplexNumber other) {
        double newReal = complexNumber.getReal() + other.getReal();
        double newImaginary = complexNumber.getImaginary() + other.getImaginary();
        return new ComplexAdapter(new ComplexNumber(newReal, newImaginary));
    }

	@Override
	public Calculable multi(ComplexNumber number2) {
        double newReal = complexNumber.getReal() * number2.getReal() - complexNumber.getImaginary() * number2.getImaginary();
        double newImaginary = complexNumber.getReal() * number2.getImaginary() + complexNumber.getImaginary() * number2.getReal();
        return new ComplexAdapter(new ComplexNumber(newReal, newImaginary));
    }

	@Override
	public Calculable division(ComplexNumber number2) {
		if (complexNumber == null || number2 == null) {
			throw new IllegalStateException("Оба числа должны быть инициализированы перед выполнением операции");
		}
		
		
		if (number2.getReal() == 0 && number2.getImaginary() == 0) {
			throw new ArithmeticException("На 0 делить нельзя");
		}
	
		double denominator = number2.getReal() * number2.getReal() + number2.getImaginary() * number2.getImaginary();
	
		double newReal = (complexNumber.getReal() * number2.getReal() + complexNumber.getImaginary() * number2.getImaginary()) / denominator;
		double newImaginary = (complexNumber.getImaginary() * number2.getReal() - complexNumber.getReal() * number2.getImaginary()) / denominator;
	
		return new ComplexAdapter(new ComplexNumber(newReal, newImaginary));
	}


}//TODO Применил структурный паттерн адаптера для связи ComplexNumber и Calculable
