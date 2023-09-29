package complexCalculator.Controller;

import complexCalculator.Model.ComplexNumber;

public interface Calculable {
	Calculable sum(ComplexNumber number2);

	Calculable multi(ComplexNumber number2);

	Calculable division(ComplexNumber number2);

}//TODO Применил принцип разделения интерфейсов
