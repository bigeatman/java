package dev.java.practice.ch13;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생 : " + Arrays.toString(course.getStudents()));
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		registerCourse(course);
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		registerCourse(course);
	}

	public WildCardExample() {
		Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		personCourse.add(new Person());
		personCourse.add(new Worker());
		personCourse.add(new Student());
		personCourse.add(new HighStudent());

		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker());

		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student());
		studentCourse.add(new HighStudent());

		Course<Student> highStudentCourse = new Course<Student>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent());

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();

		// registerCourseStudent(personCourse);
		// registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse);
		// registerCourseWorker(highStudentCourse);
	}
}
