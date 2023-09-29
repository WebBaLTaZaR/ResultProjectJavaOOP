package complexCalculator.View;

import java.util.Scanner;

import complexCalculator.Controller.Calculable;
import complexCalculator.Controller.ComplexCalculatorFactory;
import complexCalculator.Model.Calculator;
import complexCalculator.Model.ComplexNumber;

public class ViewCalculator {
	ComplexCalculatorFactory complexCalculatorFactory = new ComplexCalculatorFactory();

	public void run() {
		while (true) {
			int realArg1 = promptInt("Введите действительную часть первого комплексного числа: ");
			int imaginaryArg1 = promptInt("Введите мнимую часть первого комплексного числа: ");
			ComplexNumber number1 = new ComplexNumber(realArg1, imaginaryArg1);
			Calculable calculator = complexCalculatorFactory.create(number1);

			while (true) {
				String cmd = prompt("Введите команду (* , + , / , =) : ");
				ComplexNumber number2 = null;

				if (cmd.equals("*") || cmd.equals("+") || cmd.equals("/")) {
					int realArg2 = promptInt("Введите действительную часть второго комплексного числа: ");
					int imaginaryArg2 = promptInt("Введите мнимую часть второго комплексного числа: ");
					number2 = new ComplexNumber(realArg2, imaginaryArg2);
					((Calculator) calculator).setSecondNumber(number2);
				}
				if (cmd.equals("*")) {
					calculator.multi(number2);
					continue;
				}
				if (cmd.equals("+")) {
					calculator.sum(number2);
					continue;
				}
				if (cmd.equals("/")) {
					calculator.division(number2);
					continue;
				}
				if (cmd.equals("=")) {
					System.out.printf("Результат: %s\n", calculator);
					break;
				}
			}
			String cmd = prompt("Еще посчитать (Y/N)?");
			if (cmd.equals("Y")) {
				continue;
			}
			break;
			
		}
	}

	private String prompt(String message) {
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		return in.nextLine();
	}

	private int promptInt(String message) {
		Scanner in = new Scanner(System.in);
		int result = 0;
		boolean valid = false;

		while (!valid) {
			try {
				System.out.print(message);
				result = Integer.parseInt(in.nextLine());
				valid = true;
			} catch (NumberFormatException e) {
				System.out.println("Пожалуйста, введите корректное целое число.");
			}
		}

		return result;
	}

	@Override
	public String toString() {
		return "ViewCalculator [complexCalculatorFactory=" + complexCalculatorFactory + "]";
	}
}
