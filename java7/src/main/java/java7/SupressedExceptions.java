package java7;

import java.util.logging.Level;
import java.util.logging.Logger;

import java7.resources.CustomDirtyResource;

public class SupressedExceptions {

	private static final Logger logger = Logger.getLogger(SupressedExceptions.class.getName());

	public static void main(String[] args) {

		try {
			beforeJava7();

		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		try {
			withJava7();

		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
			Throwable[] suppressedExceptions = e.getSuppressed();
			int numSupressed = suppressedExceptions.length;
			if (numSupressed > 0) {
				for (Throwable suppressedException : suppressedExceptions) {
					logger.log(Level.SEVERE, suppressedException.getMessage());
				}
			}

			}
		}
	

	private static void withJava7() throws Exception {
		try(CustomDirtyResource customDirtyResource = new CustomDirtyResource();){
			customDirtyResource.readFromResource();
		}
	}

	private static void beforeJava7() throws Exception {
		
		CustomDirtyResource cr = null;
		try {
			cr = new CustomDirtyResource();
			cr.readFromResource();
		} finally {
			cr.close();
			
		}

	}
}
