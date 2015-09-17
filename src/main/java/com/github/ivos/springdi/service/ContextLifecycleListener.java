package com.github.ivos.springdi.service;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class ContextLifecycleListener implements Lifecycle {

	@Override
	public void start() {
		System.out.println("Context start");
	}

	@Override
	public void stop() {
		System.out.println("Context stop");
	}

	@Override
	public boolean isRunning() {
		System.out.println("Context is running call");
		return true;
	}

}
