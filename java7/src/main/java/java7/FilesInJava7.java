package java7;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesInJava7 {

	private static String HOME_DIR = "D:\\";

	public static void main(String[] args) throws IOException {

		workingWithFilesInJava7();
	}

	private static void workingWithFilesInJava7() throws IOException {

		// Read file
		// 1. read all bytes
		// 2. read all lines

		Path path = Paths.get(HOME_DIR, "java7", "Test.txt");
		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes, StandardCharsets.UTF_8);
		System.out.println("Content of the File is " + content);

		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		for (String line : lines) {
			System.out.println("Content of the line is " + line);
		}

		// append line to same file
		String newLine = "I am learning Java 7 nio.File Features ";
		Files.write(path, newLine.getBytes(), StandardOpenOption.APPEND);

		// create new old path and old file
		Path newPath = Paths.get(HOME_DIR, "java7-8");
		Files.createDirectory(newPath);
		Path filePath = Paths.get(HOME_DIR, "java7-8", "Hello.txt");
		Files.createFile(filePath);

		// create another path - new filepath
		Path newFilePath = Paths.get(HOME_DIR, "java7-8", "Test.txt");
		InputStream source = Files.newInputStream(path);
		// copy - path --> new file path
		Files.copy(source, newFilePath);
		// copy - path --> old file path
		Files.copy(path, filePath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);

		Files.delete(newFilePath);
		boolean deleted = Files.deleteIfExists(newFilePath);
		System.out.println(deleted);
	}

}
