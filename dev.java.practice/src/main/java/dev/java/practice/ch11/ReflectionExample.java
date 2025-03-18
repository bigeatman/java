package dev.java.practice.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {
	public ReflectionExample() throws ClassNotFoundException {
		Class<?> cls = Class.forName("dev.java.practice.ch6.Car");

		System.out.println("클래스명: " + cls.getName());
		System.out.println();

		System.out.println("생성자 정보 : ");
		Constructor<?>[] cons = cls.getConstructors();

		for (Constructor<?> con : cons) {
			System.out.print(con.getName() + "( ");

			Class<?>[] params = con.getParameterTypes();
			printParams(params);
		}

		System.out.println("\n필드 정보: ");
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}

		System.out.println("\n메서드 정보");
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			String access = Modifier.toString(method.getModifiers());

			if (access.isEmpty()) {
				access = "default";
			}

			System.out.print(access + " " + method.getName() + "( ");
			Class<?>[] params = method.getParameterTypes();
			printParams(params);
		}
	}

	private void printParams(Class<?>[] params) {
		for (Class<?> param : params) {
			System.out.print(param.getSimpleName() + " ");
		}

		System.out.println(")");
	}
}
