package edu.nd.tutorial.simplecalculator.operations;

import edu.nd.tutorial.simplecalculator.ui.ICalculationOperation;

public class PowOperation implements ICalculationOperation {

	
		@Override
		public String caclulate(String txt) {
			System.out.println("Power Operation Executed!");
			String[] terms = txt.split("\\^");
			if (terms.length == 2) {
				return Math.pow(Integer.parseInt(terms[0]), Integer.parseInt(terms[1]))+"";
			}
			return txt;

		}

}
