package dev.java.practice.ch9;

public class A {

	public A() {
		System.out.println("A객체가 생상됨.");
	}

	class B {
		int field1;

		public B() {
			System.out.println("B객체가 생성됨.");
		}

		void method1() {

		}
	}

	static class C {
		int field1;

		static int field2;

		public C() {
			System.out.println("C객체가 생성됨.");
		}

		void method1() {

		}

		static void method2() {

		}
	}

	void method() {
		class D {
			int field1;

			public D() {
				System.out.println("D객체가 생성됨.");
			}

			void method1() {

			}
		}

		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
