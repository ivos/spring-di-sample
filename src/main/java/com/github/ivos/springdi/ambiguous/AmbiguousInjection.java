package com.github.ivos.springdi.ambiguous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmbiguousInjection {

	@Autowired
	private Party person;
	// Look, @Autowired injects by name!
	// Brittle, rename the field and it breaks.

	public String getPartyName() {
		return person.getName();
	}

}
