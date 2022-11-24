package java7.resources;

public class CustomResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Close method inside CustomResouce");
	}
	
	public void readFromResource() {
		System.out.println("Reading data");
	}

}
