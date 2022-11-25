package java7;

import java.lang.reflect.InvocationTargetException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionHandlingForReflectiveMethods {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandlingForReflectiveMethods.class);

	public static void main(String[] args) {
		beforeJava7();
		withJava7();
	}

	private static void withJava7() {
		try {
			Class.forName("java7.CatchingMultipleExceptions").getMethod("withJava7").invoke(null, new Object[] {});
		} catch (ReflectiveOperationException rex) {
			LOGGER.debug(rex.getMessage());
		}
	}

	private static void beforeJava7() {
		try {
			Class.forName("java7.CatchingMultipleExceptions").getMethod("withJava7").invoke(null, new Object[] {});
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| ClassNotFoundException e) {
			LOGGER.debug(e.getMessage());
		}
	}

}
