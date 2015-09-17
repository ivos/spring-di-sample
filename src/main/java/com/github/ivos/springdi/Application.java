package com.github.ivos.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.ivos.springdi.service.MessagePrinter;

public class Application {

	public static void main(String[] args) {
		new Application().run();
	}

	private void run() {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.register(ApplicationConfiguration.class);
			context.refresh();

			doWithContext(context);
		}
	}

	private void doWithContext(ApplicationContext context) {
		ApplicationProperties sampleProperties = context.getBean(ApplicationProperties.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		int runCount = sampleProperties.getRunCount();
		for (int i = 0; i < runCount; i++) {
			printer.printMessage();
		}
	}

}
