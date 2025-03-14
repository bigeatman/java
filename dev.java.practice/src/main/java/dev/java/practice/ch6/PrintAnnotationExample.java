package dev.java.practice.ch6;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public PrintAnnotationExample() {
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				System.out.println(method.getName());
			}
		}
	}
}
