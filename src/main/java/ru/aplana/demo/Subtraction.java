package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public class Subtraction extends Operation {

	public Subtraction(float number1, float number2) {
		super(number1, number2);
	}

	public float calculateResult() {
		return getNumber1() - getNumber2();
	}

	public String getSign() {
		return "-";
	}
}
