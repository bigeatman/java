package dev.java.practice.ch16;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public FromDirectoryExample() throws URISyntaxException, IOException {
		Path path = Paths.get(FromDirectoryExample.class.getResource("/database.properties").toURI());
		Stream<String> stream = Files.lines(path);
		stream.forEach(System.out::println);
		stream.close();
	}
}
