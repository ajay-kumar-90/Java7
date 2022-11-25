package java7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatchingMultipleExceptions {

	private static final Logger LOGGER = LoggerFactory.getLogger(CatchingMultipleExceptions.class);

	public static void main(String[] args) {
		beforeJava7();
		withJava7();

	}

	private static void withJava7() {
		int[] arr = { 1, 2, 3 };
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
			// TODO: handle exception
			LOGGER.info(ex.getMessage());
		}
	}

	private static void beforeJava7() {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (NullPointerException nex) {
			LOGGER.info(nex.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException aiox) {
			LOGGER.info(aiox.getMessage());
		}
	}
}
