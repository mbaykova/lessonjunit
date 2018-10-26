package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Division extends Operation {

	public Division(double number1, double number2) {
		super(number1, number2);
	}

	public double calculateResult() {
		if (getNumber2() == 0){
			throw new DivisionException("На 0 делить нельзя!");
		}
		return getNumber1() / getNumber2();
	}

	public String getSign() {
		return "/";
	}
}
