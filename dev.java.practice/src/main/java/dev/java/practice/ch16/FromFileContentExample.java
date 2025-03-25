package dev.java.practice.ch16;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {
	public FromFileContentExample() throws IOException, URISyntaxException {
		Path path = Paths.get(this.getClass().getResource("/linedata.txt").toURI());

		Stream<String> stream;
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);
		System.out.println();
		stream.close();
	}
}
