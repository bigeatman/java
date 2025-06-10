package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	private static Pattern pattern = Pattern.compile("Source\\)\\r\\n(.+intbridge.+)");

	private static Map<String, Integer> resultMap = new ConcurrentHashMap<>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("test.log"));
		StringBuilder builder = new StringBuilder();

		while (scan.hasNext()) {
			String nextLine = scan.nextLine();
			builder.append(nextLine);
			builder.append("\r\n");

			if (nextLine.contains("\"catalina-exec-")) {
				findTopStackMethod(builder.toString());
				builder = new StringBuilder();
			}
		}

		for (Entry<String, Integer> entry : resultMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		scan.close();
	}

	private static void findTopStackMethod(String string) {
		Matcher matcher = pattern.matcher(string);

		if (matcher.find() == false) {
			return;
		}

		String find = matcher.group(1);
		Integer count = resultMap.get(find);

		if (count == null) {
			resultMap.put(find, 1);
		} else {
			resultMap.put(find, resultMap.get(find) + 1);
		}
	}
}
