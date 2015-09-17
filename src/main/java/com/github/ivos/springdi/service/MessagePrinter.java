package com.github.ivos.springdi.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Autowired
	private OtherService otherService;

	public void printMessage() {
		System.out.println(getService().getMessage());
		otherService.go();
	}

	@PostConstruct
	public void init() {
		System.out.println("Inited " + this);
	}

	@PreDestroy
	public void destoy() {
		System.out.println("Destroying " + this);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public MessageService getService() {
		return applicationContext.getBean(MessageService.class);
	}

}
