package ch.bbw.pr.savecalculator;

/**
 * SaveCalculator
 * Rechnet 'vorsichtig' mit Zahlen.
 * Warnt, wenn etwas nicht geht
 *   
 * @author Peter Rutschmann
 * @version 0.0.1
 */
public class SaveCalculator {
	public int summe(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;

		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	private int summeprivate(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;

		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	protected int summeprotected(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;

		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}

	int summepkgprotected(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 + (long) summand2;

		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 + summand2;
	}


	//Noch un-safe Methoden, die müssen noch angepasst werden.
	public int subtraktion(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 - (long) summand2;
		if ( (value < Integer.MIN_VALUE) || (value > Integer.MAX_VALUE)) {
			throw new ArithmeticException();
		}
		return summand1 - summand2;
	}

	public int division(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 / (long) summand2;
		if (value > Integer.MAX_VALUE) {
			throw new ArithmeticException();
		}
		return summand1 / summand2;
	}

	public double multiplikation(int summand1, int summand2) throws ArithmeticException {
		long value = (long) summand1 *  (long) summand2;
		if ((value > Integer.MAX_VALUE) || (value < Integer.MIN_VALUE)){
			throw new ArithmeticException();
		}
		return summand1 * summand2;
	}
}


