package complexCalculator.Controller;

import complexCalculator.Model.ComplexNumber;

public interface IComplexCalculableFactory {
	Calculable create(ComplexNumber number);
}//TODO Принцип разделения интерфейсов
//TODO Применил Порождающий фабричный паттерн 
