package edu.nd.tutorial.simplecalculator.operations;

import edu.nd.tutorial.simplecalculator.ui.ICalculationOperation;

public class NullOperation implements ICalculationOperation {

	@Override
	public String caclulate(String txt) {
		String[] terms = txt.split("\\+|-|x|/");
		if (txt.contains("+")) {
			return Integer.parseInt(terms[0]) + Integer.parseInt(terms[1]) + "";
		}
		if (txt.contains("-")) {
			return Integer.parseInt(terms[0]) - Integer.parseInt(terms[1]) + "";
		}
		if (txt.contains("x")) {
			return Integer.parseInt(terms[0]) * Integer.parseInt(terms[1]) + "";
		}
		if (txt.contains("/")) {
			return Integer.parseInt(terms[0]) / Integer.parseInt(terms[1]) + "";
		}
		return "0";

	}

}
