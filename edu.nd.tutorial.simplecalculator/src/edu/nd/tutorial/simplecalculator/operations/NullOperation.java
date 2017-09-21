package edu.nd.tutorial.simplecalculator.operations;

import edu.nd.tutorial.simplecalculator.ui.ICalculationOperation;

public class NullOperation implements ICalculationOperation {

	@Override
	public String caclulate(String txt) {

		return "0";

	}

}
