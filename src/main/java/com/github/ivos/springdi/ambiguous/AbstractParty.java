package com.github.ivos.springdi.ambiguous;

public class AbstractParty implements Party {

	private final String name;

	public AbstractParty(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
