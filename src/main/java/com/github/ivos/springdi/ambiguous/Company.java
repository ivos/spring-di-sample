package com.github.ivos.springdi.ambiguous;

import org.springframework.stereotype.Component;

@Component
public class Company extends AbstractParty {

	public Company() {
		super("company");
	}

}
