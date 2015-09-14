package com.github.ivos.springdi.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class SampleMessageSource {

	@Autowired
	private MessageSource messageSource;

	public String getMessage(String code, Object... params) {
		return messageSource.getMessage(code, params, Locale.getDefault());
	}

}
