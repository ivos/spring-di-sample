package com.github.ivos.springdi.ambiguous;

import org.springframework.stereotype.Component;

@Component
public class Person extends AbstractParty {

	public Person() {
		super("person");
	}

}
