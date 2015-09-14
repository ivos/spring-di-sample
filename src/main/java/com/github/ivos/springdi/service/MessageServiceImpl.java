package com.github.ivos.springdi.service;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.ivos.springdi.ApplicationProperties;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private ApplicationProperties sampleProperties;

	@Autowired
	private SampleMessageSource messageSource;

	private int number;

	@Override
	public String getMessage() {
		return messageSource.getMessage("greet.message", number, this);
	}

	@PostConstruct
	public void init() {
		number = new Random().nextInt(sampleProperties.getMaxNumber());
		System.out.println("Inited " + this);
	}

}
