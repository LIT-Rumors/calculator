package edu.nd.tutorial.simplecalculator.operations;

import edu.nd.tutorial.simplecalculator.ui.ICalculationOperation;
import edu.nd.tutorial.simplecalculator.ui.SimpleCalculator;
import edu.nd.tutorial.simplecalculator.ui.SimpleCalculator.CalcAction;

public class OperationFactory {

	public static ICalculationOperation getOperation(CalcAction sub) {

		switch (sub) {
			case POW: return new PowOperation();
			case ADD: 
			case DIV:
			case MULT:
			case SUB: 

			default:
				return new NullOperation();
		}

	}

}
