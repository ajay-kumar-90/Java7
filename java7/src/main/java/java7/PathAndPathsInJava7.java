package java7;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndPathsInJava7 {

	private static String HOME_DIR = "D:\\";

	public static void main(String[] args) {
		buildPath();
	}

	private static void buildPath() {
		Path path = Paths.get(HOME_DIR, "java7", "Test.txt");
		Path fileName = path.getFileName();
		System.out.println("File Name is " + fileName.toString());
		System.out.println("File System is " + fileName.getFileSystem());
		System.out.println("File System Separator is" + fileName.getFileSystem().getSeparator());
		for (int i = 0; i < path.getNameCount(); i++) {
			Path subpath = path.getName(i);
			System.out.println("Path Location at index" + (i + 1) + "is " + subpath.toString());
		}
		System.out.println("Subpath is " + path.subpath(0, 2));
		System.out.println("Root Path is " + path.getRoot());
		System.out.println("Parent Path is " + path.getParent());
		System.out.println("Full Path is " + path.toString());

		Path redundantPath = Paths.get(HOME_DIR, "java7", ".", "Test.txt");
		System.out.println("Redundant path is " + redundantPath.toString());
		Path cleanPath = redundantPath.normalize();
		System.out.println("Clean Path is" + cleanPath.toString());

		URI uri = cleanPath.toUri();
		System.out.println("URI Path is " + uri.toString());
		System.out.println("Absolute Path is " + cleanPath.toAbsolutePath());

		Path partialPath = Paths.get(HOME_DIR, "java7");
		Path combinedPath = partialPath.resolve("Test.txt");
		System.out.println("Combined Path is " + combinedPath.toString());

		if (!partialPath.equals(combinedPath)) {
			System.out.println("Paths are not Equal");
		}


	}

}
