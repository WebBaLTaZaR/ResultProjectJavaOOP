package complexCalculator.Controller;

import complexCalculator.Model.Calculator;
import complexCalculator.Model.ComplexNumber;

public class ComplexCalculatorFactory implements IComplexCalculableFactory {

	@Override
	public Calculable create(ComplexNumber number) {
		return new Calculator(number);
	}

}//TODO Принцип разделения интерфейсов
