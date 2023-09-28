package javaResult.ResultProjectJavaOOP.complexCalculator;

import java.util.Scanner;

public class ViewCalculator {
	public void run() {
		while (true) {
			int realArg = promptInt("Введите действительную часть первого комплексного числа: ");
			int imaginaryArg = promptInt("Введите мнимую часть первого комплексного числа: ");
			Calculable calculator = calculableFactory.create(primaryArg);
			while (true) {
				String cmd = prompt("Введите команду (*, +, =) : ");
				if (cmd.equals("*")) {
					int arg = promptInt("Введите второй аргумент: ");
					calculator.multi(arg);
					continue;
				}
				if (cmd.equals("+")) {
					int arg = promptInt("Введите второй аргумент: ");
					calculator.sum(arg);
					continue;
				}
				if (cmd.equals("=")) {
					int result = calculator.getResult();
					System.out.printf("Результат %d\n", result);
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
		System.out.print(message);
		return Integer.parseInt(in.nextLine());
	}
}
