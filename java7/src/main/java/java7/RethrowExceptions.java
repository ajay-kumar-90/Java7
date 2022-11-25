package java7;

public class RethrowExceptions {

	public static void main(String[] args) throws Exception {
		//
		beforeJava7("First");
		withJava7("First");

	}

	private static void withJava7(String exceptionName) throws Exception {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}

		} catch (Exception e) {
			throw e;
		}

	}

	private static void beforeJava7(String exceptionName) throws FirstException, SecondException {
		try {
			if (exceptionName.equals("First")) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}

	}

	static class FirstException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = -3999037814431512257L;
	}

	static class SecondException extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 8813159459933458022L;

	}

}
