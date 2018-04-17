package own_exception;

public class MyException {

	public static void main(String[] args) {

		double[] radius = { 3.12, -23.455, 98.0, 120.56, -23456 };

		for (int i = 0; i < radius.length; i++) {
			try {
				double area = findAreaOfCircle(radius[i]);
				System.out.println("when radisu = " + radius[i] + " then area is " + area);
			} catch (NegativeNumberException e1) {
				e1.printStackTrace();
			}
		}

	}

	public static double findAreaOfCircle(double radius) throws NegativeNumberException {
		if (radius < 0) {
			throw new NegativeNumberException("Radius Can't be Negative!!");
		}
		return 3.1416 * radius * radius;
	}

	static class NegativeNumberException extends Exception {

		private static final long serialVersionUID = 1L;

		public NegativeNumberException(String message) {
			super(message);
		}

	}

}
