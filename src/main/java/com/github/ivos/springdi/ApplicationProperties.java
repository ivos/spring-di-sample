package com.github.ivos.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

	@Autowired
	private Environment env;

	public int getRunCount() {
		return Integer.valueOf(env.getProperty("run.count"));
	}

	public int getMaxNumber() {
		return Integer.valueOf(env.getProperty("max.number"));
	}

}
