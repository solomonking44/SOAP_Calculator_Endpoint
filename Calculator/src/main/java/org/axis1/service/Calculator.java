package org.axis1.service;

public class Calculator implements ICalculator{
	@Override
	public int add(int numberOne, int numberTwo) {
		// TODO Auto-generated method stub
		return numberOne + numberTwo;
	}

	@Override
	public int subtract(int numberOne, int numberTwo) {
		// TODO Auto-generated method stub
		return numberOne - numberTwo;
	}

}
