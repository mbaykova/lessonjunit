package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Addition extends Operation {

	public Addition(double number1, double number2) {
		super(number1, number2);
	}

	public double calculateResult() {
		return getNumber1() + getNumber2();
	}

	public String getSign() {
		return "+";
	}
}
