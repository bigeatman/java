package dev.java.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	private static final String DIRECTORY = System.getProperty("user.dir") + "\\src\\main\\java\\dev\\java\\practice";

	public static void main(String[] args) throws Exception {
		test();
//		try {
//			Class.forName(getLastChangedClass()).getConstructor(null).newInstance(null);
//		} catch (NoSuchMethodException e) {
//			Class.forName(getLastChangedClass()).getConstructor(String[].class).newInstance((Object) args);
//		}
	}

	private static void test() {

		Test a = new Test();
		a.aebc = 10;
		a.b = '2';
		a.c = "WTF";

		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> test = mapper.convertValue(a, Map.class);

		test.entrySet().forEach(e -> {
			System.out.println(e.getKey().getClass() + " " + e.getValue().getClass());
			System.out.println(e.getKey() + " " + e.getValue());
			System.out.println();
		});
	}

	public static class Test {
		public int aebc;
		public char b;
		public String c;
	}

	private static String getLastChangedClass() throws Exception {
		File home = new File(DIRECTORY);

		FileInfo info = new FileInfo();

		for (File directory : home.listFiles()) {
			File[] classFiles = directory.listFiles();

			if (classFiles == null) {
				continue;
			}

			compareFiles(info, directory, classFiles);
		}

		return info.lastClassName;
	}

	private static void compareFiles(FileInfo info, File directory, File[] classFiles) throws IOException {
		for (File classFile : classFiles) {
			Long lastModifiedTime = ((FileTime) Files.getAttribute(Paths.get(classFile.getPath()), "lastModifiedTime"))
					.toMillis();

			if (info.maxValue <= lastModifiedTime) {
				info.lastClassName = Main.class.getPackageName() + "." + directory.getName() + "."
						+ classFile.getName().replace(".java", "");
				info.maxValue = lastModifiedTime;
			}
		}
	}

	private static class FileInfo {
		String lastClassName;
		Long maxValue;

		public FileInfo() {
			lastClassName = null;
			maxValue = Long.valueOf(-1);
		}

	}
}
