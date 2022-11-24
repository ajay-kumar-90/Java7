package java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java7.resources.CustomResource;

public class TryWithResources {

	public static void main(String[] args) throws Exception {

		beforeJava7();
		withJava7();
		withCustomResourceJava7();
	}

	private static void withCustomResourceJava7() throws Exception {

		try(CustomResource resource = new CustomResource();){
			resource.readFromResource();
		}
	}

	private static void withJava7() throws FileNotFoundException, IOException {
		try(BufferedReader br = new BufferedReader(new FileReader("D:/Java7.txt"));){
			String currentLine ;
			while((currentLine = br.readLine())!=null ) {
				System.out.println(currentLine);
			}
		}
	}

	private static void beforeJava7() throws IOException {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:/Java7.txt"));
			String currentLine; 
			while ((currentLine = br.readLine())!=null) {
				System.out.println(currentLine);
			}
			
		} finally {
			br.close();
		}
	}

}
