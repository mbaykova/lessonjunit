package ru.aplana.demo;

/**
 * Created by Maria on 20.10.2018.
 */
public abstract class Operation {
	private double number1;
	private double number2;

	Operation(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}


	public double getNumber1() {
		return number1;
	}

	public double getNumber2() {
		return number2;
	}
}
