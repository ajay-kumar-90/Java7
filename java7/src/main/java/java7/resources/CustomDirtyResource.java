package java7.resources;

public class CustomDirtyResource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		throw new NullPointerException("Null pointer exception thrown from close ()");
	}
	
	public void readFromResource() {
		throw new RuntimeException("Runtime Exception Thrown from read from Resource");
	}
	

}
