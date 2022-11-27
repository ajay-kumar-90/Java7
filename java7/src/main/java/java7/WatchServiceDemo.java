package java7;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceDemo {

	public static void main(String[] args) throws IOException {
		directoryWatchService();

	}

	private static void directoryWatchService() throws IOException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("D:\\watchService");
		WatchKey watchKey = path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
		boolean poll = true;
		while (poll) {
			for (WatchEvent<?> event : watchKey.pollEvents()) {
				System.out.println("Event Kind " + event.kind() + "- for the file " + event.context());
			}
			poll = watchKey.reset();
		}

	}

}
