package com.github.ivos.springdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.ivos.springdi.service.MessageService;

@Component
public class MessagePrinter {

	@Autowired
	private MessageService service;

	@Autowired
	private OtherService otherService;

	public void printMessage() {
		System.out.println(service.getMessage());
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

}
