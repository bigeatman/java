package dev.java.practice.ch12;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public BeepPrintExample1() throws Exception {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("alert");
			Thread.sleep(500);
		}
	}
}
